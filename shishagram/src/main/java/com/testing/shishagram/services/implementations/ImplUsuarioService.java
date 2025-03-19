package com.testing.shishagram.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.shishagram.models.Usuario;
import com.testing.shishagram.repositories.UsuarioRepo;
import com.testing.shishagram.services.IUsuarioService;

@Service
public class ImplUsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepo daoUsuario;

    @Override
    public boolean save(Usuario u) {
        if (!daoUsuario.existsById(u.getUsername())) {
            daoUsuario.save(u);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Usuario u) {
        if (daoUsuario.existsById(u.getUsername())) {
            daoUsuario.save(u);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String username) {
        if (daoUsuario.existsById(username)) {
            daoUsuario.deleteById(username);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Usuario> findById(String username) {
        return daoUsuario.findById(username);
    }

    @Override
    public List<Usuario> findAll() {
        return daoUsuario.findAll();
    }

}
