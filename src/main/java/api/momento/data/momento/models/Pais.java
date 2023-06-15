package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "pais")
public class Pais {
    @Id
    String pais_id;
    String pais_nome;
    int regiao_id;

    public String getPais_id() {
        return pais_id;
    }

    public void setPais_id(String pais_id) {
        this.pais_id = pais_id;
    }

    public String getPais_nome() {
        return pais_nome;
    }

    public void setPais_nome(String pais_nome) {
        this.pais_nome = pais_nome;
    }

    public int getRegiao_id() {
        return regiao_id;
    }

    public void setRegiao_id(int regiao_id) {
        this.regiao_id = regiao_id;
    }
}
