package com.certacon.poc.services;

import com.certacon.poc.dtos.CreateDocumentDTO;
import com.certacon.poc.models.Document;
import com.certacon.poc.repositories.IDocumentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentServices {
    @Autowired
    IDocumentRepository repository;
    public List<Document> readAll(){
        return repository.findAll();
    }
    public List<Document> syncCrawlerData(List<CreateDocumentDTO> inputModels){
        repository.deleteAll();
        var models = toEntity(inputModels);
        return repository.saveAll(models);
    }

    private static List<Document> toEntity(List<CreateDocumentDTO> documents) {
        List<Document> models = new ArrayList<>();
        for (CreateDocumentDTO inputModel : documents) {
            var model = new Document();
            BeanUtils.copyProperties(inputModel, model);
            models.add(model);
        }
        return models;
    }
}
