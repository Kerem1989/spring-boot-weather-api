package com.example.weatherapi.entity.met;

public class METResponseEntity {

    private String validTime;
    private double airTemperature;
    private double relativeHumidity;
    private String provider;

    public METResponseEntity() {
    }

    public METResponseEntity(String validTime, double airTemperature, double relativeHumidity, String provider) {
        this.validTime = validTime;
        this.airTemperature = airTemperature;
        this.relativeHumidity = relativeHumidity;
        this.provider = provider;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public double getTemperature() {
        return airTemperature;
    }

    public void setTemperature(double temperature) {
        this.airTemperature = temperature;
    }

    public double getHumidity() {
        return relativeHumidity;
    }

    public void setHumidity(double humidity) {
        this.relativeHumidity = humidity;
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
                "\tTemperature = " + airTemperature + ",\n" +
                "\tHumidity = " + relativeHumidity + ",\n" +
                "\tProvider = '" + provider + "'\n";
    }
}
