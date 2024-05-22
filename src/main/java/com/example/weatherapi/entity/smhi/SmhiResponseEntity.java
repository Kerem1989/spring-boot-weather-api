package com.example.weatherapi.entity.smhi;

import java.time.LocalDateTime;

public class SmhiResponseEntity {

    private LocalDateTime validTime;
    private double temperature;
    private double humidity;
    private String provider;

    public SmhiResponseEntity(LocalDateTime validTime, double temperature, double humidity, String provider) {
        this.validTime = validTime;
        this.temperature = temperature;
        this.humidity = humidity;
        this.provider = provider;
    }

    public SmhiResponseEntity(String validTime, double temperature, double humidity, String smhi) {
    }

    public SmhiResponseEntity() {

    }

    public LocalDateTime getValidTime() {
        return validTime;
    }

    public void setValidTime(LocalDateTime validTime) {
        this.validTime = validTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Weather in Liljeholmen: \n" +
                "\tTime = " + validTime + ",\n" +
                "\tTemperature = " + temperature + ",\n" +
                "\tHumidity = " + humidity + ",\n" +
                "\tProvider = '" + provider + "'\n";
    }
}
