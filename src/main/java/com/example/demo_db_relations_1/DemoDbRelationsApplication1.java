package com.example.demo_db_relations_1;

import com.example.demo_db_relations_1.persistence.Document;
import com.example.demo_db_relations_1.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoDbRelationsApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(DemoDbRelationsApplication1.class, args);
	}

	@Autowired
	private DocumentService documentService;

	public DemoDbRelationsApplication1() {
	}

	@PostConstruct
	public void init() {
		Document document = documentService.createDocument("Test");
		documentService.saveDocument(document);
	}

}
