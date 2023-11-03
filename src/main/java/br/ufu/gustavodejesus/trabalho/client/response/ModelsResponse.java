package br.ufu.gustavodejesus.trabalho.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ModelsResponse {
    @JsonProperty("modelos")
    private List<ModelResponse> models;

    public List<ModelResponse> getModels() {
        return models;
    }

    public void setModels(List<ModelResponse> models) {
        this.models = models;
    }
}
