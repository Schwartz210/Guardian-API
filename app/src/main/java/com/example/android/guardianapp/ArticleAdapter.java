package com.example.android.guardianapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.guardian.R;

import java.util.ArrayList;

/**
 * Created by aschwartz on 1/9/2017.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {
    public ArticleAdapter(Context context, ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Article currentArticle = getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section);
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        titleTextView.setText(currentArticle.getTitle());
        sectionTextView.setText(currentArticle.getSection());
        authorTextView.setText(currentArticle.getAuthor());
        dateTextView.setText(currentArticle.getDate());
        return listItemView;
    }
}
