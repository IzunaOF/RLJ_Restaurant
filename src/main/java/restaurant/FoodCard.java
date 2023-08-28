package restaurant;

public class FoodCard extends javax.swing.JPanel {

    private final int menuId;
    private final int productId;

    public FoodCard(int menuId, int productId) {
        this.menuId = menuId;
        this.productId = productId;
        initComponents();
        loadComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuName = new javax.swing.JLabel();
        descriptionValue = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValue = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceValue = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 75, 75));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 0), null, new java.awt.Color(153, 153, 0)));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(450, 200));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceValue))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeValue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(descriptionValue, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuName)
                .addGap(12, 12, 12)
                .addComponent(descriptionLabel)
                .addGap(4, 4, 4)
                .addComponent(descriptionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceValue))
                .addGap(0, 125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void showProductPopUp(String name, String description, float price, String type) {
        menuName.setText(name);
        descriptionValue.setText(description);
        priceValue.setText(String.valueOf(price));
        typeValue.setText(type);
    }

    private void loadComponents() {
        Restaurante.productManager.updateProductPopUp(menuId, productId, this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel descriptionValue;
    private javax.swing.JLabel menuName;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceValue;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValue;
    // End of variables declaration//GEN-END:variables
}
