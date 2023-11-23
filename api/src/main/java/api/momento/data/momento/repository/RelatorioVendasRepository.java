package api.momento.data.momento.repository;

import api.momento.data.momento.models.RelatorioVendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RelatorioVendasRepository extends JpaRepository<RelatorioVendas, UUID> {

    @Query(value = "SELECT venda_data AS data, SUM(quantidade_vendida * preco_unitario) AS vendas_totais FROM relatorio_vendas GROUP BY venda_data ORDER BY venda_data;", nativeQuery = true)
    List<RelatorioVendas> relatorioVendasLinhaTempo();

    @Query(value = "SELECT produto, SUM(quantidade_vendida), SUM((quantidade_vendida * preco_unitario)/100) AS valor_total_vendido FROM relatorio_vendas GROUP BY produto;", nativeQuery = true)
    List<RelatorioVendas> relatorioVendasProduto();

}

