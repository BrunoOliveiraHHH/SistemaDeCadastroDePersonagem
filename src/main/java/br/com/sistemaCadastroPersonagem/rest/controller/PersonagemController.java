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

import br.com.sistemaCadastroPersonagem.model.dto.PersonagemDTO;
import br.com.sistemaCadastroPersonagem.model.services.PersonagemService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/personagem")
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<PersonagemDTO>> getAll() {
        List<PersonagemDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<PersonagemDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<PersonagemDTO> getById(@PathVariable Integer id) {
        PersonagemDTO dto = this.service.getById(id);
        return new ResponseEntity<PersonagemDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<PersonagemDTO> create(@RequestBody PersonagemDTO dtoInput) {
        PersonagemDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<PersonagemDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<PersonagemDTO> update(@PathVariable Integer id, @RequestBody PersonagemDTO dtoInput) {
        PersonagemDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<PersonagemDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Integer id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
