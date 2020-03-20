package com.example.demo_db_relations_1.persistence;

import javax.persistence.*;

@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String uri;

    public Document() {}

    public Document(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setURI(String uri) {
        this.uri = uri;
    }

    public String getURI() {
        return this.uri;
    }
}
