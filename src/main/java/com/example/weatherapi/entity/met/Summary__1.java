
package com.example.weatherapi.entity.met;

import com.fasterxml.jackson.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "symbol_code"
})
public class Summary__1 {

    @JsonProperty("symbol_code")
    private String symbolCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("symbol_code")
    public String getSymbolCode() {
        return symbolCode;
    }

    @JsonProperty("symbol_code")
    public void setSymbolCode(String symbolCode) {
        this.symbolCode = symbolCode;
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
