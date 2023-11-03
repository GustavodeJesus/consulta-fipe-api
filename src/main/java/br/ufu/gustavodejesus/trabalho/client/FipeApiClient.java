package br.ufu.gustavodejesus.trabalho.client;

import br.ufu.gustavodejesus.trabalho.client.response.BrandResponse;
import br.ufu.gustavodejesus.trabalho.client.response.FipeVehicleResponse;
import br.ufu.gustavodejesus.trabalho.client.response.ModelsResponse;
import br.ufu.gustavodejesus.trabalho.client.response.YearResponse;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fipe-api", url = "https://parallelum.com.br/fipe/api/v1")
public interface FipeApiClient {

    @GetMapping(value = "/{vehicleType}/marcas", produces = "application/json")
    List<BrandResponse> getBrands(@PathVariable("vehicleType") String vehicleType);

    @GetMapping(value = "/{vehicleType}/marcas/{brandId}/modelos", produces = "application/json")
    ModelsResponse getModelsByVehicleTypeAndBrandId(
            @PathVariable("vehicleType") String vehicleType,
            @PathVariable("brandId") int brandId
    );

    @GetMapping(value = "/{vehicleType}/marcas/{brandId}/modelos/{modelId}/anos", produces = "application/json")
    List<YearResponse> getYearOfVehicle(
            @PathVariable("vehicleType") String vehicleType,
            @PathVariable("brandId") int brandId,
            @PathVariable("modelId") int modelId
    );

    @GetMapping(
            value = "/{vehicleType}/marcas/{brandId}/modelos/{modelId}/anos/{modelYear}",
            produces = "application/json")
    FipeVehicleResponse getFipeInfo(
            @PathVariable("vehicleType") String vehicleType,
            @PathVariable("brandId") int brandId,
            @PathVariable("modelId") int modelId,
            @PathVariable("modelYear") String modelYear
    );
}
