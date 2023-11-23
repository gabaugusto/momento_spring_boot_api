package api.momento.data.momento.controllers;

import api.momento.data.momento.models.DadosFuncionarios;
import api.momento.data.momento.repository.DadosFuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Marca como uma controladora REST ou como uma API
@RequestMapping("/d_funcionarios") //URL base dessa controladora
public class DadosFuncionariosController {

    @Autowired//Instância um novo Objeto esse em especifico conecta com o Banco de dados.
    DadosFuncionariosRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<DadosFuncionarios> findAllRecords(){
        return dbConnection.findAll();
    }
}
