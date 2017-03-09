package com.example.android.guardianapp;

/**
 * Created by aschwartz on 1/9/2017.
 */

public class Article {
    private String mTitle;
    private String mSection;
    private String mAuthor;
    private String mDate;
    private String mURL;
    public Article(String title, String section, String author, String date, String URL){
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mURL = URL;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getSection(){
        return mSection;
    }

    public String getAuthor(){
        return mAuthor;
    }

    public String getDate(){
        return mDate;
    }

    public String getURL(){
        return mURL;
    }
}
