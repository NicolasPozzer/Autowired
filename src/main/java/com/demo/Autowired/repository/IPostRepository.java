package com.demo.Autowired.repository;

import com.demo.Autowired.model.Post;

import java.util.List;

public interface IPostRepository {
    /*Colocamos los metodos de forma abstracta*/

    public List<Post> traerTodos();
}
