package com.example.demo_db_relations_3.persistence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class TextDocument extends AbstractDocument {

    @Id
    @Column(name = "document_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="textblob_id")
    private List<TextBlob> textBlob = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name="attached_documents",
        joinColumns=@JoinColumn(name="document_id"),
        inverseJoinColumns=@JoinColumn(name="attachment_id"))
    private Set<TextDocument> attachments = new HashSet<>();

    @ManyToMany(mappedBy = "attachments")
    private Set<TextDocument> attachedToParents = new HashSet<>();

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

    public void addTextBlob(TextBlob textBlob) {
        this.textBlob.add(textBlob);
    }

    public void attachTextDocument(TextDocument textDocument) {
        this.attachments.add(textDocument);
    }
}
