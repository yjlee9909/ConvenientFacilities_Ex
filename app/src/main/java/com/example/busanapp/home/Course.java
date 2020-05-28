package com.example.busanapp.home;

public class Course {
    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;

    /*
    public Course() {
    }
    */

    public Course(String title, String category, String description, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    /*
    // 안 쓰는 거 같아서 일단 주석처리 해둠
    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
    */
}
