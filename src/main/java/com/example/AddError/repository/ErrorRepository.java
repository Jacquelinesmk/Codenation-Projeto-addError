package com.example.AddError.repository;


import com.example.AddError.model.Error;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorRepository extends JpaRepository<Error, Long> {

}
