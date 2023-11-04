package br.ufu.gustavodejesus.trabalho.pattern.proxy;

import br.ufu.gustavodejesus.trabalho.client.FipeApiClient;
import br.ufu.gustavodejesus.trabalho.client.response.BrandResponse;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BrandDataSourceProxyCache implements IBrandDataSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BrandDataSourceProxyCache.class);

    IBrandDataSource dataSource;

    private List<BrandResponse> brandsSavedInCache = new ArrayList<>();
    private String vehicleTypeSavedInCache = "";

    public BrandDataSourceProxyCache(FipeApiClient apiClient) {
        this.dataSource = new BrandDataSourceRemote(apiClient);
    }

    @Override
    public List<BrandResponse> getBrands(String vehicleType) {

        if (brandsSavedInCache.isEmpty() || !vehicleType.equals(vehicleTypeSavedInCache)) {
            brandsSavedInCache = dataSource.getBrands(vehicleType);
            vehicleTypeSavedInCache = vehicleType;
            LOGGER.info("Requested api for vehicle type {}", vehicleTypeSavedInCache);
        }

        return brandsSavedInCache;
    }
}
