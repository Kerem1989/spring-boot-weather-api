
package com.example.weatherapi.entity.met;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "precipitation_amount"
})
public class Details__3 {

    @JsonProperty("precipitation_amount")
    private Double precipitationAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("precipitation_amount")
    public Double getPrecipitationAmount() {
        return precipitationAmount;
    }

    @JsonProperty("precipitation_amount")
    public void setPrecipitationAmount(Double precipitationAmount) {
        this.precipitationAmount = precipitationAmount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Details__3{" +
                "precipitationAmount=" + precipitationAmount +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
