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

import br.com.sistemaCadastroPersonagem.model.dto.FichaPersonagemDTO;
import br.com.sistemaCadastroPersonagem.model.services.FichaPersonagemService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/ficha-personagem")
public class FichaPersonagemController {

    @Autowired
    private FichaPersonagemService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<FichaPersonagemDTO>> getAll() {
        List<FichaPersonagemDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<FichaPersonagemDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<FichaPersonagemDTO> getById(@PathVariable Integer id) {
        FichaPersonagemDTO dto = this.service.getById(id);
        return new ResponseEntity<FichaPersonagemDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<FichaPersonagemDTO> create(@RequestBody FichaPersonagemDTO dtoInput) {
        FichaPersonagemDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<FichaPersonagemDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<FichaPersonagemDTO> update(@PathParam("id") Integer id, @RequestBody FichaPersonagemDTO dtoInput) {
        FichaPersonagemDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<FichaPersonagemDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathParam("id") Integer id, @PathParam("usuario") String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
