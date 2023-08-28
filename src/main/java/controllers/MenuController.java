/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.List;

import models.Menu;
import models.Period;
import models.Product;

import restaurant.MenuView;
import java.util.ArrayList;

public final class MenuController {

    private int ID_CONTROL = 0;

    private final List<Menu> menus = new ArrayList<>();
    private MenuView view;
    public int currentPage = 0;
    private final int itemsPerPage = 3;

    public MenuController() {
    }

    public MenuController setPainelView(MenuView view) {
        this.view = view;
        view.setController(this);
        return this;
    }

    public List<Menu> getMenuList() {
        return this.menus;
    }

    public int handlePageChange(int direction) {

        int totalPages = (menus.size() + itemsPerPage - 1) / itemsPerPage;
        currentPage = Math.min(Math.max(currentPage + direction, 0), totalPages - 1);
        showMenus(currentPage);
        System.out.println(currentPage);
        return currentPage;
    }

    public void showMenus(int pageNumber) {
        int startIndex = pageNumber * itemsPerPage;
        int endIndex = Math.min(startIndex + itemsPerPage, menus.size());
        List<Menu> menusToShow = menus.subList(startIndex, endIndex);
        view.updateMenus(menusToShow, (pageNumber < 0));
        view.updatePageLabel(pageNumber + 1, (menus.size() + itemsPerPage - 1) / itemsPerPage);
    }

    public Menu addMenu(String name, String date, Period period, Boolean isActive, List<Product> products) {
        int currentID = ++ID_CONTROL;
        Menu newMenu = new Menu(currentID, name, date, period);

        for (Product product : products) {
            newMenu.addFood(product);
        }

        this.menus.add(newMenu);

        return newMenu;
    }

    public boolean containsProduct(Integer productId) {
        for (Menu menu : this.menus) {
            if (productId.equals(menu.getFoodList().get(productId).getId())) {
                return true;
            }
        }
        return false;
    }
}
