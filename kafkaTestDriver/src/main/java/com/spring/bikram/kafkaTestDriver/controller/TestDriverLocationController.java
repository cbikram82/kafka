package com.spring.bikram.kafkaTestDriver.controller;

import com.spring.bikram.kafkaTestDriver.service.TestDriverLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/locations")
public class TestDriverLocationController {

    @Autowired
    private TestDriverLocationService locationService;
    @PutMapping()
    public ResponseEntity updateLocation() throws InterruptedException {

        int range = 10;
        while(range>0){
            locationService.updateLocation(Math.random()+ " "+Math.random());
            Thread.sleep(1000);
            range --;
        }
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
