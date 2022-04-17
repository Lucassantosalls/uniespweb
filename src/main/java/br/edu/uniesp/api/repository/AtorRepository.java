package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator,Integer> {
}
