package com.ramown.cursomc.services;

import com.ramown.cursomc.domain.Category;
import com.ramown.cursomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements IService<Category>{
    @Autowired
    private CategoryRepository repository;


    @Override
    public List<Category> list() {
        return repository.findAll();
    }

    public Category findById(Integer id){
        Optional<Category> category = repository.findById(id);
        return category.orElse(null);
    }
}
