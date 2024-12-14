package pe.edu.cibertec.project_backoffice_efinal.response;

import pe.edu.cibertec.project_backoffice_efinal.dto.CarDto;
import pe.edu.cibertec.project_backoffice_efinal.entity.Car;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}
