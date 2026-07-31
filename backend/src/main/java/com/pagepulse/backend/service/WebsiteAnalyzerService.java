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

    int h1Count = document.select("h1").size();

    int statusCode = response.statusCode();

    String text = document.text().trim();

    String[] words = text.split("\\s+");

    int wordCount = words.length;

    return new WebsiteAnalysisResult(title,  metaDescription, statusCode, responseTime, h1Count, wordCount);
}

}