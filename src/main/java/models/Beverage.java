package models;

public class Beverage extends Product {

    private String size;
    private float alcoholContent;

    public Beverage(int id,String name, float price,   String size, float alcoholContent,String description) {
        super(id, name, price, description);
        this.size = size;
        this.alcoholContent = alcoholContent;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(float alcoholContent) {
        this.alcoholContent = alcoholContent;
    }
}
