package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "dependentes")
public class Dependentes {
    @Id
    @Column(name = "dependente_id", nullable = false)
    int dependenteId;
    String nome;
    String parentesco;
    @Column(name = "funcionario_id", nullable = false)
    int funcionarioId;

    public int getDependente_id() {
        return dependenteId;
    }

    public void setDependente_id(int dependente_id) {
        this.dependenteId = dependente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getFuncionario_id() {
        return funcionarioId;
    }

    public void setFuncionario_id(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
}
