package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @Autowired
    CargoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Cargo> findAllRecords(){
        return dbConnection.findAll();
    }

    //Encontrar um único elemento por id
    @RequestMapping(value = "buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Cargo> searchById(@PathVariable int id) {
        return dbConnection.findCargoBycargoId(id);
    }

    //Encontrar um único elemento por nome
    @RequestMapping(value = "buscar/nome/{nome}", method = RequestMethod.GET)
    public Optional<Cargo> searchByName(@PathVariable String nome) {
        return dbConnection.findCargoBycargoNome(nome);
    }
}
