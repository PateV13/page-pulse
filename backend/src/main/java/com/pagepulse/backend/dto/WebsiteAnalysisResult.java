package com.pagepulse.backend.dto;

public class WebsiteAnalysisResult {

    private String title;
    private int statusCode;

    public WebsiteAnalysisResult() {
    }

    public WebsiteAnalysisResult(String title, int statusCode) {
        this.title = title;
        this.statusCode = statusCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}