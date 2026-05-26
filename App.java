import models.Item;
import models.ItemBuilder;

public class App {
    public static void main(String[] args) {
        ItemBuilder myItemBuilder = new ItemBuilder();
        Item myItem1 = myItemBuilder.addText("Solo Texto").build();
        Item myItem2 = myItemBuilder.addText("Texto y la imagen").addImageUrl("Non existant URL xd").build();
        Item myItem3 = myItemBuilder.addText("Objeto completo").addImageUrl("another non existant url")
                .addVideoUrl("same shit ").build();
        myItem1.inspect();
        myItem2.inspect();
        myItem3.inspect();
    }
}
