package com.pagepulse.backend.dto;

public class WebsiteAnalysisResult {

    private String title;
    private int statusCode;
    private long responseTime;
    private String metaDescription;
    private int h1Count;
    private int wordCount;

    public WebsiteAnalysisResult() {
    }

    public WebsiteAnalysisResult(String title, String metaDescription, int statusCode, long responseTime, int h1Count, int wordCount) {
        this.title = title;
        this.metaDescription = metaDescription;
        this.statusCode = statusCode;
        this.responseTime = responseTime;
        this.h1Count = h1Count;
        this.wordCount = wordCount;
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

    public int getH1Count(){
        return h1Count;
    }

    public void setH1Count(int h1Count){
        this.h1Count = h1Count;
    }

    public int getWordCount(){
        return wordCount;
    }

    public void setWordCount(int wordCount){
        this.wordCount = wordCount;
    }

}