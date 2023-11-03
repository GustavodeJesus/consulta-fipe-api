package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.BrandResponse;
import br.ufu.gustavodejesus.trabalho.model.Brand;

public interface IBrandMapper {
    Brand fromResponse(BrandResponse brandResponse);
}
