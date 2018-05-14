package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/horses")
public class HorseController {
    private List<Horse> horses;
    public HorseController(){
        horses = new ArrayList<>();
        horses.add(new Horse(1,"Happy","American Horse", "Male",10,120, "Brown", "White", 12345, 1, 1, 1, 1));
        horses.add(new Horse(2,"Pretty","Belgian Horse", "Male",11,125, "Brown", "White", 23456, 1, 2, 2, 1));
    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Horse> getAll() {
        return horses;
    }
}
