package com.sakchhyat.springbootdemo.springintro.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    //injecting properties for coach name and team name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;




    //expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }


    //expose a new endpoint for "workout"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return teamName;
    }

    @GetMapping("/coachinfo")
    public String getCoachName(){
        return coachName;
    }
}
