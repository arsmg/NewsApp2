package com.example.android.newsapp;
import java.util.Date;

public class News {

        /** Magnitude of the earthquake */
        private String mTitle;

        /** Location of the earthquake */
        private String mAuthor;

        /** Time of the earthquake */
        private String mSelection;

        private String mTimeInMilliseconds;

        /** Website URL of the news */
        private String mUrl;

        /**
         * Constructs a new {@link News} object.
         */

        public News (String title, String author, String selection, String timeInMilliseconds, String url) {
            mTitle = title;
            mAuthor = author;
            mSelection = selection;
            mTimeInMilliseconds = timeInMilliseconds;
            mUrl = url;
        }

        /**
         * Returns the title.
         */
        public String getTitle() {
            return mTitle;
        }

        /**
         * Returns the name of the author.
         */
        public String getAuthor() {
            return mAuthor;
        }

    /**
     * Returns the selection
     */
        public String getSelection(){return mSelection;}

    /**
     * Returns the time of the news.
         */
        public String getTimeInMilliseconds() {
            return mTimeInMilliseconds;
        }

        /**
         * Returns the website URL to find more information about the earthquake.
         */
        public String getUrl() {
            return mUrl;
        }
    }

