package com.aakashchaurasiya780.myapplication;

import com.aakashchaurasiya780.myapplication.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {

    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
