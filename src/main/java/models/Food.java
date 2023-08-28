package models;

import java.util.ArrayList;

public class Food extends Product {

    private String type;
    private ArrayList<String> ingredients = new ArrayList<>();
    private boolean isVegetarian;

    public Food(int id, String type, String name, float price, String description) {
        super(id, name, price, description);
        this.type = type;
        this.isVegetarian = false;
    }

    public boolean isIsVegetarian() {
        return isVegetarian;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
}
