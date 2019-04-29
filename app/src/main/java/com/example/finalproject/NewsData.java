package com.example.finalproject;

import android.os.Parcel;
import android.os.Parcelable;


public class NewsData implements Parcelable {
    private String eventName;
    protected NewsData(Parcel in) {
        eventName = in.readString();
    }

    public String getEventName() {
        return eventName;
    }

    public static final Creator<NewsData> CREATOR = new Creator<NewsData>() {
        @Override
        public NewsData createFromParcel(Parcel in) {
            return new NewsData(in);
        }

        @Override
        public NewsData[] newArray(int size) {
            return new NewsData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(eventName);
    }

}