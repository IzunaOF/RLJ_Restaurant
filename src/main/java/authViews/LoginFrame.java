
package authViews;

import restaurant.FrontDesk;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        loadFrame();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryUserType = new javax.swing.ButtonGroup();
        checkbox1 = new java.awt.Checkbox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usernameValue = new javax.swing.JTextField();
        passwordValue = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        clientButton = new javax.swing.JButton();
        clientRadio = new javax.swing.JRadioButton();
        managerRadio = new javax.swing.JRadioButton();
        loginTitle = new javax.swing.JLabel();
        storeLabel = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 75, 75));

        jPanel2.setBackground(new java.awt.Color(0, 75, 75));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, java.awt.Color.darkGray, null));

        usernameValue.setBackground(new java.awt.Color(45, 75, 75));
        usernameValue.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        usernameValue.setForeground(new java.awt.Color(255, 255, 255));
        usernameValue.setText("test");
        usernameValue.setBorder(null);
        usernameValue.setMargin(new java.awt.Insets(2, 15, 2, 6));
        usernameValue.setMinimumSize(new java.awt.Dimension(75, 30));
        usernameValue.setPreferredSize(new java.awt.Dimension(200, 40));

        passwordValue.setBackground(new java.awt.Color(45, 75, 75));
        passwordValue.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        passwordValue.setForeground(new java.awt.Color(255, 255, 255));
        passwordValue.setText("123");
        passwordValue.setBorder(null);
        passwordValue.setMargin(new java.awt.Insets(2, 15, 2, 6));
        passwordValue.setMinimumSize(new java.awt.Dimension(75, 30));
        passwordValue.setPreferredSize(new java.awt.Dimension(200, 40));

        usernameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("username");

        passwordLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("password");

        clientButton.setBackground(new java.awt.Color(0, 51, 51));
        clientButton.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        clientButton.setForeground(new java.awt.Color(255, 255, 255));
        clientButton.setText("Submit");
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonActionPerformed(evt);
            }
        });

        entryUserType.add(clientRadio);
        clientRadio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        clientRadio.setForeground(new java.awt.Color(255, 255, 255));
        clientRadio.setSelected(true);
        clientRadio.setText("Client");
        clientRadio.setActionCommand("client");

        entryUserType.add(managerRadio);
        managerRadio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        managerRadio.setForeground(new java.awt.Color(255, 255, 255));
        managerRadio.setText("Manager");
        managerRadio.setActionCommand("manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(clientRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(managerRadio))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(clientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientRadio)
                    .addComponent(managerRadio))
                .addGap(37, 37, 37)
                .addComponent(clientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        loginTitle.setBackground(new java.awt.Color(255, 255, 0));
        loginTitle.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(255, 255, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("LOGIN");

        storeLabel.setBackground(new java.awt.Color(255, 255, 0));
        storeLabel.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        storeLabel.setForeground(new java.awt.Color(255, 255, 0));
        storeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeLabel.setText("RadiantJoyful & Lively Bites");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(storeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonActionPerformed
        this.authenticate();
    }//GEN-LAST:event_clientButtonActionPerformed

    private void loadFrame(){
        setTitle("Login View");
    }
    
    private void authenticate(){
        String username = usernameValue.getText();
        String password = passwordValue.getText();
        
        String userType = entryUserType.getSelection().getActionCommand();

        if("test".equals(username) && "123".equals(password) && "client".equals(userType)){
            this.dispose();
            new FrontDesk().setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private javax.swing.JButton clientButton;
    private javax.swing.JRadioButton clientRadio;
    private javax.swing.ButtonGroup entryUserType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JRadioButton managerRadio;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordValue;
    private javax.swing.JLabel storeLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameValue;
    // End of variables declaration//GEN-END:variables
}
