package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.ModelResponse;
import br.ufu.gustavodejesus.trabalho.client.response.YearResponse;
import br.ufu.gustavodejesus.trabalho.model.Model;
import br.ufu.gustavodejesus.trabalho.model.Year;

public interface IYearMapper {
    Year fromResponse(YearResponse yearResponse);
}
