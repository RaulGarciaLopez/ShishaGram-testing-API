package com.testing.shishagram.services.implementations;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.shishagram.models.Empresa;
import com.testing.shishagram.repositories.EmpresaRepo;
import com.testing.shishagram.services.IEmpresaService;

@Service
public class ImplEmpresaService implements IEmpresaService {

    @Autowired
    EmpresaRepo daoEmpresa;

    @Override
    public boolean save(Empresa e) {
        if (!daoEmpresa.existsById(e.getUsername())) {
            daoEmpresa.save(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Empresa e) {
        if (daoEmpresa.existsById(e.getUsername())) {
            daoEmpresa.save(e);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String username) {
        if (daoEmpresa.existsById(username)) {
            daoEmpresa.deleteById(username);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Empresa> findById(String username) {
        return daoEmpresa.findById(username);
    }

    @Override
    public List<Empresa> findAll() {
        return daoEmpresa.findAll().stream()
                .filter(e -> e instanceof Empresa)
                .collect(Collectors.toList());
    }

}
