package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "departamento")
public class Departamento {
    @Id
    @Column(name = "departamento_id", nullable = false)
    int departamentoId;
    @Column(name = "departamento_nome", nullable = false)
    String departamentoNome;

    @Column(name = "escritorio_id", nullable = false)
    int escritorioId;

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getDepartamentoNome() {
        return departamentoNome;
    }

    public void setDepartamentoNome(String departamentoNome) {
        this.departamentoNome = departamentoNome;
    }

    public int getEscritorioId() {
        return escritorioId;
    }

    public void setEscritorioId(int escritorioId) {
        this.escritorioId = escritorioId;
    }
}
