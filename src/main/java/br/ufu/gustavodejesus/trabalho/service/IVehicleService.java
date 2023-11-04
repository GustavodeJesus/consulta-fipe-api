package br.ufu.gustavodejesus.trabalho.service;

import br.ufu.gustavodejesus.trabalho.model.Brand;
import br.ufu.gustavodejesus.trabalho.model.Model;
import br.ufu.gustavodejesus.trabalho.model.Year;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import java.util.List;

public interface IVehicleService {
    List<Brand> getBrands(String vehicleType);

    List<Model> getModelsByVehicleTypeAndBrandId(
            String vehicleType,
            int brandId
    );

    List<Year> getYearsByVehicleTypeAndBrandIdAndModelId(
            String vehicleType,
            int brandId,
            int modelId
    );

    IVehicle getVehicleByTypeAndBrandAndModelAndYear(
            String vehicleType,
            int brandId,
            int modelId,
            String modelYear
    );

    List<IVehicle> getVehiclesViewed();
}
