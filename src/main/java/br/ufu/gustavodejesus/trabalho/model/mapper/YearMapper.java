package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.YearResponse;
import br.ufu.gustavodejesus.trabalho.model.Year;

public class YearMapper implements IYearMapper {

    @Override
    public Year fromResponse(YearResponse yearResponse) {
        return new Year(
                yearResponse.getCode(),
                yearResponse.getName()
        );
    }
}
