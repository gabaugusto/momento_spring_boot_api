package api.momento.data.momento.controllers;

import api.momento.data.momento.models.PerformanceFuncionario;
import api.momento.data.momento.repository.PerformanceFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/performance")
public class PerformanceFuncionarioController {

    @Autowired
    PerformanceFuncionarioRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<PerformanceFuncionario> findAllRecords(){
        return dbConnection.findAll();
    }

}
