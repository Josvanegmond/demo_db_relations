package com.example.demo_db_relations_1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    Document findByTitle(String title);

    Document[] findAllByTitle(String title);

}
