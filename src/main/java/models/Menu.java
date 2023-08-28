package models;

import java.util.ArrayList;

public class Menu {

    private int id;
    private String name;
    private String date;
    private Period shift;
    private boolean isActive;
    private final ArrayList<Product> foodList = new ArrayList<>();

    public Menu(int id, String name, String date, Period shift) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.shift = shift;
        this.isActive = true;
    }

    private boolean setIsActive(boolean isActive) {
        return this.isActive = isActive;
    }

    public boolean desactive() {
        return setIsActive(false);
    }

    public boolean active() {
        return setIsActive(true);
    }

    public boolean isIsActive() {
        return isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Product> getFoodList() {
        return foodList;
    }

    public void addFood(Product food) {
        foodList.add(food);
    }

    public void removeFood(Product food) {
        foodList.remove(food);
    }

    public Period getShift() {
        return shift;
    }

    public void setShift(Period shift) {
        this.shift = shift;
    }
}
