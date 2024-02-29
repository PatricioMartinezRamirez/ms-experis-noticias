package com.experis.noticias.controller;

import com.experis.noticias.exception.ModeloNotFoundException;
import com.experis.noticias.model.FavoriteModel;
import com.experis.noticias.service.FavoriteService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/favorite")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE})
public class FavoriteController {

    @Autowired
    private FavoriteService service;

    @GetMapping("/listar-noticias-favoritas")
    @Operation(summary = "Lista todas las noticias favoritas")
    public ResponseEntity<List<FavoriteModel>> listar() {
        List<FavoriteModel> lista = service.listar();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @PostMapping
    @Operation(summary = "Insertar una noticia favorita")
    public ResponseEntity<Object> registrar(@Valid @RequestBody FavoriteModel clase) {

        FavoriteModel cm = service.registrar(clase);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(clase.getIdClase()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping
    @Operation(summary = "Edita una noticia favorita")
    public ResponseEntity<FavoriteModel> modificar(@Valid @RequestBody FavoriteModel clase) {
        FavoriteModel cm = service.modificar(clase);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Elimina una noticia favorita")
    public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {

        FavoriteModel cm = service.leerPorId(Long.valueOf(id));
        if (cm.getIdClase() == null) {
            throw new ModeloNotFoundException("ID NO ENCONTRADA" + id);
        }
        service.eliminar(Long.valueOf(id));
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
