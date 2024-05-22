package com.example.weatherapi.entity.smhi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    @JsonProperty("approvedTime")
    private String approvedTime;
    @JsonProperty("referenceTime")
    private String referenceTime;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("timeSeries")
    private List<TimeSeries> timeSeries = new ArrayList<TimeSeries>();

    public WeatherData() {
    }

    public WeatherData(String approvedTime, String referenceTime, Geometry geometry, List<TimeSeries> timeSeries) {
        this.approvedTime = approvedTime;
        this.referenceTime = referenceTime;
        this.geometry = geometry;
        this.timeSeries = timeSeries;
    }

    public String getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(String approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getReferenceTime() {
        return referenceTime;
    }

    public void setReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public List<TimeSeries> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(List<TimeSeries> timeSeries) {
        this.timeSeries = timeSeries;
    }
}

