package com.demo.Autowired.repository;

import com.demo.Autowired.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository             //implementamos la interface
public class PostRepository implements IPostRepository{


    @Override
    public List<Post> traerTodos() {
        List<Post> listaPosteos = new ArrayList<Post>();
        //agregamos 2 posts de forma logica como si nos enviara la db
        listaPosteos.add(new Post(1L, "Como formatear una Pc?", "Nico Pozzer"));
        listaPosteos.add(new Post(2L, "Como limpiar virus?", "tuma 15"));

        //Retornamos la lista
        return listaPosteos;
    }
}
