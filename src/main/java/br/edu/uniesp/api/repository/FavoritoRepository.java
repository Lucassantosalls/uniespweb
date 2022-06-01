package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritoRepository extends JpaRepository<Favoritos, Integer> {
}
