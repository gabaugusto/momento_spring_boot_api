package api.momento.data.momento.repository;

import api.momento.data.momento.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, UUID> {

    Optional<Departamento> findDepartamentoBydepartamentoId(int id);

    Optional<Departamento> findDepartamentoBydepartamentoNome(String nome);
}
