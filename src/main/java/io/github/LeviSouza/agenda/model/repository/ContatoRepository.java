package io.github.LeviSouza.agenda.model.repository;

import io.github.LeviSouza.agenda.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
