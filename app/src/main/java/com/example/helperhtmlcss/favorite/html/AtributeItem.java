package com.example.helperhtmlcss.favorite.html;

public class AtributeItem {
    private int item_image;
    private String title;
    private String text;
    private String key_id;
    private String favStatus;
    private String description;
    private String example;
    private String category;


    public AtributeItem(int image, String title, String text, String id, String description, String example) {
    }

    public AtributeItem(int item_image, String title, String text, String key_id, String favStatus, String description, String example, String category) {
        this.item_image = item_image;
        this.title = title;
        this.text = text;
        this.key_id = key_id;
        this.favStatus = favStatus;
        this.description = description;
        this.example = example;
        this.category = category;

    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getFavStatus() {
        return favStatus;
    }

    public void setFavStatus(String favStatus) {
        this.favStatus = favStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
