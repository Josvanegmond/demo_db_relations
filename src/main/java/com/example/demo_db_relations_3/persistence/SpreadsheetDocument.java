package com.example.demo_db_relations_3.persistence;

import javax.persistence.*;

@Entity
public class SpreadsheetDocument extends AbstractDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int[][] matrix = new int[][] {
        {10, 10, 0},
        {5, 5, 5},
        {1, 0, 0}
    };

    public SpreadsheetDocument() {
        super("undefined");
    }

    public SpreadsheetDocument(String title) {
        super(title);
    }

    @Access(value = AccessType.PROPERTY)
    @Column(name = "title")
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Access(value = AccessType.PROPERTY)
    @Column(name = "title")
    public String getTitle() {
        return super.getTitle();
    }

    @Access(value = AccessType.PROPERTY)
    @Column(name = "uri")
    public void setURI(String uri) {
        super.setURI(uri);
    }

    @Access(value = AccessType.PROPERTY)
    @Column(name = "uri")
    public String getURI() {
        return super.getURI();
    }

    public int[][] getMatrix() {
        return  matrix;
    }
}
