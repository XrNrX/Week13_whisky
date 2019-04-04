package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {


    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/")
    public List<Whisky> getAllWhiskies(){
        return whiskyRepository.findAll();
    }

    @GetMapping(value = "/whiskyName/{whiskyName}")
    public List<Whisky> findWhiskyByName(@PathVariable String whiskyName){
        return whiskyRepository.findWhiskyByName(whiskyName);
    }

    @GetMapping(value = "/whiskyDistillery/{id}")
    public List<Whisky> findWhiskyByDistillery(@PathVariable Long id){
        return whiskyRepository.findWhiskyByDistilleryId(id);
    }

    @GetMapping(value = "whiskyYear/{year}")
    public List<Whisky> findWhiskyByYear(@PathVariable int year){
        return whiskyRepository.findWhiskyByYear(year);
    }

    @GetMapping(value = "whiskyAge/{age}")
    public List<Whisky> findWhiskyByAge(@PathVariable int age){
        return whiskyRepository.findWhiskyByAge(age);
    }


}
