package com.example.demo_db_relations_3.service;

import com.example.demo_db_relations_3.persistence.TextDocument;
import com.example.demo_db_relations_3.persistence.TextDocumentRepository;
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

    public void removeDocument(TextDocument document) {
        documentRepository.delete(document);
    }
}
