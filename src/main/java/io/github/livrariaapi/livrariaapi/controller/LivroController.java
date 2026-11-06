package io.github.livrariaapi.livrariaapi.controller;

import io.github.livrariaapi.livrariaapi.model.Livro;
import io.github.livrariaapi.livrariaapi.repository.LivroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("livros")
public class LivroController {
    private final LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @PostMapping
    public Livro cadastrarLivro(@RequestBody Livro livro){
        livro.setId(UUID.randomUUID().toString());

        return livroRepository.save(livro);
    }

    @GetMapping("{id}")
    public Livro consultarPorId(@PathVariable("id") String id){
        return livroRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void excluirLivro(@PathVariable("id") String id){
        livroRepository.deleteById(id);
    }
}
