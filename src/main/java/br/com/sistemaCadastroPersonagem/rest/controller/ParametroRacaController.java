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

import br.com.sistemaCadastroPersonagem.model.dto.ParametroRacaDTO;
import br.com.sistemaCadastroPersonagem.model.services.ParametroRacaService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/parametro-raca")
public class ParametroRacaController {

    @Autowired
    private ParametroRacaService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<ParametroRacaDTO>> getAll() {
        List<ParametroRacaDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<ParametroRacaDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroRacaDTO> getById(@PathVariable Integer id) {
        ParametroRacaDTO dto = this.service.getById(id);
        return new ResponseEntity<ParametroRacaDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroRacaDTO> create(@RequestBody ParametroRacaDTO dtoInput) {
        ParametroRacaDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<ParametroRacaDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroRacaDTO> update(@PathVariable Integer id, @RequestBody ParametroRacaDTO dtoInput) {
        ParametroRacaDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<ParametroRacaDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Integer id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
