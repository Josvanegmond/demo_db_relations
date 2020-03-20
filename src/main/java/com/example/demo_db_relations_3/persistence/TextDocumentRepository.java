package com.example.demo_db_relations_3.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TextDocumentRepository extends JpaRepository<TextDocument, Long> {

    TextDocument findByTitle(String title);

    TextDocument[] findAllByTitle(String title);

}
