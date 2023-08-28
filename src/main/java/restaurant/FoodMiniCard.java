package restaurant;

import java.util.Arrays;

public class FoodMiniCard extends javax.swing.JPanel {

    private final String title;
    private final float price;

    public FoodMiniCard(String title, float price) {
        initComponents();
        this.title = title;
        this.price = price;

        this.loadComponents();
    }

    private void loadComponents() {
        setProductName();
        formatAndSetPrice();
    }

    private void setProductName() {
        this.nameValue.setText(this.title);
    }

    private void formatAndSetPrice() {
        String formattedPrice = formatPrice(price);
        this.priceValue.setText(formattedPrice);
    }

    private String formatPrice(float price) {
        String[] parts = String.valueOf(price).split("\\.");
        String formattedPrice = String.format("R$ %s,%s", parts[0], getFormattedDecimalPart(parts[1]));
        return formattedPrice;
    }

    private String getFormattedDecimalPart(String decimalPart) {
        return decimalPart.length() > 2 ? decimalPart.substring(0, 2) : decimalPart;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        priceValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(40, 75, 75));
        setPreferredSize(new java.awt.Dimension(400, 30));

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 204));
        nameLabel.setText("x1");

        nameValue.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nameValue.setForeground(new java.awt.Color(255, 255, 255));
        nameValue.setText("Food Name");

        priceValue.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        priceValue.setForeground(new java.awt.Color(204, 255, 204));
        priceValue.setText("Food Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(priceValue)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameValue)
                    .addComponent(priceValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameValue;
    private javax.swing.JLabel priceValue;
    // End of variables declaration//GEN-END:variables
}
