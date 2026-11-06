package io.github.livrariaapi.livrariaapi.repository;

import io.github.livrariaapi.livrariaapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, String> {
}
