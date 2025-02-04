package br.com.sistemaCadastroPersonagem.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemaCadastroPersonagem.model.dto.ClasseSalvaguardaDTO;
import br.com.sistemaCadastroPersonagem.model.services.ClasseSalvaguardaService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/classe-salvaguarda")
public class ClasseSalvaguardaController {

    @Autowired
    private ClasseSalvaguardaService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<ClasseSalvaguardaDTO>> getAll() {
        List<ClasseSalvaguardaDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<ClasseSalvaguardaDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ClasseSalvaguardaDTO> getById(@PathVariable Integer id) {
        ClasseSalvaguardaDTO dto = this.service.getById(id);
        return new ResponseEntity<ClasseSalvaguardaDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ClasseSalvaguardaDTO> create(@RequestBody ClasseSalvaguardaDTO dtoInput) {
        ClasseSalvaguardaDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<ClasseSalvaguardaDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ClasseSalvaguardaDTO> update(@PathVariable Integer id, @RequestBody ClasseSalvaguardaDTO dtoInput) {
        ClasseSalvaguardaDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<ClasseSalvaguardaDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Integer id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
