package com.jair.wish_list.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jair.wish_list.repositories.BaseRepository;

public abstract class BaseService<T> {
  @Autowired
  BaseRepository<T> baseRepository;

  public T save(T newT) {
    return baseRepository.save(newT);
  }

  public T findById(Long id) {
    Optional<T> optional = baseRepository.findById(id);
    if(optional.isPresent()) {
      return optional.get();
    } else {
      return null;
    }
  }

  public List<T> findAll() {
    return baseRepository.findAll();
  }

  public T update(T T) {
    return baseRepository.save(T);
  }

  public void deleteById(Long id) {
    baseRepository.deleteById(id);
  }
  
}
