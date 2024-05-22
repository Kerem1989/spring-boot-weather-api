
package com.example.weatherapi.entity.met;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "summary",
    "details"
})
public class Next6Hours {

    @JsonProperty("summary")
    private Summary__2 summary;
    @JsonProperty("details")
    private Details__3 details;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("summary")
    public Summary__2 getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary__2 summary) {
        this.summary = summary;
    }

    @JsonProperty("details")
    public Details__3 getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(Details__3 details) {
        this.details = details;
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
