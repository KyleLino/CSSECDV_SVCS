package View;

import Controller.Main;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.WindowConstants;

import java.util.ArrayList;

import Model.User;

import java.util.Date;
import java.sql.Timestamp;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
    
    //FOR DISABLE USER
    public int lockCounter = 0;
    public String firstUsername = "";
    public boolean isFirstUsername = true;
    
    //CURRENT USER
    public String currentUsername = "";
    public int currentRole = 0;
    public User currentUser;
    
    
    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        HomePnl = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        managerBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        clientBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setMinimumSize(new java.awt.Dimension(800, 450));

        HomePnl.setBackground(new java.awt.Color(102, 102, 102));
        HomePnl.setPreferredSize(new java.awt.Dimension(801, 500));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Navigation.setBackground(new java.awt.Color(204, 204, 204));

        adminBtn.setBackground(new java.awt.Color(250, 250, 250));
        adminBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminBtn.setText("Admin Home");
        adminBtn.setFocusable(false);
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        managerBtn.setBackground(new java.awt.Color(250, 250, 250));
        managerBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        managerBtn.setText("Manager Home");
        managerBtn.setFocusable(false);
        managerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(250, 250, 250));
        staffBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffBtn.setText("Staff Home");
        staffBtn.setFocusable(false);
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        clientBtn.setBackground(new java.awt.Color(250, 250, 250));
        clientBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clientBtn.setText("Client Home");
        clientBtn.setFocusable(false);
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(250, 250, 250));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(managerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePnlLayout = new javax.swing.GroupLayout(HomePnl);
        HomePnl.setLayout(HomePnlLayout);
        HomePnlLayout.setHorizontalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePnlLayout.createSequentialGroup()
                .addComponent(Navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePnlLayout.setVerticalGroup(
            HomePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        adminHomePnl.showPnl("home");
        contentView.show(Content, "adminHomePnl");
    }//GEN-LAST:event_adminBtnActionPerformed

    private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBtnActionPerformed
        managerHomePnl.showPnl("home");
        contentView.show(Content, "managerHomePnl");
    }//GEN-LAST:event_managerBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
        staffHomePnl.showPnl("home");
        contentView.show(Content, "staffHomePnl");
    }//GEN-LAST:event_staffBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
        clientHomePnl.showPnl("home");
        contentView.show(Content, "clientHomePnl");
    }//GEN-LAST:event_clientBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        main.sqlite.addLogs("NOTICE", currentUser.currentUsername, "User has logged out", new Timestamp(new Date().getTime()).toString());
        frameView.show(Container, "loginPnl");
    }//GEN-LAST:event_logoutBtnActionPerformed

    public Main main;
    public Login loginPnl = new Login();
    public Register registerPnl = new Register();
    
    private AdminHome adminHomePnl = new AdminHome();
    private ManagerHome managerHomePnl = new ManagerHome();
    private StaffHome staffHomePnl = new StaffHome();
    private ClientHome clientHomePnl = new ClientHome();
    
    private CardLayout contentView = new CardLayout();
    private CardLayout frameView = new CardLayout();
    
    public void init(Main controller){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("CSSECDV - SECURITY Svcs");
        this.setLocationRelativeTo(null);
        
        this.main = controller;
        loginPnl.frame = this;
        registerPnl.frame = this;
        
        adminHomePnl.init(main.sqlite);
        clientHomePnl.init(main.sqlite);
        managerHomePnl.init(main.sqlite);
        staffHomePnl.init(main.sqlite);
        
        Container.setLayout(frameView);
        Container.add(loginPnl, "loginPnl");
        Container.add(registerPnl, "registerPnl");
        Container.add(HomePnl, "homePnl");
        frameView.show(Container, "loginPnl");
        
        Content.setLayout(contentView);
        Content.add(adminHomePnl, "adminHomePnl");
        Content.add(managerHomePnl, "managerHomePnl");
        Content.add(staffHomePnl, "staffHomePnl");
        Content.add(clientHomePnl, "clientHomePnl");
        
        this.setVisible(true);
    }
    
    public void mainNav(){
        String curruser = currentUsername;
        frameView.show(Container, "homePnl");
        
        //Disable buttons, not needed anymore
        adminBtn.setVisible(false);
        clientBtn.setVisible(false);
        managerBtn.setVisible(false);
        staffBtn.setVisible(false);
        
        //Change view depending on role (5 - admin, 4 - Manager, 3 - Staff, 2 - Client, 1 - Disabled)
        switch (currentRole) {
            case 5:
                adminHomePnl.showPnl("home");
                contentView.show(Content, "adminHomePnl");
                adminBtn.setVisible(true);
                //Add set user method to each panel to pass current username?
                break;
            case 4:
                managerHomePnl.showPnl("home");
                contentView.show(Content, "managerHomePnl");
                managerBtn.setVisible(true);
                break;
            case 3:
                staffHomePnl.showPnl("home");
                contentView.show(Content, "staffHomePnl");
                staffBtn.setVisible(true);
                break;
            default:
                clientHomePnl.showPnl("home");
                contentView.show(Content, "clientHomePnl");
                clientBtn.setVisible(true);
                System.out.println("current user " + curruser);
        }
    }
    
    public void loginNav(){
        frameView.show(Container, "loginPnl");
    }
    
    public boolean loginAction(String username, String password){
        ArrayList<User> users = main.sqlite.getUsers();
        boolean isExist = false;
        boolean isSuccess = false;
        
        if(isFirstUsername){
            firstUsername = username;
            isFirstUsername = false;
        }
        
        for(int nCtr = 0; nCtr < users.size(); nCtr++){
            
            if(users.get(nCtr).getUsername().equalsIgnoreCase(username)){//username exist
                isExist = true;
                if(users.get(nCtr).getPassword().equals(getMd5(password))){//password correct
                    if(users.get(nCtr).getLocked() != 1){//user not locked
                        isSuccess = true;
                        System.out.println("login successful");
                        
                        //LOG FOR LOGIN
                        main.sqlite.addLogs("NOTICE", username.toLowerCase(), "User Logged In Successfully", new Timestamp(new Date().getTime()).toString());
                        
                        //Current User For App Functionalities
                        currentUsername = users.get(nCtr).getUsername();
                        currentRole = users.get(nCtr).getRole();
                        
                        currentUser.currentUsername = currentUsername;
                        currentUser.currentRole = currentRole;
                        
                        
                        
                        lockCounter = 0;
                    }else{//user locked
                        JOptionPane.showMessageDialog(null, "Exceeded maximum login attempts. Please communicate with the Admin in-person in order to re-enable the account.", "User Locked", JOptionPane.ERROR_MESSAGE);
                        System.out.println("User Locked. Communicate with the Admin in-person in order to re-enable the account");
                    }
                }else if(firstUsername.equalsIgnoreCase(username)){//wrong password same user
                    lockCounter ++;
                    System.out.println("Incorrect Password1");
                    System.out.println(lockCounter);
                }else if(!firstUsername.equalsIgnoreCase(username)){//wrong password diff user
                    lockCounter = 0;
                    System.out.println("Incorrect Password2");
                    System.out.println(lockCounter);
                    firstUsername = username;
                }
                
                if(lockCounter == 5 && users.get(nCtr).getLocked() != 1){
                    System.out.println("User Locked. Communicate with the Admin in-person in order to re-enable the account");
                    
                    //If locked, set user's role to Disabled
                    main.sqlite.updateUserLock(username.toLowerCase(), 1);
                    main.sqlite.updateUserRole(username, 1);
                    main.sqlite.addLogs("NOTICE", username.toLowerCase(), "User is locked after exceeding max login attempts", new Timestamp(new Date().getTime()).toString());
                    JOptionPane.showMessageDialog(null, "Exceeded maximum login attempts. Please communicate with the Admin in-person in order to re-enable the account.", "User Locked", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        if(!isExist){
            lockCounter = 0;
            System.out.println("User Not Exist");
            System.out.println(lockCounter);
        }

            
            // CASE INSENSITIVE
            // CORRECT INPUTS
            /*
            if(users.get(nCtr).getUsername().equalsIgnoreCase(username) && users.get(nCtr).getPassword().equals(getMd5(password))){
                //NOT LOCKED
                if(users.get(nCtr).getLocked() != 1){
                    isExist = true;
                    System.out.println("login successful");
                    //LOG FOR LOGIN
                    main.sqlite.addLogs("NOTICE", username.toLowerCase(), "User Logged In Successfully", new Timestamp(new Date().getTime()).toString());
                }
                //LOCKED
                else{
                    System.out.println("User Locked. Communicate with the Admin in-person in order to re-enable the account");
                }
                
            }
            //SAME USERNAME FROM BEFORE
            else if(users.get(nCtr).getUsername().equalsIgnoreCase(username) && firstUsername.equalsIgnoreCase(username)){
                lockCounter ++;
                System.out.println("Incorrect Password1");
                System.out.println(lockCounter);
            }
            //DIFF USERNAME EXIST
            else if(users.get(nCtr).getUsername().equalsIgnoreCase(username) && !firstUsername.equalsIgnoreCase(username)){
                lockCounter = 1;
                System.out.println("Incorrect Password / NEW USERNAME");
                System.out.println(lockCounter);
                firstUsername = username;
            }
            //DIFF USERNAME NOT EXIST
            else if(!firstUsername.equalsIgnoreCase(username)){
                lockCounter = 0;
                System.out.println("User Not Exist");
                System.out.println(lockCounter);
                firstUsername = username;
            }
            
            if(lockCounter == 5){
                System.out.println("User Locked. Communicate with the Admin in-person in order to re-enable the account");
                main.sqlite.removeUser(username.toLowerCase());
                main.sqlite.addUser(username.toLowerCase(), getMd5(password),users.get(nCtr).getRole(),1);
            }
        }
        
        */
        
        return isSuccess;
    }
    
    public void registerNav(){
        frameView.show(Container, "registerPnl");
    }
    
    public boolean registerAction(String username, String password, String confpass){
        ArrayList<User> users = main.sqlite.getUsers();
        boolean isRegistered = false;
        boolean isUnique = true;
        if(username.trim().isEmpty() || password.trim().isEmpty() || confpass.trim().isEmpty()){ // CHECK IF INPUTS ARE EMPTY
            JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Register", JOptionPane.ERROR_MESSAGE);
            System.out.println("empty field/s");  
        }else{
            if(password.equals(confpass)){ // CHECKS IF PASSWORD AND CONFPASSWORD IS THE SAME
                
                //add condition for strong password to push in CHECKS IF USERNAME ALREADY EXIST
                if(checkString(password)){
                    for(int nCtr = 0; nCtr < users.size(); nCtr++){// CHECKS IF USERNAME ALREADY EXIST
                        //if(users.get(nCtr).getUsername().equals(username)){
                        if(users.get(nCtr).getUsername().equals(username.toLowerCase())){ // NEW Mar.16,2023
                        isUnique = false;
                        }
                    }
                    if(isUnique){
                        String hashPassword = getMd5(password);
                        // CASE INSENSITIVE
                        main.sqlite.addUser(username.toLowerCase(), hashPassword);//HASH PASSWORD
                        //LOG FOR USER CREATION 
                        main.sqlite.addLogs("NOTICE", username.toLowerCase(), "User creation successful", new Timestamp(new Date().getTime()).toString());
                        JOptionPane.showMessageDialog(null, "Registration successful. You may now login using the same credentials.", "Register", JOptionPane.PLAIN_MESSAGE);
                        isRegistered = true;
                        System.out.println("created a user");
                    }else{
                        JOptionPane.showMessageDialog(null, "Username already exists.", "Register", JOptionPane.ERROR_MESSAGE);
                        System.out.println("username exist");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Password is weak.", "Register", JOptionPane.ERROR_MESSAGE);
                    System.out.println("password must be strong");
                }
               
            }else{
                JOptionPane.showMessageDialog(null, "Passwords do not match.", "Register", JOptionPane.ERROR_MESSAGE);
                System.out.println("password & confirm password not match");
            }
        }
        return isRegistered;
    }
    //MD5 HASHING
    public String getMd5(String input)
    {
        try {
 
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
 
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    // CHECKS IF THERE ARE ATLEAST 12 CHARACTERS, UPPERCASE, LOWERCASE, NUMBER, SPECIAL CHARACTER
    private boolean checkString(String str) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialFlag = false;
        boolean twelveFlag = false;
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        
        if(str.length() >= 12){
            twelveFlag = true;
        }
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } 
            else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            else if(specialCharactersString.contains(Character.toString(ch))) {
                //System.out.println(inputString+ " contains special character");
                specialFlag = true;
            }    
            if(twelveFlag && numberFlag && capitalFlag && lowerCaseFlag && specialFlag)
                return true;
        }
        return false;
    }
    
    //DELETE
    public void purchaseAction(String itemName, int itemStock, int itemQuantity){
        //System.out.println(currentUsername);
        //System.out.println(currentRole);
        System.out.println("HEREEEEEE");
        System.out.println(itemName);
        System.out.println(itemStock);
        System.out.println(itemQuantity);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel HomePnl;
    private javax.swing.JPanel Navigation;
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton clientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managerBtn;
    private javax.swing.JButton staffBtn;
    // End of variables declaration//GEN-END:variables
}
