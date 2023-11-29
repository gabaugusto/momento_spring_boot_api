package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "vendas_funcionario_performance")
public class PerformanceFuncionario {

    @Id
    @Column(name = "funcionario_id", nullable = false)
    int funcionarioId;

    @Column(name = "funcionario_nome", nullable = false)
    String funcionarioNome;

    @Column(name = "total_vendas", nullable = false)
    float totalVendas;

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }
}
