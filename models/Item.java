package models;

public class Item {
    private String texto;
    private String videoURL;
    private String imageURL;

    public Item() {

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void inspect() {
        System.out.println(this.texto == null ? "No text found..."
                : this.texto);
        System.out.println(this.videoURL == null ? "No video Url found..."
                : this.videoURL);
        System.out.println(this.imageURL == null ? "No image Url found" : this.imageURL + "\n");
    }

}
