package com.demo.Autowired.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Post {
    private Long id;
    private String titulo;
    private String autor;

    public Post() {
    }

    public Post(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
}
