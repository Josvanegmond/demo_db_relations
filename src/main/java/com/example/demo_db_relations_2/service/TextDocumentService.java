package com.example.demo_db_relations_2.service;

import com.example.demo_db_relations_2.persistence.TextDocument;
import com.example.demo_db_relations_2.persistence.TextDocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextDocumentService {

    @Autowired
    private TextDocumentRepository documentRepository;

    public TextDocument getByTitle(String title) {
        return documentRepository.findByTitle(title);
    }

    public TextDocument createDocument(String title) {
        TextDocument document = new TextDocument(title);
        documentRepository.save(document);
        return document;
    }

    public void saveDocument(TextDocument document) {
        documentRepository.save(document);
    }
}
