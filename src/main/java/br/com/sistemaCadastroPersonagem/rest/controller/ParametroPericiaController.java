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

import br.com.sistemaCadastroPersonagem.model.dto.ParametroPericiaDTO;
import br.com.sistemaCadastroPersonagem.model.services.ParametroPericiaService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/parametro-pericia")
public class ParametroPericiaController {

    @Autowired
    private ParametroPericiaService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<ParametroPericiaDTO>> getAll() {
        List<ParametroPericiaDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<ParametroPericiaDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroPericiaDTO> getById(@PathVariable Long id) {
        ParametroPericiaDTO dto = this.service.getById(id);
        return new ResponseEntity<ParametroPericiaDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroPericiaDTO> create(@RequestBody ParametroPericiaDTO dtoInput) {
        ParametroPericiaDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<ParametroPericiaDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroPericiaDTO> update(@PathVariable Long id, @RequestBody ParametroPericiaDTO dtoInput) {
        ParametroPericiaDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<ParametroPericiaDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Long id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
