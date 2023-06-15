package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Regiao;
import api.momento.data.momento.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regioes")
public class RegiaoController {
    @Autowired
    RegiaoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Regiao> findAllRecords(){
        return dbConnection.findAll();
    }
}
