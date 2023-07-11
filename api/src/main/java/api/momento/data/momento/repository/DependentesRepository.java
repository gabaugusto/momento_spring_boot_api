package api.momento.data.momento.repository;

import api.momento.data.momento.models.Dependentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface DependentesRepository extends JpaRepository<Dependentes, UUID> {

    Optional<Dependentes> findDependentesBydependenteId(int dependenteId);

    Optional<Dependentes> findDependentesBynome(String nome);

    // Abaixo consulta é escrita em SQL nativo e o parâmetro nativeQuery = true informa ao Spring Data JPA que é uma consulta SQL nativa em vez de JPQL.
    // Usamos <List> para encontrar mais de um elemento.
    @Query(value = "SELECT d.* FROM dependentes d INNER JOIN funcionarios f ON d.funcionario_id = f.funcionario_id WHERE d.funcionario_id = ?1", nativeQuery = true)
    List<Dependentes> findDependentesByfuncionarioId(int funcionarioId);

}
