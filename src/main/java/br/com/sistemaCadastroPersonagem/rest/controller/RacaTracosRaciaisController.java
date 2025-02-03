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

import br.com.sistemaCadastroPersonagem.model.dto.RacaTracosRaciaisDTO;
import br.com.sistemaCadastroPersonagem.model.services.RacaTracosRaciaisService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/raca-tracos-raciais")
public class RacaTracosRaciaisController {

    @Autowired
    private RacaTracosRaciaisService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<RacaTracosRaciaisDTO>> getAll() {
        List<RacaTracosRaciaisDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<RacaTracosRaciaisDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<RacaTracosRaciaisDTO> getById(@PathVariable Long id) {
        RacaTracosRaciaisDTO dto = this.service.getById(id);
        return new ResponseEntity<RacaTracosRaciaisDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<RacaTracosRaciaisDTO> create(@RequestBody RacaTracosRaciaisDTO dtoInput) {
        RacaTracosRaciaisDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<RacaTracosRaciaisDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<RacaTracosRaciaisDTO> update(@PathVariable Long id, @RequestBody RacaTracosRaciaisDTO dtoInput) {
        RacaTracosRaciaisDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<RacaTracosRaciaisDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Long id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
