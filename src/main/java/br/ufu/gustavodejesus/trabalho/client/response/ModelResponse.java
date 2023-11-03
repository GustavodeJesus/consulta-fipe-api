package br.ufu.gustavodejesus.trabalho.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelResponse {
    @JsonProperty("codigo")
    private int code;
    @JsonProperty("nome")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
