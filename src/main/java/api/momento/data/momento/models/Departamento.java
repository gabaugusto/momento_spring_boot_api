package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "departamento")
public class Departamento {
    @Id
    int departamento_id;
    String departamento_nome;
    int escritorio_id;

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getDepartamento_nome() {
        return departamento_nome;
    }

    public void setDepartamento_nome(String departamento_nome) {
        this.departamento_nome = departamento_nome;
    }

    public int getEscritorio_id() {
        return escritorio_id;
    }

    public void setEscritorio_id(int escritorio_id) {
        this.escritorio_id = escritorio_id;
    }
}
