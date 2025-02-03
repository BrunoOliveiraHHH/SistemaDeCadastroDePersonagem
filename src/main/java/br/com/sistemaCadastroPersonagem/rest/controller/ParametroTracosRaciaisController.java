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

import br.com.sistemaCadastroPersonagem.model.dto.ParametroTracosRaciaisDTO;
import br.com.sistemaCadastroPersonagem.model.services.ParametroTracosRaciaisService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/parametro-tracos-raciais")
public class ParametroTracosRaciaisController {

    @Autowired
    private ParametroTracosRaciaisService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<ParametroTracosRaciaisDTO>> getAll() {
        List<ParametroTracosRaciaisDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<ParametroTracosRaciaisDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroTracosRaciaisDTO> getById(@PathVariable Long id) {
        ParametroTracosRaciaisDTO dto = this.service.getById(id);
        return new ResponseEntity<ParametroTracosRaciaisDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroTracosRaciaisDTO> create(@RequestBody ParametroTracosRaciaisDTO dtoInput) {
        ParametroTracosRaciaisDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<ParametroTracosRaciaisDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroTracosRaciaisDTO> update(@PathVariable Long id, @RequestBody ParametroTracosRaciaisDTO dtoInput) {
        ParametroTracosRaciaisDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<ParametroTracosRaciaisDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Long id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
