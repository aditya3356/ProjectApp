package com.example.aditya.projectapp;

/**
 * Created by aditya on 10/08/19.
 */

public class ListItem
{

    private String question;
    private String category;

    public ListItem(String question, String category) {
        this.question = question;
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public String getCategory() {
        return category;
    }
}
