package api.momento.data.momento.repository;


import api.momento.data.momento.models.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios, UUID> {
    // Adicione aqui métodos específicos para a outra tabela, se necessário
    Optional<Funcionarios> findFuncionariosByfuncionarioId(int funcionarioId);

    Optional<Funcionarios> findFuncionariosBynome(String nome);

    // Abaixo consulta é escrita em SQL nativo e o parâmetro nativeQuery = true informa ao Spring Data JPA que é uma consulta SQL nativa em vez de JPQL.
    // Usamos <List> para encontrar mais de um elemento.
    Optional<Funcionarios> findFuncionariosByemail(String email);


    @Query(value = "SELECT f.* FROM funcionarios f INNER JOIN departamento d ON f.departamento_id = d.departamento_id WHERE f.departamento_id = ?1", nativeQuery = true)
    List<Funcionarios> findFuncionariosBydepartamentoId(int id);

}