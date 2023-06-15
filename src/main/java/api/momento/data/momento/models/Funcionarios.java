package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "funcionarios") //Da nome a uma tabela ou utiliza uma table existente, caso seja existente todos os campos - devem ser identicos (classe e tabela)
public class Funcionarios {

    @Id
    int funcionario_id;
    String nome;
    String email;
    String senha;
    String telefone;
    Date data_contratacao;
    int cargo_id;
    Float salario;

    int gerente_id;
    int departamento_id;

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int ocupacao_id) {
        this.cargo_id = ocupacao_id;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public int getGerente_id() {
        return gerente_id;
    }

    public void setGerente_id(int gerente_id) {
        this.gerente_id = gerente_id;
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }
}
