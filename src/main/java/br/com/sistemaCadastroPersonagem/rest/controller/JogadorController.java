package br.com.sistemaCadastroPersonagem.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistemaCadastroPersonagem.model.dto.JogadorDTO;
import br.com.sistemaCadastroPersonagem.model.services.JogadorService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/jogador")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<JogadorDTO>> getAll() {
        List<JogadorDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<JogadorDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public ResponseEntity<JogadorDTO> getById(@PathVariable Integer id) {
        JogadorDTO dto = this.service.getById(id);
        return new ResponseEntity<JogadorDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<JogadorDTO> create(@RequestBody JogadorDTO dtoInput) {
        JogadorDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<JogadorDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<JogadorDTO> update(@PathParam("id") Integer id, @RequestBody JogadorDTO dtoInput) {
        JogadorDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<JogadorDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity delete(@PathParam("id") Integer id, @PathParam("usuario") String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
