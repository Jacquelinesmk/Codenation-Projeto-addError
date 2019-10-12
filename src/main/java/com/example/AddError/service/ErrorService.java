package com.example.AddError.service;

import com.example.AddError.model.Error;
import com.example.AddError.repository.ErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ErrorService {

    @Autowired
    private ErrorRepository errorRepository;

    public Error addError(Error error){
        return errorRepository.save(error);
    }
}
