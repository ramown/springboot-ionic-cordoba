package com.ramown.cursomc.services;

import java.util.List;

public interface IService <T>{

    public List<T> list();
    public T findById(Integer id);
}
