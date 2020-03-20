package com.example.demo_db_relations_1.service;

import com.example.demo_db_relations_1.persistence.Document;
import com.example.demo_db_relations_1.persistence.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public Document getByTitle(String title) {
        return documentRepository.findByTitle(title);
    }

    public Document createDocument(String title) {
        Document document = new Document(title);
        documentRepository.save(document);
        return document;
    }

    public void saveDocument(Document document) {
        documentRepository.save(document);
    }
}
