package api.momento.data.momento.controllers;

import api.momento.data.momento.models.RelatorioEscritorio;
import api.momento.data.momento.repository.RelatorioEscritorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relatorio_escritorio")
public class RelatorioEscritorioController {


    @Autowired
    RelatorioEscritorioRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<RelatorioEscritorio> findAllRecords(){
        return dbConnection.findAll();
    }

    @CrossOrigin
    @GetMapping("/escritorios")
    public List<RelatorioEscritorio> findAllRecordsByGroup(){
        return dbConnection.findAllByGroup();
    }

}
