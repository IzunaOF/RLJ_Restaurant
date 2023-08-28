package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Product;
import models.Food;
import models.Beverage;

import models.Menu;
import restaurant.FoodCard;
import restaurant.Restaurante;

public class ProductController {

    private int ID_CONTROL = 0;

    private List<Product> products = new ArrayList<>();

    public ProductController() {
    }

    private void setProduct(Product product) {
        this.products.add(product);
    }

    public Product addProduct(String name, String description, float price) {
        Product product = new Product(ID_CONTROL++, name, price, description);
        this.setProduct(product);
        return product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(int productID) {
        return products.get(productID);
    }

    public void updateProductPopUp(int menuID, int productID, FoodCard card) {
        for (Menu menu : Restaurante.menuManager.getMenuList()) {
            if (menu.getId() == menuID) {
                Product p = this.products.get(productID);
                card.showProductPopUp(p.getName(), p.getDescription(), p.getPrice(), p.getType());
                break;
            }
        }
    }
    
    public boolean containsProduct(Integer productId){
        for (Product product : Restaurante.productManager.getProducts()) {
            if (productId.equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public void addFood(String name, String description, float price, String type, ArrayList<String> ingredients) {
        Food food = new Food(ID_CONTROL++, type, name, price, description);
        food.setIngredients(ingredients);
        this.setProduct(food);
    }

    public void addBeverage(String name, String description, float price, String size, float alcoholContent) {
        Beverage drink = new Beverage(ID_CONTROL++, name, price, size, alcoholContent, description);
        drink.setAlcoholContent(alcoholContent);
        this.setProduct(drink);
    }

    public List<Beverage> getBeverageList() {
        List<Beverage> beverages = new ArrayList<>();

        for (Product product : products) {
            if (product instanceof Beverage beverage) {
                beverages.add(beverage);
            }
        }

        return beverages;
    }

    public List<Food> getFoodList() {
        List<Food> foods = new ArrayList<>();

        for (Product product : products) {
            if (product instanceof Food food) {
                foods.add(food);
            }
        }

        return foods;
    }

}
