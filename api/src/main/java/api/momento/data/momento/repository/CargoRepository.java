package api.momento.data.momento.repository;

import api.momento.data.momento.models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface CargoRepository extends JpaRepository<Cargo, UUID> {
    Optional<Cargo> findCargoBycargoId(int cargoId);

    Optional<Cargo> findCargoBycargoNome(String nome);
}
