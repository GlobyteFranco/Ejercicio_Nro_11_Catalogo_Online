package models;

public class ItemBuilder {
    Item itemCatalog;

    public ItemBuilder() {
        this.reset();
    }

    public void reset() {
        itemCatalog = new Item();
    }

    public ItemBuilder addText(String text) {
        this.itemCatalog.setTexto(text);
        return this;

    }

    public ItemBuilder addVideoUrl(String videoUrl) {
        this.itemCatalog.setVideoURL(videoUrl);
        return this;
    }

    public ItemBuilder addImageUrl(String imageUrl) {
        this.itemCatalog.setImageURL(imageUrl);
        return this;
    }

    public Item build() {
        Item itemReturn = this.itemCatalog;
        reset();
        return itemReturn;
    }

}
