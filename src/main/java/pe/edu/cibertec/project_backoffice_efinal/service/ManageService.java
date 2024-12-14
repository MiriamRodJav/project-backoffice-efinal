package pe.edu.cibertec.project_backoffice_efinal.service;

import pe.edu.cibertec.project_backoffice_efinal.dto.CarDetailDto;
import pe.edu.cibertec.project_backoffice_efinal.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    //La capa de servicios no maneja un control de excepciones porque los propaga

    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto carDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarDetailDto carDetailDto) throws Exception;
}
