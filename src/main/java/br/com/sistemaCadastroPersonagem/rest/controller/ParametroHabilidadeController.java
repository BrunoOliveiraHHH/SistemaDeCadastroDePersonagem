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

import br.com.sistemaCadastroPersonagem.model.dto.ParametroHabilidadeDTO;
import br.com.sistemaCadastroPersonagem.model.services.ParametroHabilidadeService;
import br.com.sistemaCadastroPersonagem.model.utils.MediaType;

@RestController
@RequestMapping(value = "/parametro-habilidade")
public class ParametroHabilidadeController {

    @Autowired
    private ParametroHabilidadeService service;

    @GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<List<ParametroHabilidadeDTO>> getAll() {
        List<ParametroHabilidadeDTO> listaDto = new ArrayList<>();
        listaDto = this.service.getAll();
        return new ResponseEntity<List<ParametroHabilidadeDTO>>(listaDto, HttpStatus.OK);
    }

    @GetMapping(value = "/consulta/{id}", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroHabilidadeDTO> getById(@PathVariable Integer id) {
        ParametroHabilidadeDTO dto = this.service.getById(id);
        return new ResponseEntity<ParametroHabilidadeDTO>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "/salvar", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroHabilidadeDTO> create(@RequestBody ParametroHabilidadeDTO dtoInput) {
        ParametroHabilidadeDTO dto = this.service.create(dtoInput);
        return new ResponseEntity<ParametroHabilidadeDTO>(dto, HttpStatus.CREATED);
    }

    @PutMapping(value = "/alterar/{id}", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public ResponseEntity<ParametroHabilidadeDTO> update(@PathVariable Integer id, @RequestBody ParametroHabilidadeDTO dtoInput) {
        ParametroHabilidadeDTO dto = this.service.update(id, dtoInput);
        return new ResponseEntity<ParametroHabilidadeDTO>(dto, HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/excluir/{id},{usuario}")
    public ResponseEntity delete(@PathVariable Integer id, @PathVariable String usuario) {
        service.delete(id, usuario);
        return new ResponseEntity(HttpStatus.OK);
    }
}
