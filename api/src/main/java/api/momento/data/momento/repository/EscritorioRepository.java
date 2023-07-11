package api.momento.data.momento.repository;

import api.momento.data.momento.models.Escritorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface EscritorioRepository extends JpaRepository<Escritorio, UUID> {

    Optional<Escritorio> findEscritorioByescritorioId(int escritorioId);

    List<Escritorio> findEscritorioBycidade(String cidade);

    // Abaixo consulta é escrita em SQL nativo e o parâmetro nativeQuery = true informa ao Spring Data JPA que é uma consulta SQL nativa em vez de JPQL.
    // Usamos <List> para encontrar mais de um elemento.
    @Query(value = "SELECT e.* FROM escritorio e INNER JOIN pais p ON e.pais_id = p.pais_id WHERE e.pais_id = ?1", nativeQuery = true)
    List<Escritorio> findEscritorioBypaisId(String paisId);
}
