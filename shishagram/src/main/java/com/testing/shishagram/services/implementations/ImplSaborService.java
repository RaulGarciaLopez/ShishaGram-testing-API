package com.testing.shishagram.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.shishagram.models.Sabor;
import com.testing.shishagram.repositories.SaborRepo;
import com.testing.shishagram.services.ISaborService;

@Service
public class ImplSaborService implements ISaborService {

    @Autowired
    SaborRepo daoSabor;

    @Override
    public boolean save(Sabor s) {
        if (!daoSabor.existsById(s.getName())) {
            daoSabor.save(s);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Sabor s) {
        if (daoSabor.existsById(s.getName())) {
            daoSabor.save(s);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String name) {
        if (daoSabor.existsById(name)) {
            daoSabor.deleteById(name);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Sabor> findById(String name) {
        return daoSabor.findById(name);
    }

    @Override
    public List<Sabor> findAll() {
        return daoSabor.findAll();
    }

}
