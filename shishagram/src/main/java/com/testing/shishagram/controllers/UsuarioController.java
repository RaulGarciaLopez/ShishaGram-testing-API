package com.testing.shishagram.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.shishagram.models.Usuario;
import com.testing.shishagram.services.IUsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/users")
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;

    @GetMapping("/findById")
    public ResponseEntity<Usuario> getById(@RequestParam String username) {
        return ResponseEntity.of(usuarioService.findById(username));
    }
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Usuario>> getAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    } 
    
}
