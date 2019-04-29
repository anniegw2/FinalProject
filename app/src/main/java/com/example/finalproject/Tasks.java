package com.example.finalproject;

import android.os.AsyncTask;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class Tasks extends AsyncTask<String, Integer, News> {

    @Override
    protected News doInBackground(String...params) {
        try {
            URL url = new URL("https://history.muffinlabs.com/date");
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("user-key", "key");
            connection.connect();

            InputStream inStream = connection.getInputStream();
            InputStreamReader inStreamReader = new InputStreamReader(inStream,
                    Charset.forName("UTF-8"));

            Gson gson = new Gson();
            News retrievedNews = gson.fromJson(inStreamReader, News.class);
            System.out.println(retrievedNews.getNews().getEventName());
            return retrievedNews;
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}