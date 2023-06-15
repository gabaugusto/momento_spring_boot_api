package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Dependentes;
import api.momento.data.momento.repository.DependentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dependentes")
public class DependentesController {
    @Autowired
    DependentesRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Dependentes> findAllRecords(){
        return dbConnection.findAll();
    }
}
