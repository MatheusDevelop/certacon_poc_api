package com.certacon.poc.controllers;

import com.certacon.poc.inputModels.CriarDocumentoInputModel;
import com.certacon.poc.models.Documento;
import com.certacon.poc.repositories.IDocumentoRepository;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DocumentoController {

    @Autowired
    IDocumentoRepository repository;

    @PostMapping("/documentos")
    public ResponseEntity<List<Documento>> criarBatch(@RequestBody @Valid List<CriarDocumentoInputModel> inputModels) {
        repository.deleteAll();
        List<Documento> modelos = new ArrayList<>();
        for (CriarDocumentoInputModel inputModel : inputModels) {
            var model = new Documento();
            BeanUtils.copyProperties(inputModel, model);
            modelos.add(model);
        }
        List<Documento> response = repository.saveAll(modelos);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/documentos")
    public ResponseEntity<List<Documento>> lerTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
}
