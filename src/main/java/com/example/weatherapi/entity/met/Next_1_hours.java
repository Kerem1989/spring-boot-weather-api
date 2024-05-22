package com.example.weatherapi.entity.met;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Next_1_hours {

    @JsonProperty("summary")
    private Summary summary;
    @JsonProperty("details")
    private Details details;

    public Next_1_hours() {
    }

    public Next_1_hours(Summary summary, Details details) {
        this.summary = summary;
        this.details = details;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Next_1_hours{" +
                "summary=" + summary +
                ", details=" + details +
                '}';
    }
}
