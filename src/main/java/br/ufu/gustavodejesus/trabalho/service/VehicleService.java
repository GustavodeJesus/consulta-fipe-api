package br.ufu.gustavodejesus.trabalho.service;

import br.ufu.gustavodejesus.trabalho.client.FipeApiClient;
import br.ufu.gustavodejesus.trabalho.model.Brand;
import br.ufu.gustavodejesus.trabalho.model.FipeVehicle;
import br.ufu.gustavodejesus.trabalho.model.Model;
import br.ufu.gustavodejesus.trabalho.model.Year;
import br.ufu.gustavodejesus.trabalho.model.mapper.IBrandMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IModelMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IVehicleMapper;
import br.ufu.gustavodejesus.trabalho.model.mapper.IYearMapper;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicleMaker;
import br.ufu.gustavodejesus.trabalho.pattern.proxy.IBrandDataSource;
import br.ufu.gustavodejesus.trabalho.pattern.singleton.VehicleMakerSingleton;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VehicleService implements IVehicleService {
    private final IBrandMapper brandMapper;
    private final IModelMapper modelMapper;
    private final IYearMapper yearMapper;
    private final IVehicleMapper vehicleMapper;
    private final FipeApiClient fipeApiClient;
    private final IBrandDataSource dataSource;

    public VehicleService(
            IBrandMapper brandMapper,
            IModelMapper modelMapper,
            IYearMapper yearMapper,
            IVehicleMapper vehicleMapper,
            FipeApiClient fipeApiClient,
            IBrandDataSource dataSource) {
        this.brandMapper = brandMapper;
        this.modelMapper = modelMapper;
        this.yearMapper = yearMapper;
        this.vehicleMapper = vehicleMapper;
        this.fipeApiClient = fipeApiClient;
        this.dataSource = dataSource;
    }

    @Override
    public List<Brand> getBrands(String vehicleType) {
        return dataSource
                .getBrands(vehicleType)
                .stream()
                .map(brandMapper::fromResponse)
                .toList();
    }

    @Override
    public List<Model> getModelsByVehicleTypeAndBrandId(String vehicleType, int brandId) {
        return fipeApiClient.getModelsByVehicleTypeAndBrandId(vehicleType, brandId)
                .getModels()
                .stream()
                .map(modelMapper::fromResponse)
                .toList();
    }

    @Override
    public List<Year> getYearsByVehicleTypeAndBrandIdAndModelId(String vehicleType, int brandId, int modelId) {
        return fipeApiClient.getYearOfVehicle(
                        vehicleType,
                        brandId,
                        modelId
                ).stream()
                .map(yearMapper::fromResponse)
                .toList();
    }

    @Override
    public IVehicle getVehicleByTypeAndBrandAndModelAndYear(
            String vehicleType,
            int brandId,
            int modelId,
            String modelYear) {

        FipeVehicle fipeVehicle = vehicleMapper.fromResponse(fipeApiClient.getFipeInfo(
                vehicleType,
                brandId,
                modelId,
                modelYear)
        );

        IVehicleMaker instance = VehicleMakerSingleton.getInstance(fipeVehicle.getVehicleType());
        return instance.makeVehicle(fipeVehicle);
    }
}
