package api.momento.data.momento.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "relatorio_vendas")
public class RelatorioVendas {

    @Id
    int ticket;
    @Column(name = "quantidade_vendida", nullable = false)
    int quantidadeVendida;
    String produto;

    @Column(name = "produto_id", nullable = false)
    int produtoId;

    @Column(name = "preco_unitario", nullable = false)
    Float precoUnitario;

    @Column(name = "venda_data", nullable = false)
    Date vendaData;

    @Column(name = "funcionario_id", nullable = false)
    int funcionarioId;

    @Column(name = "funcionario_nome", nullable = false)
    String funcionarioNome;

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public Float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Date getVendaData() {
        return vendaData;
    }

    public void setVendaData(Date vendaData) {
        this.vendaData = vendaData;
    }

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
}
