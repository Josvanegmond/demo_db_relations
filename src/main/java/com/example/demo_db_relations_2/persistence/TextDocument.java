package com.example.demo_db_relations_2.persistence;

import javax.persistence.*;

@Entity
public class TextDocument extends AbstractDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String contents;

    public TextDocument() {
        super("undefined");
    }

    public TextDocument(String title) {
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

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void appendContent(String content) {
        this.contents += content;
    }
}
