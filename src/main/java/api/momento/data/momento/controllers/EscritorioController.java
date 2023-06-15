package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Escritorio;
import api.momento.data.momento.repository.EscritorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/escritorios")
public class EscritorioController {
    @Autowired
    EscritorioRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Escritorio> findAllRecords(){
        return dbConnection.findAll();
    }
}
