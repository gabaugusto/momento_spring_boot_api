package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.models.Dependentes;
import api.momento.data.momento.repository.DependentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dependentes")
public class DependentesController {
    @Autowired
    DependentesRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Dependentes> findAllRecords(){
        return dbConnection.findAll();
    }

    @RequestMapping(value = "buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Dependentes> searchById(@PathVariable int id) {
        return dbConnection.findDependentesBydependenteId(id);
    }

    //Encontrar um único elemento por nome
    @RequestMapping(value = "nome/{nome}", method = RequestMethod.GET)
    public Optional<Dependentes> searchByName(@PathVariable String nome) {
        return dbConnection.findDependentesBynome(nome);
    }

    @RequestMapping(value = "funcionario/{id}", method = RequestMethod.GET)
    public List<Dependentes> searchByFuncionarioID(@PathVariable  int id) {
        return dbConnection.findDependentesByfuncionarioId(id);
    }
}
