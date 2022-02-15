package com.example.englishcard06.network.model;

import com.google.gson.annotations.SerializedName;

public class Hits {
    @SerializedName("id")
    private Integer id;
    @SerializedName("pageURL")
    private String pageURL;
    @SerializedName("type")
    private String type;
    @SerializedName("tags")
    private String tags;
    @SerializedName("previewURL")
    private String previewURL;
    @SerializedName("previewWidth")
    private Integer previewWidth;
    @SerializedName("previewHeight")
    private Integer previewHeight;
    @SerializedName("webformatURL")
    private String webFormatURL;
    @SerializedName("webformatWidth")
    private Integer webFormatWidth;
    @SerializedName("webformatHeight")
    private Integer webFormatHeight;
    @SerializedName("largeImageURL")
    private String largeImageURL;
    @SerializedName("imageWidth")
    private Integer imageWidth;
    @SerializedName("imageHeight")
    private Integer imageHeight;
    @SerializedName("imageSize")
    private Integer imageSize;
    @SerializedName("views")
    private Integer views;
    @SerializedName("downloads")
    private Integer downloads;

    public Integer getId() {
        return id;
    }

    public String getPageURL() {
        return pageURL;
    }

    public String getType() {
        return type;
    }

    public String getTags() {
        return tags;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public Integer getPreviewWidth() {
        return previewWidth;
    }

    public Integer getPreviewHeight() {
        return previewHeight;
    }

    public String getWebFormatURL() {
        return webFormatURL;
    }

    public Integer getWebFormatWidth() {
        return webFormatWidth;
    }

    public Integer getWebFormatHeight() {
        return webFormatHeight;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public Integer getImageWidth() {
        return imageWidth;
    }

    public Integer getImageHeight() {
        return imageHeight;
    }

    public Integer getImageSize() {
        return imageSize;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public Integer getCollections() {
        return collections;
    }

    public Integer getLikes() {
        return likes;
    }

    public Integer getComments() {
        return comments;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUser() {
        return user;
    }

    @SerializedName("collections")
    private Integer collections;
    @SerializedName("likes")
    private Integer likes;
    @SerializedName("comments")
    private Integer comments;
    @SerializedName("user_id")
    private Integer userId;
    @SerializedName("user")
    private String user;





}
