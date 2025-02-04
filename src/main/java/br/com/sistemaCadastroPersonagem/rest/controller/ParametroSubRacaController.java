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

import br.com.sistemaCadastroPersonagem.model.dto.ParametroSubRacaDTO;
import br.com.sistemaCadastroPersonagem.model.services.ParametroSubRacaService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/parametro-sub-raca")
public class ParametroSubRacaController {

    @Autowired
    private ParametroSubRacaService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<ParametroSubRacaDTO>> getAll() {
        List<ParametroSubRacaDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<ParametroSubRacaDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroSubRacaDTO> getById(@PathVariable Integer id) {
        ParametroSubRacaDTO dto = this.service.getById(id);
        return new ResponseEntity<ParametroSubRacaDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroSubRacaDTO> create(@RequestBody ParametroSubRacaDTO dtoInput) {
        ParametroSubRacaDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<ParametroSubRacaDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroSubRacaDTO> update(@PathVariable Integer id, @RequestBody ParametroSubRacaDTO dtoInput) {
        ParametroSubRacaDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<ParametroSubRacaDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Integer id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
