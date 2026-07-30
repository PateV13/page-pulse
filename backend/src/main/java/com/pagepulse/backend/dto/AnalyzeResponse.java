package com.pagepulse.backend.dto;

public class AnalyzeResponse {

    private String message;
    private String url;
    private String title;
    private int statusCode;
    private long responseTime;
    private String metaDescription;
    private int h1Count;

    public AnalyzeResponse() {
    }

    public AnalyzeResponse(String message, String url, String title, String metaDescription,
                       int statusCode, long responseTime, int h1Count) {
    this.message = message;
    this.url = url;
    this.title = title;
    this.metaDescription = metaDescription;
    this.statusCode = statusCode;
    this.responseTime = responseTime;
    this.h1Count = h1Count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

}