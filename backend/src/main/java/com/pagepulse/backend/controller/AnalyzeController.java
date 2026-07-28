package com.pagepulse.backend.controller;

import com.pagepulse.backend.dto.AnalyzeRequest;
import com.pagepulse.backend.dto.AnalyzeResponse;
import org.springframework.web.bind.annotation.*;
import com.pagepulse.backend.service.WebsiteAnalyzerService;
import com.pagepulse.backend.dto.WebsiteAnalysisResult;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AnalyzeController {

private final WebsiteAnalyzerService websiteAnalyzerService;

public AnalyzeController(WebsiteAnalyzerService websiteAnalyzerService) {
    this.websiteAnalyzerService = websiteAnalyzerService;
}

@PostMapping("/analyze")
public AnalyzeResponse analyzeWebsite(@RequestBody AnalyzeRequest request) throws Exception {

    WebsiteAnalysisResult result = websiteAnalyzerService.analyzeWebsite(request.getUrl());

    return new AnalyzeResponse(
            "Success",
            request.getUrl(),
            result.getTitle(),
            result.getStatusCode()
    );
}

}