/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package restaurant;

public class MenuCard extends javax.swing.JPanel {
    private String menuName;
    public MenuCard(String menuName) {
        initComponents();
        this.menuName = menuName;
        
        this.loadComponents();
    }
    
    private void loadComponents(){
        this.nameValue.setText(menuName);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 75, 75));
        setPreferredSize(new java.awt.Dimension(450, 100));

        nameValue.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        nameValue.setForeground(new java.awt.Color(204, 255, 255));
        nameValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameValue.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameValue;
    // End of variables declaration//GEN-END:variables
}
