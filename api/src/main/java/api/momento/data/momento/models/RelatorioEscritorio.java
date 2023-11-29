package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "custos_escritorios")
public class RelatorioEscritorio {

    @Id
    @Column(name = "suprimento_id")
    String suprimentoId;

    @Column(name = "suprimento_nome")
    String suprimentoNome;

    int quantidade;

    float custo;

    @Column(name = "escritorio_nome")
    String escritorioNome;

    public String getSuprimentoNome() {
        return suprimentoNome;
    }

    public void setSuprimentoNome(String suprimentoNome) {
        this.suprimentoNome = suprimentoNome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getEscritorioNome() {
        return escritorioNome;
    }

    public void setEscritorioNome(String escritorioNome) {
        this.escritorioNome = escritorioNome;
    }
}
