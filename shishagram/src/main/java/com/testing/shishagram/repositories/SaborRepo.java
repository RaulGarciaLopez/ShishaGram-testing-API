package com.testing.shishagram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.shishagram.models.Sabor;

@Repository
public interface SaborRepo extends JpaRepository<Sabor, String> {

}
