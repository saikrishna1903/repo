package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.model.Recipes;
@Component
public interface repo extends CrudRepository<Recipes,Integer>{

}
