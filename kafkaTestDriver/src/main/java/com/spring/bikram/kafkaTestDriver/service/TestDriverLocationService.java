package com.spring.bikram.kafkaTestDriver.service;

import com.spring.bikram.kafkaTestDriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class TestDriverLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.DRIVER_LOCATION, location);
        return true;
    }

}
