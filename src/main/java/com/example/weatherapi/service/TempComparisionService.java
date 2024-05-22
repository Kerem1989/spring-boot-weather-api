package com.example.weatherapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempComparisionService {
    @Autowired
    LiljeholmenTempService liljeholmenTempService;

    public double calculateBestWeather() {
        double weatherLiljeholmenSMHI = liljeholmenTempService.getLiljeholmenTempFromSMHI().getTemperature();
        double weatherLiljeholmenMet = liljeholmenTempService.getLiljeholmenTempFromMet().getTemperature();
        double weatherLiljeholmenOpenMeteo = liljeholmenTempService.getLiljeholmenTempFromOpenMeteo().getTemperature();
        return findMax(weatherLiljeholmenSMHI, weatherLiljeholmenMet, weatherLiljeholmenOpenMeteo);
    }


    public double findMax(double d1, double d2, double d3) {
        return Math.max(Math.max(d1, d2), d3);
    }

    public Object displayBestWeather() {
        double bestWeatherFromMax = calculateBestWeather();
        Object bestWeatherObject = null;
        if (bestWeatherFromMax == liljeholmenTempService.getLiljeholmenTempFromMet().getTemperature()) {
            bestWeatherObject = liljeholmenTempService.getLiljeholmenTempFromMet();
        } else if (bestWeatherFromMax == liljeholmenTempService.getLiljeholmenTempFromSMHI().getTemperature()) {
            bestWeatherObject = liljeholmenTempService.getLiljeholmenTempFromSMHI();
        } else if (bestWeatherFromMax == liljeholmenTempService.getLiljeholmenTempFromOpenMeteo().getTemperature()) {
           bestWeatherObject = liljeholmenTempService.getLiljeholmenTempFromOpenMeteo();
        }
        return bestWeatherObject;
    }
}

