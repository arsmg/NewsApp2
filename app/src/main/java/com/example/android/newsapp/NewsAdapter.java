package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

        public NewsAdapter(Context context, List<News> news) {
            super(context, 0, news);
        }

        /**
         * Returns a list item view that displays information about the earthquake at the given position
         * in the list of news.
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if there is an existing list item view (called convertView) that we can reuse,
            // otherwise, if convertView is null, then inflate a new list item layout.
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.news_list_item, parent, false);
            }

            // Find the title at the given position in the list of earthquakes
            News currentNews = getItem(position);

            // Find the TextView with view ID title
            TextView titleView = listItemView.findViewById(R.id.title);
            // Display the magnitude of the current earthquake in that TextView
            titleView.setText(currentNews.getTitle());


            // Find the TextView with view ID author
            TextView authorView = listItemView.findViewById(R.id.Author);
            // Display the location of the current earthquake in that TextView
            authorView.setText(currentNews.getAuthor());

            // Find the TextView with view ID selection
            TextView selectionView = listItemView.findViewById(R.id.selection);
            // Display the location offset of the current earthquake in that TextView
            selectionView.setText(currentNews.getSelection());

            // Find the TextView with view ID date
            TextView dateView = (TextView) listItemView.findViewById(R.id.date);
            // Display the date of the current earthquake in that TextView
            dateView.setText(currentNews.getTimeInMilliseconds());



            // Return the list item view that is now showing the appropriate data
            return listItemView;
        }

    }
