package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Pais;
import api.momento.data.momento.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    PaisRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Pais> findAllRecords(){
        return dbConnection.findAll();
    }

}
