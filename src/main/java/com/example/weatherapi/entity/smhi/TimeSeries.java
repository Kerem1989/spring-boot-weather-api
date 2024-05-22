package com.example.weatherapi.entity.smhi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class TimeSeries {
    @JsonProperty("validTime")
    private String validTime;
    @JsonProperty("parameters")
    private List<Parameter> parameters = new ArrayList<Parameter>();

    public TimeSeries() {
    }

    public TimeSeries(String validTime, List<Parameter> parameters) {
        this.validTime = validTime;
        this.parameters = parameters;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
