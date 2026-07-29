package com.pagepulse.backend.dto;

public class WebsiteAnalysisResult {

    private String title;
    private int statusCode;
    private long responseTime;
    private String metaDescription;

    public WebsiteAnalysisResult() {
    }

    public WebsiteAnalysisResult(String title, String metaDescription, int statusCode, long responseTime) {
        this.title = title;
        this.metaDescription = metaDescription;
        this.statusCode = statusCode;
        this.responseTime = responseTime;
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

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

}