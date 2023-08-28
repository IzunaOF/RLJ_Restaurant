package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import restaurant.Restaurante;

public class Order {

    private Integer menuID;
    private List<Integer> ordering;

    public Order(Integer menuID, List<Integer> ordering) {
  
        this.menuID = menuID;
        this.ordering = ordering;
    }
    
    public void addProduct(Integer id){
        ordering.add(id);
    }

}
