package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "dados_funcionarios")
public class DadosFuncionarios {

    @Id
    @Column(name = "funcionario_id", nullable = false)
    int funcionarioId;
    @Column(name = "funcionario_nome", nullable = false)
    String funcionarioNome;

    String telefone;

    String email;

    @Column(name = "data_contratacao", nullable = false)
    Date dataContratacao;

    float salario;

    String cargo;

    @Column(name = "min_salario", nullable = false)
    float minSalario;

    @Column(name = "max_salario", nullable = false)
    float maxSalario;

    String departamento;
    String escritorio;

    String endereco;
    String pais;
    String regiao;

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getMinSalario() {
        return minSalario;
    }

    public void setMinSalario(float minSalario) {
        this.minSalario = minSalario;
    }

    public float getMaxSalario() {
        return maxSalario;
    }

    public void setMaxSalario(float maxSalario) {
        this.maxSalario = maxSalario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(String escritorio) {
        this.escritorio = escritorio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
