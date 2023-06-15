package api.momento.data.momento.repository;

import api.momento.data.momento.models.Dependentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DependentesRepository extends JpaRepository<Dependentes, UUID> {
    // Adicione aqui métodos específicos para a outra tabela, se necessário
}
