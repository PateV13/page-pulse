package com.pagepulse.backend.controller;

import com.pagepulse.backend.dto.AnalyzeRequest;
import com.pagepulse.backend.dto.AnalyzeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AnalyzeController {

@PostMapping("/analyze")
public AnalyzeResponse analyzeWebsite(@RequestBody AnalyzeRequest request) {

    return new AnalyzeResponse(
            "API is working!",
            request.getUrl()
    );
}

}