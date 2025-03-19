package com.testing.shishagram.services;

import java.util.List;
import java.util.Optional;

import com.testing.shishagram.models.Sabor;

public interface ISaborService {

    boolean save(Sabor s);

    boolean update(Sabor s);

    boolean delete(String name);

    Optional<Sabor> findById(String name);

    List<Sabor> findAll();

}
