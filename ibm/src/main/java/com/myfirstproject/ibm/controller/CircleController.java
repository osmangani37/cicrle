package com.myfirstproject.ibm.controller;


import com.myfirstproject.ibm.model.Circle;
import com.myfirstproject.ibm.model.CircleRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circle")
public class CircleController {

    @PostMapping("/area")
    public double calculateArea(@RequestBody CircleRequest circleRequest) {
        Circle circle = new Circle(circleRequest.getRadius());
        return circle.calculateArea();
    }

    @PostMapping("/circumference")
    public double calculateCircumference(@RequestBody CircleRequest circleRequest) {
        Circle circle = new Circle(circleRequest.getRadius());
        return circle.calculateCircumference();
    }
}
