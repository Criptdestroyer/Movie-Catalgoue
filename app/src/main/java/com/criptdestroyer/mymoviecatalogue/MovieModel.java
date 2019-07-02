package com.criptdestroyer.mymoviecatalogue;

public class MovieModel {
    private String title;
    private String description;
    private String date;
    private int photo;

    public MovieModel(String title, String description, int photo){
        this.title = title;
        this.description = description;
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public String getDate(){
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getPhoto() {
        return photo;
    }
}
