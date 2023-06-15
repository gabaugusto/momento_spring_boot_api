package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Regiao;
import api.momento.data.momento.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/regioes")
public class RegiaoController {
    @Autowired
    RegiaoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Regiao> findAllRecords(){
        return dbConnection.findAll();
    }

    //Encontrar um único elemento por id
    @RequestMapping(value = "buscar/id/{id}", method = RequestMethod.GET)
    public Optional<Regiao> searchById(@PathVariable int id) {
        return dbConnection.findCargoByregiaoId(id);
    }

    //Encontrar um único elemento por nome
    @RequestMapping(value = "buscar/nome/{nome}", method = RequestMethod.GET)
    public Optional<Regiao> searchByName(@PathVariable String nome) {
        return dbConnection.findCargoByregiaoNome(nome);
    }
}
