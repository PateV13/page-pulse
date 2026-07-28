package com.pagepulse.backend.dto;

public class AnalyzeResponse {

    private String message;
    private String url;
    private String title;
    private int statusCode;

    public AnalyzeResponse() {
    }

    public AnalyzeResponse(String message, String url, String title, int statusCode) {
        this.message = message;
        this.url = url;
        this.title = title;
        this.statusCode = statusCode;
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

}