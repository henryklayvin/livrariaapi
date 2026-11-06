package io.github.livrariaapi.livrariaapi.controller;

import io.github.livrariaapi.livrariaapi.repository.LivroRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livro")
public class LivroController {
    private LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }


}
