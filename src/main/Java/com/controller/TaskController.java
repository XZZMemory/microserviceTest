package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @RequestMapping(value = {"/",""})
    public String hellTask(@Value("${cusvar}")String cusvar ){

        return "hello task !! myage is " + cusvar;
    }

}
