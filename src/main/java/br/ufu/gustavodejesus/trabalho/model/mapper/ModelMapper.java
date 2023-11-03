package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.ModelResponse;
import br.ufu.gustavodejesus.trabalho.model.Model;

public class ModelMapper implements IModelMapper {

    @Override
    public Model fromResponse(ModelResponse modelResponse) {
        return new Model(
                modelResponse.getCode(),
                modelResponse.getName()
        );
    }
}
