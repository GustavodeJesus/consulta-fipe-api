package br.ufu.gustavodejesus.trabalho.pattern.proxy;

import br.ufu.gustavodejesus.trabalho.client.response.BrandResponse;
import java.util.List;

public interface IBrandDataSource {
    List<BrandResponse> getBrands(String vehicleType);
}
