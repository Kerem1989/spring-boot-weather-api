
package com.example.weatherapi.entity.open_meteo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "temperature_2m",
    "relative_humidity_2m"
})

public class HourlyUnits {

    @JsonProperty("time")
    private String time;
    @JsonProperty("temperature_2m")
    private String temperature2m;
    @JsonProperty("relative_humidity_2m")
    private String relativeHumidity2m;

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("temperature_2m")
    public String getTemperature2m() {
        return temperature2m;
    }

    @JsonProperty("temperature_2m")
    public void setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
    }

    @JsonProperty("relative_humidity_2m")
    public String getRelativeHumidity2m() {
        return relativeHumidity2m;
    }

    @JsonProperty("relative_humidity_2m")
    public void setRelativeHumidity2m(String relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HourlyUnits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
