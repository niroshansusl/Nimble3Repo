package com.niroshan.nimble3.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class BeanDataListItem implements Serializable, Parcelable {

    private String id, title, description, cover_image_url, short_url;

    public BeanDataListItem(String id, String title) {
        super();
        this.id = id;
        this.title = title;

    }

    public BeanDataListItem(Parcel parcel) {
        super();
        this.id = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.cover_image_url = parcel.readString();
        this.short_url = parcel.readString();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public static final Creator<BeanDataListItem> CREATOR = new Creator<BeanDataListItem>() {

        @Override
        public BeanDataListItem createFromParcel(Parcel source) {
            return new BeanDataListItem(source);
        }

        @Override
        public BeanDataListItem[] newArray(int size) {
            return new BeanDataListItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flag) {
        out.writeString(id);
        out.writeString(title);
        out.writeString(description);
        out.writeString(cover_image_url);
        out.writeString(short_url);
    }

}
