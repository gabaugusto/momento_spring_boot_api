package api.momento.data.momento.repository;


import api.momento.data.momento.models.DadosFuncionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DadosFuncionariosRepository extends JpaRepository<DadosFuncionarios, UUID> {
    // Adicione aqui métodos específicos para a outra tabela, se necessário
    Optional<DadosFuncionarios> findFuncionariosByfuncionarioId(int funcionarioId);


}