package com.testing.shishagram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.shishagram.models.Empresa;

@Repository
public interface EmpresaRepo extends JpaRepository<Empresa, String> {

}
