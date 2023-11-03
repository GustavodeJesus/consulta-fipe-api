package br.ufu.gustavodejesus.trabalho.model.mapper;

import br.ufu.gustavodejesus.trabalho.client.response.BrandResponse;
import br.ufu.gustavodejesus.trabalho.model.Brand;

public class BrandMapper implements IBrandMapper {
    @Override
    public Brand fromResponse(BrandResponse brandResponse) {
        return new Brand(
                brandResponse.getCode(),
                brandResponse.getName()
        );
    }
}
