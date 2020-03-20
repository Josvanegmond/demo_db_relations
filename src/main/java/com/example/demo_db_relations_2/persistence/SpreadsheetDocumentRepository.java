package com.example.demo_db_relations_2.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpreadsheetDocumentRepository extends JpaRepository<SpreadsheetDocument, Long> {

    SpreadsheetDocument findByTitle(String title);

    SpreadsheetDocument[] findAllByTitle(String title);
}
