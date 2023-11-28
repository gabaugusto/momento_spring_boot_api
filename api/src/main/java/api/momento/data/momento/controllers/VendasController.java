package api.momento.data.momento.controllers;

import api.momento.data.momento.models.RelatorioVendas;
import api.momento.data.momento.repository.RelatorioVendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    RelatorioVendasRepository dbConnection;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public List<RelatorioVendas> findAllRecords(){
        return dbConnection.findAll();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "produto", method = RequestMethod.GET)
    public List<RelatorioVendas> vendasPorProduto() {
        return dbConnection.relatorioVendasProduto();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "data", method = RequestMethod.GET)
    public List<RelatorioVendas> vendasLinhaTempo() {
        return dbConnection.relatorioVendasLinhaTempo();
    }
}
