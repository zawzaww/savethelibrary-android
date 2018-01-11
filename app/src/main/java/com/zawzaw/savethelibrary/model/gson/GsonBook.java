package com.zawzaw.savethelibrary.model.gson;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by zawzaw on 02/01/18.
 */

public class GsonBook {

    @SerializedName("id")
    private int book_id;

    @SerializedName("title")
    private String title;

    @SerializedName("book_name")
    private String book_title;

    @SerializedName("download_link")
    private String download_link;

    @SerializedName("subjects")
    private String subjects;

    @SerializedName("notes")
    private String notes;

    @SerializedName("bookauthor_name")
    private String bookauthor_name;

    @SerializedName("bookcategory_name_mm")
    private String bookcategory_name_mm;

    @SerializedName("bookcategory_name_en")
    private String bookcategory_name_en;

    @SerializedName("bookpublisher_name")
    private String bookpublisher_name;

    @SerializedName("bookpublisher_address")
    private String bookpublisher_address;

    @SerializedName("feature_image_path")
    private String feature_image_path;

    @SerializedName("image")
    private String image;

    @SerializedName("media")
    private List<GsonBookMedia> mediaBookList;

    public String getFeature_image_path() {
        return feature_image_path;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public String getDownload_link() {
        return download_link;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getNotes() {
        return notes;
    }

    public String getBookauthor_name() {
        return bookauthor_name;
    }

    public String getBookcategory_name_mm() {
        return bookcategory_name_mm;
    }

    public String getBookcategory_name_en() {
        return bookcategory_name_en;
    }

    public String getBookpublisher_name() {
        return bookpublisher_name;
    }

    public String getBookpublisher_address() {
        return bookpublisher_address;
    }

    public String getImage() {
        return image;
    }

    public List<GsonBookMedia> getMediaBookList() {
        return mediaBookList;
    }

    public String getTitle() {
        return title;
    }

}
