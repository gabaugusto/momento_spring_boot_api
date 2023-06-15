package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.models.Departamento;
import api.momento.data.momento.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    DepartamentoRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Departamento> findAllRecords(){
        return dbConnection.findAll();
    }
}
