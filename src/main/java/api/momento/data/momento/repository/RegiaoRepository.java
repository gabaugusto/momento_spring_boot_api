package api.momento.data.momento.repository;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.models.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, UUID> {
    // Adicione aqui métodos específicos para a outra tabela, se necessário
    Optional<Regiao> findCargoByregiaoId(int regiaoId);

    Optional<Regiao> findCargoByregiaoNome(String nome);
}
