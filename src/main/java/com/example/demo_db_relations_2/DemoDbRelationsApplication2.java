package com.example.demo_db_relations_2;

import com.example.demo_db_relations_2.persistence.SpreadsheetDocument;
import com.example.demo_db_relations_2.persistence.TextDocument;
import com.example.demo_db_relations_2.service.AbstractDocumentService;
import com.example.demo_db_relations_2.service.TextDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class DemoDbRelationsApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(DemoDbRelationsApplication2.class, args);
	}

	@Autowired
	private TextDocumentService textDocumentService;

	@Autowired
	private AbstractDocumentService abstractDocumentService;

	@PostConstruct
	public void mijnStartMethode() {
		TextDocument textDocument = textDocumentService.createDocument("Test");
		textDocument.setContents("Hello");
		textDocument.appendContent(" World");
		abstractDocumentService.saveTextDocument(textDocument);

		abstractDocumentService.saveSpreadsheetDocument(new SpreadsheetDocument("Matrix"));

		SpreadsheetDocument ssd = abstractDocumentService.getSpreadsheetDocumentByTitle("Matrix");

		System.out.println("Printing matrix:");
		System.out.println(Arrays.deepToString(ssd.getMatrix()));
	}


}
