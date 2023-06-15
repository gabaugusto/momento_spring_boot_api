package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Funcionarios;
import api.momento.data.momento.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Marca como uma controladora REST ou como uma API
@RequestMapping("/funcionarios") //URL base dessa controladora
public class FuncionariosController {

    @Autowired//Instância um novo Objeto esse em especifico conecta com o Banco de dados.
    FuncionariosRepository dbConnection;

    @CrossOrigin
    @GetMapping("/todos")
    public List<Funcionarios> findAllRecords(){
        return dbConnection.findAll();
    }
}
