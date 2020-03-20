package com.example.demo_db_relations_3.persistence;

public abstract class AbstractDocument {

    private String title;
    private String uri;

    public AbstractDocument(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setURI(String uri) {
        this.uri = uri;
    }

    public String getURI() {
        return this.uri;
    }
}
