/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.HashMap;
import restaurant.Restaurante;
import models.Order;

public class OrderController {

    private HashMap<Integer, Order> orders = new HashMap<>();
    private Integer orderID = 1; // Initialize orderID

    public OrderController() {
    }

    public void addProduct(Integer orderID, Integer productId) {
        if (menuContainsProduct(productId)) {
            Order order = orders.get(orderID);
            order.addProduct(Restaurante.productManager.getProduct(productId).getId());
            
        } else {
            System.out.println("O produto não faz parte do menu selecionado.");
        }
    }

    public void createOrder(Integer orderID, Order order) {
        orders.put(orderID, order);
    }

    private boolean menuContainsProduct(Integer productId) {
        return Restaurante.menuManager.containsProduct(productId);
    }
}
