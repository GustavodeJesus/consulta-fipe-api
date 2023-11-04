package br.ufu.gustavodejesus.trabalho.pattern.proxy;

import br.ufu.gustavodejesus.trabalho.client.FipeApiClient;
import br.ufu.gustavodejesus.trabalho.client.response.BrandResponse;
import java.util.List;

public class BrandDataSourceRemote implements IBrandDataSource {

    private final FipeApiClient api;

    public BrandDataSourceRemote(FipeApiClient api) {
        this.api = api;
    }

    @Override
    public List<BrandResponse> getBrands(String vehicleType) {
        return api.getBrands(vehicleType);
    }
}
