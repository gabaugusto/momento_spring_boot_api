package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Escritorio;
import api.momento.data.momento.repository.EscritorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/escritorios")
public class EscritorioController {
    @Autowired
    EscritorioRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Escritorio> findAllRecords(){
        return dbConnection.findAll();
    }


    @RequestMapping(value = "buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Escritorio> searchById(@PathVariable int id) {
        return dbConnection.findEscritorioByescritorioId(id);
    }

    //Encontrar um único elemento por nome
    @RequestMapping(value = "buscar/cidade/{cidade}", method = RequestMethod.GET)
    public List<Escritorio> searchByName(@PathVariable String cidade) {
        return dbConnection.findEscritorioBycidade(cidade);
    }

    @RequestMapping(value = "buscar/pais/{paisId}", method = RequestMethod.GET)
    public List<Escritorio> searchByFuncionarioID(@PathVariable  String paisId) {
        return dbConnection.findEscritorioBypaisId(paisId);
    }

}
