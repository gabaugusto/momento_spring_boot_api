package api.momento.data.momento.repository;

import api.momento.data.momento.models.RelatorioEscritorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface RelatorioEscritorioRepository extends JpaRepository<RelatorioEscritorio, UUID> {
    List<RelatorioEscritorio> findAll();

    @Query(value = "SELECT suprimento_id, suprimento_nome, SUM(quantidade) as quantidade, SUM(custo) as custo, escritorio_nome FROM relatorio_escritorio GROUP BY escritorio_nome;", nativeQuery = true)
    List<RelatorioEscritorio> findAllByGroup();
}
