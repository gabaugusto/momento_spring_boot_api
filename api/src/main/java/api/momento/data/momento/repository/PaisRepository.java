package api.momento.data.momento.repository;

import api.momento.data.momento.models.Cargo;
import api.momento.data.momento.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface PaisRepository extends JpaRepository<Pais, UUID> {

    Optional<Pais> findPaisBypaisId(String id);


    Optional<Pais> findPaisBypaisNome(String nome);

    @Query(value = "SELECT p.* FROM pais p INNER JOIN regiao r ON p.regiao_id = r.regiao_id WHERE  p.regiao_id = ?1", nativeQuery = true)
    List<Pais> findPaisByregiaoId(int id);
}

