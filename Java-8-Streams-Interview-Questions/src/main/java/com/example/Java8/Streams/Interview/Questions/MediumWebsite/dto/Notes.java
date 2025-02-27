package com.example.Java8.Streams.Interview.Questions.MediumWebsite.dto;

public class Notes {

    private int id;
    private String tagName;
    private int tagId;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Notes(int id, String tagName, int tagId) {
        this.id = id;
        this.tagName = tagName;
        this.tagId = tagId;
    }
}
