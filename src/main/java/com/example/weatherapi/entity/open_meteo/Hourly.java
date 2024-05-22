
package com.example.weatherapi.entity.open_meteo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "temperature_2m",
    "relative_humidity_2m"
})

public class Hourly {

    @JsonProperty("time")
    private List<String> time;
    @JsonProperty("temperature_2m")
    private List<Double> temperature2m;
    @JsonProperty("relative_humidity_2m")
    private List<Long> relativeHumidity2m;

    @JsonProperty("time")
    public List<String> getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(List<String> time) {
        this.time = time;
    }

    @JsonProperty("temperature_2m")
    public List<Double> getTemperature2m() {
        return temperature2m;
    }

    @JsonProperty("temperature_2m")
    public void setTemperature2m(List<Double> temperature2m) {
        this.temperature2m = temperature2m;
    }

    @JsonProperty("relative_humidity_2m")
    public List<Long> getRelativeHumidity2m() {
        return relativeHumidity2m;
    }

    @JsonProperty("relative_humidity_2m")
    public void setRelativeHumidity2m(List<Long> relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hourly.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
        sb.append(',');
        sb.append("temperature2m");
        sb.append('=');
        sb.append(((this.temperature2m == null)?"<null>":this.temperature2m));
        sb.append(',');
        sb.append("relativeHumidity2m");
        sb.append('=');
        sb.append(((this.relativeHumidity2m == null)?"<null>":this.relativeHumidity2m));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
