/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restaurant;

import models.Menu;
import models.Product;

/**
 *
 * @author leosc
 */
public class MiniFrame extends javax.swing.JFrame {

    private final int menuId;
    private final int productId;

    public MiniFrame(int menuId, int productId) {
        this.menuId = menuId;
        this.productId = productId;
        initComponents();
        loadComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuName = new javax.swing.JLabel();
        descriptionValue = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValue = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceValue = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 75, 75));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 0), null, new java.awt.Color(153, 153, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        menuName.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        menuName.setForeground(new java.awt.Color(255, 255, 255));
        menuName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuName.setText("Menu Name");

        descriptionValue.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descriptionValue.setForeground(new java.awt.Color(255, 255, 255));
        descriptionValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionValue.setText("Massa fina, molho de tomate, queijo mozzarella, manjericão fresco");

        typeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(255, 255, 204));
        typeLabel.setText("Type:");

        typeValue.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        typeValue.setForeground(new java.awt.Color(255, 255, 255));
        typeValue.setText("typeValue");

        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 204));
        priceLabel.setText("Price:");

        priceValue.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        priceValue.setForeground(new java.awt.Color(255, 255, 255));
        priceValue.setText("priceValue");

        descriptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 204));
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText("Description");
        descriptionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceValue))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeValue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(descriptionValue, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
            .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuName)
                .addGap(12, 12, 12)
                .addComponent(descriptionLabel)
                .addGap(4, 4, 4)
                .addComponent(descriptionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceValue))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadComponents() {
        for (Menu innerMenu : Restaurante.menuManager.getMenuList()) {
            if (innerMenu.getId() == menuId) {
                for (Product product : innerMenu.getFoodList()) {
                    if (product.getId() == productId) {
                        menuName.setText(innerMenu.getName());
                        descriptionValue.setText(product.getDescription());
                        priceValue.setText(String.valueOf(product.getPrice()));
                        typeValue.setText(product.getType());
                        break; // No need to continue searching once the product is found
                    }
                }
                break; // No need to continue searching once the menu is found
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel descriptionValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menuName;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceValue;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValue;
    // End of variables declaration//GEN-END:variables
}
