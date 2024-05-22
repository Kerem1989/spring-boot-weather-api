
package com.example.weatherapi.entity.met;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instant",
    "next_12_hours",
    "next_1_hours",
    "next_6_hours"
})
public class Data {

    @JsonProperty("instant")
    private Instant instant;
    @JsonProperty("next_12_hours")
    private Next12Hours next12Hours;
    @JsonProperty("next_1_hours")
    private Next1Hours next1Hours;
    @JsonProperty("next_6_hours")
    private Next6Hours next6Hours;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("instant")
    public Instant getInstant() {
        return instant;
    }

    @JsonProperty("instant")
    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @JsonProperty("next_12_hours")
    public Next12Hours getNext12Hours() {
        return next12Hours;
    }

    @JsonProperty("next_12_hours")
    public void setNext12Hours(Next12Hours next12Hours) {
        this.next12Hours = next12Hours;
    }

    @JsonProperty("next_1_hours")
    public Next1Hours getNext1Hours() {
        return next1Hours;
    }

    @JsonProperty("next_1_hours")
    public void setNext1Hours(Next1Hours next1Hours) {
        this.next1Hours = next1Hours;
    }

    @JsonProperty("next_6_hours")
    public Next6Hours getNext6Hours() {
        return next6Hours;
    }

    @JsonProperty("next_6_hours")
    public void setNext6Hours(Next6Hours next6Hours) {
        this.next6Hours = next6Hours;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
