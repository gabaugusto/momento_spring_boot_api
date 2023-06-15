package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    CargoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Cargo> findAllRecords(){
        return dbConnection.findAll();
    }
}
