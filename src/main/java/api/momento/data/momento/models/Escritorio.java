package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "escritorio")
public class Escritorio {
    @Id
    @Column(name = "escritorio_id", nullable = false)
    int escritorioId;
    String endereco;
    String cep;

    String cidade;

    String estado;

    @Column(name = "pais_id", nullable = false)
    String paisId;

    public int getEscritorioId() {
        return escritorioId;
    }

    public void setEscritorioId(int escritorioId) {
        this.escritorioId = escritorioId;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPaisId() {
        return paisId;
    }

    public void setPaisId(String paisId) {
        this.paisId = paisId;
    }
}
