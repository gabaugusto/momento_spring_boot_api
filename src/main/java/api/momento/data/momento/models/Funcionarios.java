package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "funcionarios") //Da nome a uma tabela ou utiliza uma table existente, caso seja existente todos os campos - devem ser identicos (classe e tabela)
public class Funcionarios {

    @Id
    @Column(name = "funcionario_id", nullable = false)
    int funcionarioId; // <- Srpring tem alguns problemas criando métodos customizados utilizando underscore, então, renomeamos essa coluna dentro do Spring

    String nome;

    String email;

    String senha;

    String telefone;
    @Column(name = "data_contratacao")
    Date dataContratacao;

    @Column(name = "cargo_id", nullable = false)
    int cargoId; // <- Srpring tem alguns problemas criando métodos customizados utilizando underscore, então, renomeamos essa coluna dentro do Spring

    Float salario;

    @Column(name = "gerente_id", nullable = false)
    int gerenteId;

    @Column(name = "departamento_id", nullable = false)
    int departamentoId;

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
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

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public int getGerenteId() {
        return gerenteId;
    }

    public void setGerenteId(int gerenteId) {
        this.gerenteId = gerenteId;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }
}
