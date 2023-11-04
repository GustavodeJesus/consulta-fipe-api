package br.ufu.gustavodejesus.trabalho.pattern.di;

import br.ufu.gustavodejesus.trabalho.client.FipeApiClient;
import br.ufu.gustavodejesus.trabalho.model.mapper.BrandMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IBrandMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IModelMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IVehicleMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IYearMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.ModelMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.VehicleMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.YearMapper;
import br.ufu.gustavodejesus.trabalho.pattern.proxy.BrandDataSourceProxyCache;
import br.ufu.gustavodejesus.trabalho.pattern.proxy.IBrandDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectorModule {

    @Bean
    public IBrandMapper provideBrandMapper() {
        return new BrandMapper();
    }

    @Bean
    public IModelMapper provideModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public IYearMapper provideYearMapper() {
        return new YearMapper();
    }

    @Bean
    public IVehicleMapper provideVehicleMapper() {
        return new VehicleMapper();
    }

    @Bean
    public IBrandDataSource provideBrandDataSource(FipeApiClient apiClient) {
        return new BrandDataSourceProxyCache(apiClient);
    }
}
