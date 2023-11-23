package api.momento.data.momento.controllers;
import api.momento.data.momento.models.RelatorioVendas;
import api.momento.data.momento.repository.RelatorioVendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    RelatorioVendasRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<RelatorioVendas> findAllRecords(){
        return dbConnection.findAll();
    }
}
