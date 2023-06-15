package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "pais")
public class Pais {
    @Id
    @Column(name = "pais_id", nullable = false)
    String paisId;

    @Column(name = "pais_nome", nullable = false)
    String paisNome;
    @Column(name = "regiao_id", nullable = false)
    int regiaoId;

    public String getPaisId() {
        return paisId;
    }

    public void setPaisId(String paisId) {
        this.paisId = paisId;
    }

    public String getPaisNome() {
        return paisNome;
    }

    public void setPaisNome(String paisNome) {
        this.paisNome = paisNome;
    }

    public int getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(int regiaoId) {
        this.regiaoId = regiaoId;
    }
}
