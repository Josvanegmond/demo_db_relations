package com.example.demo_db_relations_3;

import com.example.demo_db_relations_3.persistence.TextBlob;
import com.example.demo_db_relations_3.persistence.TextDocument;
import com.example.demo_db_relations_3.service.TextDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoDbRelationsApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(DemoDbRelationsApplication3.class, args);
	}

	@Autowired
	private TextDocumentService textDocumentService;

	@PostConstruct
	public void init() {
		TextBlob blob1 = new TextBlob("Hello", "World", "Goodmorning", "Universe");
		TextBlob blob2 = new TextBlob("1234", "5678", "90");

		TextDocument textDocument1 = textDocumentService.createDocument("Test1");
		textDocument1.addTextBlob( blob1 );
		textDocumentService.saveDocument(textDocument1);

		TextDocument textDocument2 = textDocumentService.createDocument("Test2");
		textDocument2.addTextBlob( blob1 );
		textDocumentService.saveDocument(textDocument2);

		TextDocument textDocument3 = textDocumentService.createDocument("Test3");
		textDocument3.addTextBlob( blob2 );
		textDocument3.attachTextDocument(textDocument1);
		textDocument3.attachTextDocument(textDocument2);
		textDocumentService.saveDocument(textDocument3);
	}

}
