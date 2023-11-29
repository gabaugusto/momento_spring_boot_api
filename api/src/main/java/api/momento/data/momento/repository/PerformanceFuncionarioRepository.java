package api.momento.data.momento.repository;

import api.momento.data.momento.models.PerformanceFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PerformanceFuncionarioRepository extends JpaRepository<PerformanceFuncionario, UUID> {


}
