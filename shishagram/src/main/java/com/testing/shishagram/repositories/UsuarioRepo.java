package com.testing.shishagram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.shishagram.models.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, String> {

}
