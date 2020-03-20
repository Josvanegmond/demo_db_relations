package com.example.demo_db_relations_2.service;

import com.example.demo_db_relations_2.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbstractDocumentService {

    @Autowired
    private TextDocumentRepository textDocumentRepository;

    @Autowired
    private SpreadsheetDocumentRepository spreadsheetDocumentRepository;

    public TextDocument getTextDocumentByTitle(String title) {
        return textDocumentRepository.findByTitle(title);
    }

    public void saveTextDocument(TextDocument document) {
        textDocumentRepository.save(document);
    }

    public void saveSpreadsheetDocument(SpreadsheetDocument document) {
        spreadsheetDocumentRepository.save(document);
    }

    public SpreadsheetDocument getSpreadsheetDocumentByTitle(String title) {
        return spreadsheetDocumentRepository.findByTitle(title);
    }
}
