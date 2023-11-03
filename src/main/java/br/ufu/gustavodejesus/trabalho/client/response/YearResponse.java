package br.ufu.gustavodejesus.trabalho.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YearResponse {
    @JsonProperty("codigo")
    private String code;
    @JsonProperty("nome")
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
