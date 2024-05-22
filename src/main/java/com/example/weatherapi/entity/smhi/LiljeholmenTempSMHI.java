package com.example.weatherapi.entity.smhi;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class LiljeholmenTempSMHI {

    public SmhiResponseEntity getTemp() {
        WebClient client = WebClient.create();

        Mono<WeatherData> mono = client
                .get()
                .uri("https://opendata-download-metfcst.smhi.se/api/category/pmp3g/version/2/geotype/point/lon/18.0686/lat/59.3293/data.json")
                .retrieve()
                .bodyToMono(WeatherData.class);

        WeatherData weatherData = mono.block();
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime in24Hours = now.plusHours(24);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        TimeSeries forecastIn24Hours = null;
        long minDifference = Long.MAX_VALUE;

        for (TimeSeries s : weatherData.getTimeSeries()) {
            LocalDateTime forecastTime = LocalDateTime.parse(s.getValidTime(), formatter);
            long difference = Math.abs(Duration.between(forecastTime, in24Hours).toMinutes());
            if (difference < minDifference && forecastTime.isAfter(now)) {
                minDifference = difference;
                forecastIn24Hours = s;
            }
        }

        if (forecastIn24Hours == null) {
            return null;
        }

        double temperature = 0.0;
        double humidity = 0.0;

        for (Parameter parameter : forecastIn24Hours.getParameters()) {
            if ("t".equals(parameter.getName())) {
                temperature = parameter.getValues().get(0);
            } else if ("r".equals(parameter.getName())) {
                humidity = parameter.getValues().get(0);
            }
        }
        SmhiResponseEntity smhiResponseEntity = new SmhiResponseEntity();
        LocalDateTime validTime = LocalDateTime.parse(forecastIn24Hours.getValidTime(), formatter);
        smhiResponseEntity.setValidTime(validTime);
        smhiResponseEntity.setTemperature(temperature);
        smhiResponseEntity.setHumidity(humidity);
        smhiResponseEntity.setProvider("SMHI");
        return smhiResponseEntity;
    }
}
