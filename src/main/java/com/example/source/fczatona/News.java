package com.example.source.fczatona;

public class News {
    String img_url, news_title;

    public News(String news_title, String img_url) {
        this.img_url = img_url;
        this.news_title = news_title;
    }

    public News() {
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }
}
