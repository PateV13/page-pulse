package com.pagepulse.backend.dto;

public class WebsiteAnalysisResult {

    private String title;
    private int statusCode;
    private long responseTime;
    private String metaDescription;
    private int h1Count;
    private int wordCount;
    private int totalImages;
    private int imagesWithoutAlt;
    private int imagesWithEmptyAlt;

    public WebsiteAnalysisResult() {
    }

    public WebsiteAnalysisResult(String title, String metaDescription, int statusCode, long responseTime, int h1Count, int wordCount, int totalImages, int imagesWithoutAlt, int imagesWithEmptyAlt) {
        this.title = title;
        this.metaDescription = metaDescription;
        this.statusCode = statusCode;
        this.responseTime = responseTime;
        this.h1Count = h1Count;
        this.wordCount = wordCount;
        this.totalImages= totalImages;
        this.imagesWithoutAlt=imagesWithoutAlt;
        this.imagesWithEmptyAlt=imagesWithEmptyAlt;
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

    public int getTotalImages(){
        return totalImages;
    }

    public void setTotalImages(int totalImages){
        this.totalImages=totalImages;
    }

    public int getImagesWithoutAlt(){
        return imagesWithoutAlt;
    }

    public void setImagesWithoutAlt(int imagesWithoutAlt){
        this.imagesWithoutAlt=imagesWithoutAlt;
    }

    public int getImagesWithEmptyAlt(){
        return imagesWithEmptyAlt;
    }

    public void setImagesWithEmptyAlt(int imagesWithEmptyAlt){
        this.imagesWithEmptyAlt = imagesWithEmptyAlt;
    }

}