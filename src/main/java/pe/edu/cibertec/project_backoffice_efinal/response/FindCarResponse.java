package pe.edu.cibertec.project_backoffice_efinal.response;

import pe.edu.cibertec.project_backoffice_efinal.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto car) {
}
