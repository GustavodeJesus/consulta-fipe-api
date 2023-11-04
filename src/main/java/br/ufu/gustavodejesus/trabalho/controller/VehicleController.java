package br.ufu.gustavodejesus.trabalho.controller;

import br.ufu.gustavodejesus.trabalho.model.Brand;
import br.ufu.gustavodejesus.trabalho.model.Model;
import br.ufu.gustavodejesus.trabalho.model.Year;
import br.ufu.gustavodejesus.trabalho.pattern.factory.IVehicle;
import br.ufu.gustavodejesus.trabalho.service.IVehicleService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/fipe")
public class VehicleController {

    private final IVehicleService vehicleService;

    public VehicleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/{vehicleType}/brands")
    public List<Brand> getBrandsByVehicleType(
            @PathVariable("vehicleType") String vehicleType) {
        return vehicleService.getBrands(vehicleType);
    }

    @GetMapping("/{vehicleType}/brands/{brandId}/models")
    public List<Model> getModelsByVehicleTypeAndBrandId(
            @PathVariable("vehicleType") String vehicleType,
            @PathVariable("brandId") int brandId
    ) {
        return vehicleService.getModelsByVehicleTypeAndBrandId(vehicleType, brandId);
    }

    @GetMapping("/{vehicleType}/brands/{brandId}/models/{modelId}/years")
    public List<Year> getYearsByVehicleTypeAndBrandIdAndModelId(
            @PathVariable("vehicleType") String vehicleType,
            @PathVariable("brandId") int brandId,
            @PathVariable("modelId") int modelId
    ) {
        return vehicleService.getYearsByVehicleTypeAndBrandIdAndModelId(vehicleType, brandId, modelId);
    }

    @GetMapping("/{vehicleType}/brands/{brandId}/models/{modelId}/years/{modelYear}")
    public IVehicle getVehicleByTypeAndBrandAndModelAndYear(
            @PathVariable("vehicleType") String vehicleType,
            @PathVariable("brandId") int brandId,
            @PathVariable("modelId") int modelId,
            @PathVariable("modelYear") String modelYear
    ) {
        return vehicleService.getVehicleByTypeAndBrandAndModelAndYear(vehicleType, brandId, modelId, modelYear);
    }

    @GetMapping("/vehicles-viewed")
    public List<IVehicle> getVehiclesViewed() {
        return vehicleService.getVehiclesViewed();
    }
}
