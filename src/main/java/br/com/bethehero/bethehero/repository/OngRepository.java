package br.com.bethehero.bethehero.repository;

import br.com.bethehero.bethehero.repository.entities.OngTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OngRepository extends JpaRepository<OngTable, String> {
    Optional<OngTable> findByEmailOrName(String email, String name);

}
