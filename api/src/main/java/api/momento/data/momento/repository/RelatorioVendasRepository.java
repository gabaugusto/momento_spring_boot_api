package api.momento.data.momento.repository;

import api.momento.data.momento.models.RelatorioVendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RelatorioVendasRepository extends JpaRepository<RelatorioVendas, UUID> {

    @Query(value = "SELECT ticket, produto, produto_id, funcionario_id, funcionario_nome, preco_unitario, venda_data, SUM(quantidade_vendida) AS quantidade_vendida, SUM(quantidade_vendida * preco_unitario) AS vendas_totais FROM relatorio_vendas GROUP BY venda_data ORDER BY venda_data;", nativeQuery = true)
    List<RelatorioVendas> relatorioVendasLinhaTempo();

    @Query(value = "SELECT ticket, SUM(quantidade_vendida) AS quantidade_vendida, produto, produto_id, preco_unitario, venda_data, funcionario_id, SUM((quantidade_vendida * preco_unitario)/100) AS valor_total_vendido, funcionario_nome FROM relatorio_vendas GROUP BY produto;", nativeQuery = true)
    List<RelatorioVendas> relatorioVendasProduto();

}

