package com.example.helperhtmlcss.favorite.html;

public class FavItem {
    private String item_title;
    private String item_text;
    private String key_id;
    private int item_image;
    private String item_description;
    private String item_example;

    public FavItem() {
    }

    public FavItem(String item_title, String item_text, String key_id, int item_image, String item_description, String item_example) {
        this.item_title = item_title;
        this.item_text = item_text;
        this.key_id = key_id;
        this.item_image = item_image;
        this.item_description = item_description;
        this.item_example = item_example;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getItem_text() {
        return item_text;
    }

    public void setItem_text(String item_text) {
        this.item_text = item_text;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_example() {
        return item_example;
    }

    public void setItem_example(String item_example) {
        this.item_example = item_example;
    }
}


