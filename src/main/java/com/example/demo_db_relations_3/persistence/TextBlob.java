package com.example.demo_db_relations_3.persistence;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TextBlob {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private int pageOrder;

    @Column
    @ElementCollection
    private List<String> stringList;

    public TextBlob() {
        stringList = new ArrayList<>();
    }

    public TextBlob(String... textLines) {
        stringList = List.of(textLines);
    }

    public void add(TextBlob textBlob) {
        stringList.addAll(textBlob.stringList);
    }

    public void add(String textLine) {
        stringList.add(textLine);
    }
}
