package com.example.weatherapi.entity.smhi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class Parameter {
    @JsonProperty("name")
    private String name;
    @JsonProperty("levelType")
    private String levelType;
    @JsonProperty("level")
    private int level;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("values")
    private List<Double> values = new ArrayList<Double>();

    public Parameter() {
    }

    public Parameter(String name, String levelType, int level, String unit, List<Double> values) {
        this.name = name;
        this.levelType = levelType;
        this.level = level;
        this.unit = unit;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Double> getValues() {
        return values;
    }

    public void setValues(List<Double> values) {
        this.values = values;
    }
}

