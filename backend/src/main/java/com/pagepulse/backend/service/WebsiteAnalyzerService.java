package com.pagepulse.backend.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import org.jsoup.Connection;
import com.pagepulse.backend.dto.WebsiteAnalysisResult;

@Service
public class WebsiteAnalyzerService {

    public WebsiteAnalysisResult analyzeWebsite(String url) throws Exception {

    Connection.Response response = Jsoup.connect(url).execute();

    Document document = response.parse();

    String title = document.title();

    int statusCode = response.statusCode();

    return new WebsiteAnalysisResult(title, statusCode);
}
}