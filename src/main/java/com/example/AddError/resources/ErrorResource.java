package com.example.AddError.resources;

import com.example.AddError.model.Error;
import com.example.AddError.repository.ErrorRepository;
import com.example.AddError.service.ErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@RequestMapping("/api")
public class ErrorResource {

    @Autowired
    private ErrorService errorService;

    @PostMapping("/error")
    public ResponseEntity<Error> addError(@RequestBody Error error) {
        try {
            return new ResponseEntity<>(errorService.addError(error), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
