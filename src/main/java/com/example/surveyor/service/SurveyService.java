package com.example.surveyor.service;

import com.example.surveyor.model.Survey;
import com.example.surveyor.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }
}
