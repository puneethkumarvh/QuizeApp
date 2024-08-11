package com.puneeth.QuizeApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class QuestionsController {
    @GetMapping("/")
    public String healthCheck(){
        return "All is well!.";
    }
}
