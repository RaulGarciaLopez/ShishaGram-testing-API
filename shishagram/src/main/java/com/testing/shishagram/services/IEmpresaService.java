package com.testing.shishagram.services;

import java.util.List;
import java.util.Optional;

import com.testing.shishagram.models.Empresa;

public interface IEmpresaService {

    boolean save(Empresa e);

    boolean update(Empresa e);

    boolean delete(String username);

    Optional<Empresa> findById(String username);

    List<Empresa> findAll();

}
