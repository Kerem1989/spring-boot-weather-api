package com.example.weatherapi.entity.met;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    @Service
    public class LiljeholmenTempMet {
        public METResponseEntity getTemp() {
            WebClient client = WebClient.create();

            Mono<Met> mono = client
                    .get()
                    .uri("https://api.met.no/weatherapi/locationforecast/2.0/compact?lat=59.3110&lon=18.030")
                    .retrieve()
                    .bodyToMono(Met.class);

            Met met = mono.block();
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime in24Hours = now.plusHours(24);
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

            Timeseries forecastIn24Hours = findclosestForecast(met, formatter, in24Hours);
            return setMetEntity(forecastIn24Hours);
        }

        public Timeseries findclosestForecast(Met met, DateTimeFormatter formatter, LocalDateTime in24Hours){
            Timeseries forecastIn24Hours = null;
            long minDifference = Long.MAX_VALUE;
            for (Timeseries s : met.getProperties().getTimeseries()) {
                LocalDateTime forecastTime = LocalDateTime.parse(s.getTime(), formatter);
                long difference = Math.abs(Duration.between(forecastTime, in24Hours).toMinutes());
                if (difference < minDifference) {
                    minDifference = difference;
                    forecastIn24Hours = s;
                }
            }
            return forecastIn24Hours;

        }

        public METResponseEntity setMetEntity(Timeseries forecastIn24Hours) {
            METResponseEntity forecast = new METResponseEntity();
            if (forecastIn24Hours != null) {
                forecast.setProvider("MET");
                forecast.setValidTime(forecastIn24Hours.getTime());
                forecast.setTemperature(forecastIn24Hours.getData().getInstant().getDetails().getAirTemperature());
                forecast.setHumidity(forecastIn24Hours.getData().getInstant().getDetails().getRelativeHumidity());

            }
            return forecast;
        }
    }
