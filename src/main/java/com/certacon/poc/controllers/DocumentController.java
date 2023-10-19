package com.certacon.poc.controllers;

import com.certacon.poc.dtos.CreateDocumentDTO;
import com.certacon.poc.models.Document;
import com.certacon.poc.repositories.IDocumentRepository;
import com.certacon.poc.services.DocumentServices;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DocumentController {
    @Autowired
    DocumentServices services;
    @PostMapping("/documents/sync")
    public ResponseEntity<List<Document>> syncWithData(@RequestBody @Valid List<CreateDocumentDTO> inputModels) {
        return ResponseEntity.status(HttpStatus.CREATED).body(services.syncCrawlerData(inputModels));
    }
    @GetMapping("/documents")
    public ResponseEntity<List<Document>> readAll(){
        return ResponseEntity.status(HttpStatus.OK).body(services.readAll());
    }
}
