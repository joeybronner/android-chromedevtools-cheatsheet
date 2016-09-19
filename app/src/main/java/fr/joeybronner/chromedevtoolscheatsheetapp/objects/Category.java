package fr.joeybronner.chromedevtoolscheatsheetapp.objects;

public class Category {
    private String text;
    private int imageUrl;

    public Category(String text, int image) {
        this.text = text;
        this.imageUrl = image;
    }

    public String getText() {
        return text;
    }

    public int getImageUrl() {
        return imageUrl;
    }
}
