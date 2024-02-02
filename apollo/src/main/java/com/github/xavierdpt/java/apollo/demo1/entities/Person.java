package com.github.xavierdpt.java.apollo.demo1.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Long id;
    private String name;
    private int dateOfBirth;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ObjectNode toJson(ObjectMapper om) {
        ObjectNode json = om.createObjectNode();
        json.put("id", id);
        json.put("name", name);
        json.put("age", dateOfBirth);
        return json;
    }
}
