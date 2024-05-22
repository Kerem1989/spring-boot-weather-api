package com.example.weatherapi.entity.smhi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    @JsonProperty("type")
    private String type;
    @JsonProperty("coordinates")
    private List<List<Double>> coordinates = new ArrayList<List<Double>>();

    public Geometry() {
    }

    public Geometry(String type, List<List<Double>> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<List<Double>> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
    }
}
