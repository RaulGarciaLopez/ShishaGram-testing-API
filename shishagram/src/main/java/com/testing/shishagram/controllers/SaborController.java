package com.testing.shishagram.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.shishagram.models.Sabor;
import com.testing.shishagram.services.ISaborService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/flavours")
public class SaborController {

    @Autowired
    ISaborService flavourService;

    @GetMapping("/findById")
    public ResponseEntity<Sabor> getById(@RequestParam String name) {
        return ResponseEntity.of(flavourService.findById(name));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Sabor>> getAll() {
        return ResponseEntity.ok(flavourService.findAll());
    }

}
