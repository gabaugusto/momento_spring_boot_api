package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "regiao")
public class Regiao {
    @Id
    int regiao_id;
    String regiao_nome;

    public int getRegiao_id() {
        return regiao_id;
    }

    public void setRegiao_id(int regiao_id) {
        this.regiao_id = regiao_id;
    }

    public String getRegiao_nome() {
        return regiao_nome;
    }

    public void setRegiao_nome(String regiao_nome) {
        this.regiao_nome = regiao_nome;
    }
}
