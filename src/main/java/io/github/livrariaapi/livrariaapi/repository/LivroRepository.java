package io.github.livrariaapi.livrariaapi.repository;

import io.github.livrariaapi.livrariaapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, String> {
    List<Livro> findByTituloIgnoreCase(String titulo);
}
