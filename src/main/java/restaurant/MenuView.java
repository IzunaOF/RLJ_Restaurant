/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant;

import controllers.MenuController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.border.LineBorder;
import models.Menu;
import models.Product;

public class MenuView extends JFrame {

    private static final int CARD_WIDTH = 430;
    private static final int CARD_HEIGHT = 40;
    private static boolean init = true;

    private MenuController controller;

    public MenuView() {
        initComponents();
        setLocationRelativeTo(null);
        this.controller = Restaurante.menuManager;
        this.controller.setPainelView(this);
    }

    public void updatePageLabel(int actualPage, int totalPages) {
        pageLabel.setText(actualPage + "/" + totalPages);
    }

    public void setController(MenuController controller) {
        this.controller = controller;
    }

    public void updateMenus(List<Menu> menus, boolean previousPage) {
        menusPanel.removeAll();
        menusPanel.repaint();
        menusPanel.revalidate();

        int x = 20;
        int gap = 5;

        for (int i = 0; i < menus.size(); i++) {
            Menu menu = menus.get(i);
            JPanel card = createMenuCard(menu, x);

            x += card.getSize().width + gap;

            card.setBorder(new LineBorder(new Color(200, 153, 12), 2));
            this.menusPanel.add(card);

            int padY = (int) (card.getSize().height * 0.40);
            int padX = (int) (card.getSize().width * 0.15);

            menusPanel.setSize(x + padX, card.getSize().height + padY);
        }
        if (init) {
            init = !init;
            this.setSize(menusPanel.getSize().width, menusPanel.getSize().height);
            setBounds(0, 0, getSize().width, getSize().height);
        }

    }

    private static JDialog createPopup(JFrame parentFrame, JPanel panel) {
        JDialog popup = new JDialog(parentFrame, "Descrição do Prato", true);
        popup.setSize(panel.getSize().width, panel.getSize().height);
        popup.setLayout(new BorderLayout());

        popup.add(panel, BorderLayout.CENTER);

        JButton closeButton = new JButton("Fechar");

        Color buttonBackground = new Color(0, 51, 102);

        closeButton.setBackground(buttonBackground);
        closeButton.setForeground(Color.WHITE);

        closeButton.setFont(new Font("Comic Sans MS", 900, 14));

        closeButton.setMargin(new Insets(0, 0, 0, 0));
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popup.dispose();
            }
        });
        popup.add(closeButton, BorderLayout.SOUTH);

        popup.setLocationRelativeTo(parentFrame);
        return popup;
    }

    private JPanel createMenuCard(Menu menu, int xx) {
        JPanel card = new MenuCard(menu.getName());

        int padding = 20;
        int y = 70;
        int gap = 5;

        for (Product product : menu.getFoodList()) {
            JPanel productCard = createFoodMiniCard(product, padding, y);
            JButton button = createFoodButton(menu, product, productCard);

            y = y + CARD_HEIGHT + gap;

            productCard.add(button);
            card.add(productCard);

            card.setBounds(xx, padding, productCard.getSize().width + padding * 2, y + padding);
        }

        return card;
    }

    private JPanel createFoodMiniCard(Product food, int x, int y) {
        JPanel foodCard = new FoodMiniCard(food.getName(), food.getPrice());
        foodCard.setBounds(x, y, CARD_WIDTH + x, CARD_HEIGHT);
        return foodCard;
    }

    private JButton createFoodButton(Menu menu, Product food, JPanel parent) {
        JButton button = new JButton("view");

        Color buttonBackground = new Color(200, 153, 12);

        button.setBackground(buttonBackground);
        button.setForeground(Color.WHITE);

        button.setFont(new Font("Comic Sans MS", 400, 14));

        button.setMargin(new Insets(0, 0, 0, 0));

        button.setActionCommand(food.getName());
        button.addActionListener((ActionEvent ev) -> {
            JPanel mini = new FoodCard(menu.getId(), food.getId());

            mini.setSize(500, 300);

            JDialog popup = createPopup(this, mini);
            popup.setVisible(true);
        });

        int width = parent.getSize().width;
        int height = parent.getSize().height;

        int buttonGapX = 10;
        int right = (int) (width * .30);

        button.setBounds(width - right - buttonGapX, height / 4, 50, height / 2);
        return button;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menusPanel = new javax.swing.JPanel();
        pageLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(0, 75, 75));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("       RadiantJoyful & Lively Bites");

        menusPanel.setBackground(new java.awt.Color(30, 75, 75));

        javax.swing.GroupLayout menusPanelLayout = new javax.swing.GroupLayout(menusPanel);
        menusPanel.setLayout(menusPanelLayout);
        menusPanelLayout.setHorizontalGroup(
            menusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menusPanelLayout.setVerticalGroup(
            menusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        pageLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pageLabel.setForeground(new java.awt.Color(255, 255, 255));
        pageLabel.setText("0 / 10");

        nextButton.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        nextButton.setText("next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        prevButton.setText("previous");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prevButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton)
                .addGap(54, 54, 54))
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menusPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(prevButton)
                    .addComponent(pageLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        controller.handlePageChange(-1);
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        controller.handlePageChange(1);
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel menusPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton prevButton;
    // End of variables declaration//GEN-END:variables
}
