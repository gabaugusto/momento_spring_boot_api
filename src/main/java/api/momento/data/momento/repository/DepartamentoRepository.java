package api.momento.data.momento.repository;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, UUID> {
    // Adicione aqui métodos específicos para a outra tabela, se necessário
}
