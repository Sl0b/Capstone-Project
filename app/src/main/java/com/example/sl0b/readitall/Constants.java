package com.example.sl0b.readitall;

import java.util.UUID;

public class Constants {
    public static final String CLIENT_ID = "EFcUJt_vVYGy9g";
    public static final String REDIRECT_URI = "readitall://response";
    public static final String USER_AGENT =
            "android:com.example.sl0b.readitall:v1.0.0 (by /u/kishintest)";
    public static final String OAUTH_URL = "https://www.reddit.com/api/v1/authorize.compact";
    public static final String OAUTH_SCOPE = "read mysubreddits identity save subscribe";
    public static final String OAUTH_STATE = UUID.randomUUID().toString();
    public static final String PREFERENCES_FILE = "ReadItAllPrefs";
    public static final String NEW_USER_EVENT = "new_user_event";
    public static final String MY_SUBREDDITS_RETRIEVED_EVENT = "my_subreddits_retrieved_event";
    public static final String SUBREDDITS_RETRIEVED_EVENT = "subreddits_retrieved_event";
    public static final String LINKS_RETRIEVED_EVENT = "links_retrieved_event";
    public static final String EXTRA_SUBREDDIT_NAME = "subreddit_name";
    public static final String EXTRA_LINK_COUNT = "link_count";
    public static final String EXTRA_LINK_POSITION = "link_position";
    public static final String EXTRA_LINK_URL = "link_url";
    public static final String EXTRA_LINK_TITLE = "link_title";
    public static final String HTTP_PREFIX = "http";
    public static final String[] OPEN_EXTERNAL = new String[]{"youtube.com", "youtu.be"};
    public static final String ACTION_SHOW_LINKS_FOR_SUBREDDIT =
            "com.example.sl0b.readitall.SHOW_LINKS_FOR_SUBREDDIT";
}
