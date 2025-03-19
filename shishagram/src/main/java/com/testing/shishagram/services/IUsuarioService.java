package com.testing.shishagram.services;

import java.util.List;
import java.util.Optional;

import com.testing.shishagram.models.Usuario;

public interface IUsuarioService {

    boolean save(Usuario u);

    boolean update(Usuario u);

    boolean delete(String username);

    Optional<Usuario> findById(String username);

    List<Usuario> findAll();

}
