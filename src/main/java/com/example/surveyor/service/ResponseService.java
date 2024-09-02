package com.example.surveyor.service;

import com.example.surveyor.model.Response;
import com.example.surveyor.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    public List<Response> getAllResponses() {
        return responseRepository.findAll();
    }

    public Response createResponse(Response response) {
        return responseRepository.save(response);
    }
}
