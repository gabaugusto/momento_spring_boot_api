package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "dependentes")
public class Dependentes {
    @Id
    int dependente_id;
    String nome;
    String parentesco;

    int funcionario_id;

    public int getDependente_id() {
        return dependente_id;
    }

    public void setDependente_id(int dependente_id) {
        this.dependente_id = dependente_id;
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
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
}
