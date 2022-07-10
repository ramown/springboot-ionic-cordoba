package com.ramown.cursomc.resources;

import com.ramown.cursomc.domain.Category;
import com.ramown.cursomc.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> index() {
        return ResponseEntity.ok(service.list());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> show(@PathVariable Integer id){
        return ResponseEntity.ok(service.findById(id));
    }

}
