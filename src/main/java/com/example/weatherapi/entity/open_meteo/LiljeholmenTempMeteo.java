package com.example.weatherapi.entity.open_meteo;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class LiljeholmenTempMeteo {

    public MeteoResponseEntity getTemp() {
        WebClient client = WebClient.create();

        Mono<Meteo> mono = client
                .get()
                .uri("https://api.open-meteo.com/v1/forecast?latitude=59.3094&longitude=18.0034&hourly=temperature_2m,relative_humidity_2m")
                .retrieve()
                .bodyToMono(Meteo.class);

        Meteo meteo = mono.block();
        double temperature = -260;
        MeteoResponseEntity forecast = new MeteoResponseEntity();


        if (meteo != null && meteo.getHourly() != null) {
            List<String> times = meteo.getHourly().getTime();
            List<Double> temperatures = meteo.getHourly().getTemperature2m();
            List<Long> humidities = meteo.getHourly().getRelativeHumidity2m();

            if (times != null && !times.isEmpty() && temperatures != null && !temperatures.isEmpty() && humidities != null && !humidities.isEmpty()) {

                LocalDateTime now = LocalDateTime.now();
                LocalDateTime targetTime = now.plusHours(24);

                for (int i = 0; i < times.size(); i++) {
                    LocalDateTime time = LocalDateTime.parse(times.get(i), DateTimeFormatter.ISO_DATE_TIME);
                    if (!time.isBefore(targetTime)) {
                        temperature = temperatures.get(i);
                        forecast.setValidTime(targetTime);
                        forecast.setHumidity(humidities.get(i));
                        forecast.setTemperature(temperature);
                        forecast.setProvider("Meteo");
                        break;
                    }
                }
            } else {
                System.out.println("No current weather data available.");
            }
        } else {
            System.out.println("No current weather data available.");
        }
        return forecast;
    }

}