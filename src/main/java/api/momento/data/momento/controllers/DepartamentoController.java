package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Departamento;
import api.momento.data.momento.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    DepartamentoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Departamento> findAllRecords(){
        return dbConnection.findAll();
    }

    @RequestMapping(value = "buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Departamento> searchById(@PathVariable int id) {
        return dbConnection.findDepartamentoBydepartamentoId(id);
    }

    //Encontrar um único elemento por nome
    @RequestMapping(value = "buscar/nome/{nome}", method = RequestMethod.GET)
    public Optional<Departamento> searchByName(@PathVariable String nome) {
        return dbConnection.findDepartamentoBydepartamentoNome(nome);
    }
}
