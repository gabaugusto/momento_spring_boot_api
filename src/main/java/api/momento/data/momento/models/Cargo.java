package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "cargo")
public class Cargo {
    @Id
    @Column(name = "cargo_id", nullable = false)
    int cargoId; // <- Srpring tem alguns problemas criando métodos customizados utilizando underscore.

    @Column(name = "cargo_nome", nullable = false)
    String cargoNome;

    @Column(name = "min_salario", nullable = false)
    float minSalario;;

    @Column(name = "max_salario", nullable = false)
    float maxSalario;

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }

    public String getCargoNome() {
        return cargoNome;
    }

    public void setCargoNome(String cargoNome) {
        this.cargoNome = cargoNome;
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
}
