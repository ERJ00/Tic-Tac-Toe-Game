/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {

    private String startGame = "x";
    private int xcount = 0;
    private int ocount = 0;
    private String[][] board;
    
    public TIC_TAC_TOE_GAME() {
        board = new String[3][3];
        initComponents();
    }
    
    private void setNewBoard(){
        txtB1.setText("");
        txtB2.setText("");
        txtB3.setText("");
        
        txtB4.setText("");
        txtB5.setText("");
        txtB6.setText("");

        txtB7.setText("");
        txtB8.setText("");
        txtB9.setText("");
        
        txtB1.setEnabled(true); 
        txtB2.setEnabled(true);
        txtB3.setEnabled(true);
        
        txtB4.setEnabled(true);
        txtB5.setEnabled(true);
        txtB6.setEnabled(true);

        txtB7.setEnabled(true);
        txtB8.setEnabled(true);
        txtB9.setEnabled(true);
        
        txtB1.setBackground(Color.DARK_GRAY);
        txtB2.setBackground(Color.DARK_GRAY);
        txtB3.setBackground(Color.DARK_GRAY);
        
        txtB4.setBackground(Color.DARK_GRAY);
        txtB5.setBackground(Color.DARK_GRAY);
        txtB6.setBackground(Color.DARK_GRAY);
        
        txtB7.setBackground(Color.DARK_GRAY);
        txtB8.setBackground(Color.DARK_GRAY);
        txtB9.setBackground(Color.DARK_GRAY);
    }
    
    private void getBoard(){
        board[0][0] = txtB1.getText();
        board[0][1] = txtB2.getText();
        board[0][2] = txtB3.getText();
        
        board[1][0] = txtB4.getText();
        board[1][1] = txtB5.getText();
        board[1][2] = txtB6.getText();
        
        board[2][0] = txtB7.getText();
        board[2][1] = txtB8.getText();
        board[2][2] = txtB9.getText();
    }
    
    private void checkWinner(){
        getBoard();
        for(int i=0;i<3;i++){
            //check row for x
            if(board[i][0].equals("x") && board[i][1].equals("x") && board[i][2].equals("x")){
                score("x");
            }
            //check column for x
            else if(board[0][i].equals("x") && board[1][i].equals("x") && board[2][i].equals("x")){
                score("x");
            }
            //check row for o
            else if(board[i][0].equals("o") && board[i][1].equals("o") && board[i][2].equals("o")){
                score("o");
            }
            //check column for o
            else if(board[0][i].equals("o") && board[1][i].equals("o") && board[2][i].equals("o")){
                score("o");
            }
        }
        //check diagonal_1 for x
        if(board[0][0].equals("x") && board[1][1].equals("x") && board[2][2].equals("x")){
            score("x");
        }    
        //check diagonal_2 for x
        else if(board[0][2].equals("x") && board[1][1].equals("x") && board[2][0].equals("x")){
            score("x");
        }
        //check diagonal_1 for o
        if(board[0][0].equals("o") && board[1][1].equals("o") && board[2][2].equals("o")){
            score("o");
        }    
        //check diagonal_2 for o
        else if(board[0][2].equals("o") && board[1][1].equals("o") && board[2][0].equals("o")){
            score("o");
        }
    }
    
    private void score(String player){
        if(player.equals("x")){
            xcount++;
            playerX.setText(String.valueOf(xcount));
        }
        else{
            ocount++;
            playerO.setText(String.valueOf(ocount));
        }
        int result = JOptionPane.showConfirmDialog(
        null,
        "Player " + player + " Win! Do you want to continue?",
        "TIC TAC TOE",
        JOptionPane.YES_NO_OPTION
    );

    if (result == JOptionPane.OK_OPTION) {
        setNewBoard();
    } else if (result == JOptionPane.NO_OPTION) {
        xcount = 0;
        ocount = 0;
        playerX.setText("xxxxxx");
        playerO.setText("xxxxxx");
        startGame = "o";
        choosePlayer();
        setNewBoard();
    }
    }
    
    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("x")){
            playerTurn.setText("Your turn Player O");
            startGame = "o";
        }
        else{
            playerTurn.setText("Your turn Player X");
            startGame = "x";
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        txtB2 = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        txtB1 = new javax.swing.JButton();
        txtB3 = new javax.swing.JButton();
        txtB6 = new javax.swing.JButton();
        txtB5 = new javax.swing.JButton();
        txtB4 = new javax.swing.JButton();
        txtB9 = new javax.swing.JButton();
        txtB8 = new javax.swing.JButton();
        txtB7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameO = new javax.swing.JLabel();
        nameX = new javax.swing.JLabel();
        playerX = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        playerTurn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setResizable(false);

        GamePanel.setBackground(new java.awt.Color(0, 0, 0));
        GamePanel.setForeground(new java.awt.Color(0, 0, 0));

        title.setBackground(new java.awt.Color(102, 102, 102));
        title.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("TIC TAC TOE");

        txtB2.setBackground(new java.awt.Color(51, 51, 51));
        txtB2.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB2ActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(153, 153, 255));
        resetButton.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(51, 51, 255));
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 153, 153));
        exitButton.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(204, 0, 51));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        txtB1.setBackground(new java.awt.Color(51, 51, 51));
        txtB1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB1ActionPerformed(evt);
            }
        });

        txtB3.setBackground(new java.awt.Color(51, 51, 51));
        txtB3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB3ActionPerformed(evt);
            }
        });

        txtB6.setBackground(new java.awt.Color(51, 51, 51));
        txtB6.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB6ActionPerformed(evt);
            }
        });

        txtB5.setBackground(new java.awt.Color(51, 51, 51));
        txtB5.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB5ActionPerformed(evt);
            }
        });

        txtB4.setBackground(new java.awt.Color(51, 51, 51));
        txtB4.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB4ActionPerformed(evt);
            }
        });

        txtB9.setBackground(new java.awt.Color(51, 51, 51));
        txtB9.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB9ActionPerformed(evt);
            }
        });

        txtB8.setBackground(new java.awt.Color(51, 51, 51));
        txtB8.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB8ActionPerformed(evt);
            }
        });

        txtB7.setBackground(new java.awt.Color(51, 51, 51));
        txtB7.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        txtB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtB7ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SCORE");

        nameO.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        nameO.setForeground(new java.awt.Color(255, 255, 255));
        nameO.setText("PLAYER O :");

        nameX.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        nameX.setForeground(new java.awt.Color(255, 255, 255));
        nameX.setText("PLAYER X :");

        playerX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playerX.setForeground(new java.awt.Color(255, 255, 255));
        playerX.setText("xxxxxx");

        playerO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        playerO.setForeground(new java.awt.Color(255, 255, 255));
        playerO.setText("xxxxxx");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameO, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerO, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameX, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        playerTurn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerTurn.setForeground(new java.awt.Color(255, 255, 255));
        playerTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerTurn.setText("Start with Player X");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Created By: Emman");

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addComponent(txtB7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtB8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtB9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(GamePanelLayout.createSequentialGroup()
                                    .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtB6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(GamePanelLayout.createSequentialGroup()
                                    .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamePanelLayout.createSequentialGroup()
                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(playerTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamePanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(playerTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB2ActionPerformed
        txtB2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB2.setForeground(Color.red);
        }
        else{
            txtB2.setForeground(Color.green);
        }
        txtB2.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB2ActionPerformed

    private void txtB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB1ActionPerformed
        txtB1.setText(startGame);
        if(startGame.equalsIgnoreCase("x")){
            txtB1.setForeground(Color.red);
        }
        else{
            txtB1.setForeground(Color.green);
        }
        txtB1.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB1ActionPerformed

    private void txtB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB3ActionPerformed
        txtB3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB3.setForeground(Color.red);
        }
        else{
            txtB3.setForeground(Color.green);
        }
        txtB3.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB3ActionPerformed

    private void txtB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB6ActionPerformed
        txtB6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB6.setForeground(Color.red);
        }
        else{
            txtB6.setForeground(Color.green);
        }
        txtB6.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB6ActionPerformed

    private void txtB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB5ActionPerformed
        txtB5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB5.setForeground(Color.red);
        }
        else{
            txtB5.setForeground(Color.green);
        }
        txtB5.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB5ActionPerformed

    private void txtB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB4ActionPerformed
        txtB4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB4.setForeground(Color.red);
        }
        else{
            txtB4.setForeground(Color.green);
        }
        txtB4.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB4ActionPerformed

    private void txtB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB9ActionPerformed
        txtB9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB9.setForeground(Color.red);
        }
        else{
            txtB9.setForeground(Color.green);
        }
        txtB9.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB9ActionPerformed

    private void txtB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB8ActionPerformed
        txtB8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB8.setForeground(Color.red);
        }
        else{
            txtB8.setForeground(Color.green);
        }
        txtB8.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB8ActionPerformed

    private void txtB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtB7ActionPerformed
        txtB7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("x")){
            txtB7.setForeground(Color.red);
        }
        else{
            txtB7.setForeground(Color.green);
        }
        txtB7.setEnabled(false); 
        choosePlayer();
        checkWinner();
    }//GEN-LAST:event_txtB7ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        JFrame window = new JFrame();
        if (JOptionPane.showConfirmDialog(window,"Confirm if you want to exit", "TIC TAC TOE",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
    setNewBoard();
    }//GEN-LAST:event_resetButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GamePanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameO;
    private javax.swing.JLabel nameX;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerTurn;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton txtB1;
    private javax.swing.JButton txtB2;
    private javax.swing.JButton txtB3;
    private javax.swing.JButton txtB4;
    private javax.swing.JButton txtB5;
    private javax.swing.JButton txtB6;
    private javax.swing.JButton txtB7;
    private javax.swing.JButton txtB8;
    private javax.swing.JButton txtB9;
    // End of variables declaration//GEN-END:variables
}
