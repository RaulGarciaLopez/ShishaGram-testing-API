package com.testing.shishagram.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testing.shishagram.models.Empresa;
import com.testing.shishagram.services.IEmpresaService;

@RestController
@RequestMapping("api/companies")
public class EmpresaController {
    @Autowired
    IEmpresaService empresaService;

    @GetMapping("/findById")
    public ResponseEntity<Empresa> getById(@RequestParam String username) {
        return ResponseEntity.of(empresaService.findById(username));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Empresa>> getAll() {
        return ResponseEntity.ok(empresaService.findAll());
    }   
}
