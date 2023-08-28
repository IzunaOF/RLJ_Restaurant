package restaurant;

import authViews.LoginFrame;
import controllers.MenuController;
import controllers.PeriodController;
import controllers.ProductController;
import java.util.ArrayList;

import java.util.Arrays;

import models.PeriodEnum;

public class Restaurante {

    /**
     * Contêm os cardápios do restaurante;
     */
    public static final ProductController productManager = new ProductController();
    public static final MenuController menuManager = new MenuController();
    public static final PeriodController periodManager = new PeriodController();

    public static void main(String[] args) {
        periodManager.setPeriod(PeriodEnum.MANHA, "Café da Manhã", "08:00", "10:00");
        periodManager.setPeriod(PeriodEnum.TARDE, "Almoço", "12:00", "14:00");
        periodManager.setPeriod(PeriodEnum.NOITE, "Jantar", "18:00", "20:00");

        // Alimentos
        productManager.addFood("Pizza", "Delicious pizza with tomato sauce and cheese.", 12.99f, "Food",
                new ArrayList<>(Arrays.asList("Dough", "Tomato sauce", "Cheese")));

        productManager.addFood("Burger", "Classic burger with lettuce, tomato, and beef patty.", 8.99f, "Food",
                new ArrayList<>(Arrays.asList("Bun", "Lettuce", "Tomato", "Beef patty")));

        productManager.addFood("Salad", "Fresh salad with mixed greens and vinaigrette dressing.", 6.49f, "Food",
                new ArrayList<>(Arrays.asList("Mixed greens", "Vinaigrette dressing")));

        productManager.addFood("Pasta", "Pasta with marinara sauce and meatballs.", 10.99f, "Food",
                new ArrayList<>(Arrays.asList("Pasta", "Marinara sauce", "Meatballs")));

        productManager.addFood("Sandwich", "Turkey and cheese sandwich with mustard.", 7.99f, "Food",
                new ArrayList<>(Arrays.asList("Bread", "Turkey", "Cheese", "Mustard")));

        productManager.addFood("Omelette", "Fluffy omelette with veggies and cheese.", 9.49f, "Food",
                new ArrayList<>(Arrays.asList("Eggs", "Veggies", "Cheese")));

        // Bebidas
        productManager.addBeverage("Soda", "Refreshing carbonated soft drink.", 2.49f, "Regular", 0f);

        productManager.addBeverage("Iced Tea", "Chilled tea with lemon slice.", 1.99f, "Regular", 0f);

        productManager.addBeverage("Coffee", "Hot brewed coffee.", 2.99f, "Small", 0f);

        productManager.addBeverage("Beer", "Cold beer with 5% alcohol content.", 5.99f, "Bottle", 5.0f);

        menuManager.addMenu("Café da Manhã", "2023-08-26", periodManager.getPeriod(PeriodEnum.MANHA), Boolean.TRUE, productManager.getProducts());
        menuManager.addMenu("Almoço", "2023-08-26", periodManager.getPeriod(PeriodEnum.TARDE), Boolean.TRUE, productManager.getProducts());
        menuManager.addMenu("Jantar", "2023-08-26", periodManager.getPeriod(PeriodEnum.NOITE), Boolean.TRUE, productManager.getProducts());
        menuManager.addMenu("Menu de Sobremesas", "2023-08-26", periodManager.getPeriod(PeriodEnum.TARDE), Boolean.TRUE, productManager.getProducts());
        menuManager.addMenu("Happy Hour", "2023-08-26", periodManager.getPeriod(PeriodEnum.NOITE), Boolean.TRUE, productManager.getProducts());
        
        new LoginFrame().setVisible(true);
        //new FrontDesk().setVisible(true);
    }
}
