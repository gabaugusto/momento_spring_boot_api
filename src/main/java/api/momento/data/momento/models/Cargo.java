package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "cargo")
public class Cargo {
    @Id
    int cargo_id;
    String cargo_nome;

    float min_salario;

    float max_salario;

    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int cargo_id) {
        this.cargo_id = cargo_id;
    }

    public String getCargo_nome() {
        return cargo_nome;
    }

    public void setCargo_nome(String cargo_nome) {
        this.cargo_nome = cargo_nome;
    }

    public float getMin_salario() {
        return min_salario;
    }

    public void setMin_salario(float min_salario) {
        this.min_salario = min_salario;
    }

    public float getMax_salario() {
        return max_salario;
    }

    public void setMax_salario(float max_salario) {
        this.max_salario = max_salario;
    }
}
