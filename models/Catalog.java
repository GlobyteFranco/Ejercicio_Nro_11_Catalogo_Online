package models;

import java.util.Map;

public class Catalog {
    Map<Item, Integer> anualCatalog;

    public Catalog(Map<Item, Integer> anualCatalog) {
        this.anualCatalog = anualCatalog;
    }

    public Map<Item, Integer> getAnualCatalog() {
        return anualCatalog;
    }

    public void setAnualCatalog(Map<Item, Integer> anualCatalog) {
        this.anualCatalog = anualCatalog;
    }

}
