package com.pr7.crudsbang.controller;

import com.pr7.crudsbang.entity.Ciudad;
import com.pr7.crudsbang.entity.Pais;
import com.pr7.crudsbang.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudad/")

public class CiudadController {
    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    private ResponseEntity<List<Ciudad>> getAllCiudades(){
        return ResponseEntity.ok(ciudadService.findAll());
    }

    @GetMapping("{id}")
    private ResponseEntity<List<Ciudad>> getAllCiudadesByPais(@PathVariable("id") Long idPais){
        return ResponseEntity.ok(ciudadService.findByPaisId(idPais));
    }
}
