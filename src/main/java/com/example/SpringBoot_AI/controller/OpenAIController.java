package com.example.springBoot_ai.controller;

import com.example.SpringBoot_AI.model.Answer;
import com.example.SpringBoot_AI.model.Question;
import com.example.SpringBoot_AI.model.Answer;
import com.example.SpringBoot_AI.model.Question;
import com.example.SpringBoot_AI.service.OpenAIService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/openai")
public class OpenAIController {

    @Autowired
    private OpenAIService openAIService;

    @PostMapping
    public Answer getAnswer(@RequestBody Question question, HttpServletRequest request) {
        System.out.println("Incoming URI → '" + request.getRequestURI() + "'");
        return openAIService.getResult(question);
    }
}