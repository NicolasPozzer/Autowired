package com.demo.Autowired.controller;

import com.demo.Autowired.model.Post;
import com.demo.Autowired.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AplicationController {

    //Paso_1 Declaramos la anotation @Autowired para inyectar la dependencia
    @Autowired
    IPostRepository repo;//Paso_2 Para usar el @Autowired hay que poner a que interfaz llamamos!

    @GetMapping ("/posteos")
    public List<Post> traerTodos(){

        return repo.traerTodos(); /*Paso_3 Llamamos al metodo con el repo que saca del @Autowired*/
    }

}
