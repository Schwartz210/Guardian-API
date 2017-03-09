package com.example.android.guardianapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by aschwartz on 1/10/2017.
 */

public class ArticleLoader extends AsyncTaskLoader<List<Article>>  {
    private static final String LOG_TAG = ArticleLoader.class.getName();
    private String mUrl;
    public ArticleLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Article> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<Article> articles = QueryUtils.fetchArticleData(mUrl);
        return articles;
    }
}
