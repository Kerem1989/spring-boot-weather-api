package com.example.weatherapi.entity.met;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Next_12_hours {
    @JsonProperty("summary")
    private Summary summary;

    public Next_12_hours() {
    }

    public Next_12_hours(Summary summary) {
        this.summary = summary;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Next_12_hours{" +
                "summary=" + summary +
                '}';
    }
}
