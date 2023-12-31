package api.momento.data.momento.controllers;

import api.momento.data.momento.models.Funcionarios;
import api.momento.data.momento.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController//Marca como uma controladora REST ou como uma API
@RequestMapping("/funcionarios") //URL base dessa controladora
public class FuncionariosController {

    @Autowired//Instância um novo Objeto esse em especifico conecta com o Banco de dados.
    FuncionariosRepository dbConnection;

    @CrossOrigin
    @GetMapping("/")
    public List<Funcionarios> findAllRecords(){
        return dbConnection.findAll();
    }


    //Encontrar um único elemento por id
    @CrossOrigin
    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public Optional<Funcionarios> searchById(@PathVariable int id) {
        return dbConnection.findFuncionariosByfuncionarioId(id);
    }

    //Encontrar um único elemento por nome
    /*
    @CrossOrigin
    @RequestMapping(value = "nome/{nome}", method = RequestMethod.GET)
    public Optional<Funcionarios> searchByName(@PathVariable String nome) {
        return dbConnection.findFuncionariosBynome(nome);
    } */

    @RequestMapping(value = "email/{email}", method = RequestMethod.GET)
    @CrossOrigin
    public Optional<Funcionarios> searchByEmail(@PathVariable String email) {
        return dbConnection.findFuncionariosByemail(email);
    }

    @RequestMapping(value = "departamento/{id}", method = RequestMethod.GET)
    @CrossOrigin
    public List<Funcionarios> searchByDepartament(@PathVariable int id) {
        return dbConnection.findFuncionariosBydepartamentoId(id);
    }
}
