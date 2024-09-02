package com.example.surveyor.model;

import jakarta.persistence.*;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    private String classifiedCategory; // To store the classification result

    // Getters and Setters
}
