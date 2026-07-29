package com.pagepulse.backend.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import org.jsoup.Connection;
import com.pagepulse.backend.dto.WebsiteAnalysisResult;

@Service
public class WebsiteAnalyzerService {

    public WebsiteAnalysisResult analyzeWebsite(String url) throws Exception {

    long startTime = System.currentTimeMillis();

    Connection.Response response = Jsoup.connect(url).execute();

    long endTime = System.currentTimeMillis();

    long responseTime = endTime - startTime;

    Document document = response.parse();

    String title = document.title();

    String metaDescription = document
            .select("meta[name=description]")
            .attr("content");

    int statusCode = response.statusCode();

    return new WebsiteAnalysisResult(title,  metaDescription, statusCode, responseTime);
}

}