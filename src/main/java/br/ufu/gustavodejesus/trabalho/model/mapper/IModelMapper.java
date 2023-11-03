package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.ModelResponse;
import br.ufu.gustavodejesus.trabalho.model.Model;

public interface IModelMapper {
    Model fromResponse(ModelResponse modelResponse);
}
