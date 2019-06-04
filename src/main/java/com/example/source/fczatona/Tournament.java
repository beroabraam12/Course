package com.example.source.fczatona;

public class Tournament {
    private String cupName, cupNum, imgUrl;

    public Tournament(String cupName, String cupNum, String imgUrl) {
        this.cupName = cupName;
        this.cupNum = cupNum;
        this.imgUrl = imgUrl;
    }

    public Tournament() {
    }

    public String getCupName() {
        return cupName;
    }

    public void setCupName(String cupName) {
        this.cupName = cupName;
    }

    public String getCupNum() {
        return cupNum;
    }

    public void setCupNum(String cupNum) {
        this.cupNum = cupNum;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
