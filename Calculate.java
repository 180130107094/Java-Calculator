/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 *
 * @author ujjaval
 */
public class Calculate extends javax.swing.JFrame {

       double firstnum;
        double secondnum;
        double result;
        String operation;
    public Calculate() {
     
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtDisplay = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtnmul = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtndiv = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jbtnpm = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jBtnCE = new javax.swing.JButton();
        jBtnEq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 300));

        jTxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtn1.setBackground(new java.awt.Color(0, 0, 240));
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtnmul.setBackground(new java.awt.Color(0, 0, 240));
        jbtnmul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnmul.setText("*");
        jbtnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmulActionPerformed(evt);
            }
        });

        jbtn10.setBackground(new java.awt.Color(0, 0, 240));
        jbtn10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn10.setText("0");
        jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(0, 0, 240));
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(0, 0, 240));
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtndiv.setBackground(new java.awt.Color(0, 0, 240));
        jbtndiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtndiv.setText("/");
        jbtndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndivActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(0, 0, 240));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(0, 0, 240));
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(0, 0, 240));
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(0, 0, 240));
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtnplus.setBackground(new java.awt.Color(0, 0, 240));
        jbtnplus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnplus.setText("+");
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });

        jbtnpm.setBackground(new java.awt.Color(0, 0, 240));
        jbtnpm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnpm.setText("+/-");
        jbtnpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpmActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(0, 0, 240));
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(0, 0, 240));
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtndot.setBackground(new java.awt.Color(0, 0, 240));
        jbtndot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        jbtnminus.setBackground(new java.awt.Color(0, 0, 240));
        jbtnminus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnminus.setText("-");
        jbtnminus.setAutoscrolls(true);
        jbtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnminusActionPerformed(evt);
            }
        });

        jBtnCE.setBackground(new java.awt.Color(240, 0, 0));
        jBtnCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnCE.setText("CE");
        jBtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCEActionPerformed(evt);
            }
        });

        jBtnEq.setBackground(new java.awt.Color(240, 0, 0));
        jBtnEq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBtnEq.setText("=");
        jBtnEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEq, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnpm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEq, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String Enternum = jTxtDisplay.getText() + jbtn1.getText();
        jTxtDisplay.setText(Enternum);
        
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmulActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(" ");
        operation = "*";
    }//GEN-LAST:event_jbtnmulActionPerformed

    private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10ActionPerformed
         String Enternum = jTxtDisplay.getText() + jbtn10.getText();
         jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn10ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
         String Enternum = jTxtDisplay.getText() + jbtn2.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
         String Enternum = jTxtDisplay.getText() + jbtn6.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndivActionPerformed
         firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(" ");
        operation = "/";
    }//GEN-LAST:event_jbtndivActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
         String Enternum = jTxtDisplay.getText() + jbtn7.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String Enternum = jTxtDisplay.getText() + jbtn3.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
         String Enternum = jTxtDisplay.getText() + jbtn9.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String Enternum = jTxtDisplay.getText() + jbtn5.getText();
        jTxtDisplay.setText(Enternum);
      
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(" ");
        operation = "+";
    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpmActionPerformed
       double ops = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
       ops=ops * (-1);
       jTxtDisplay.setText(String.valueOf(ops));
       
    }//GEN-LAST:event_jbtnpmActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String Enternum = jTxtDisplay.getText() + jbtn4.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String Enternum = jTxtDisplay.getText() + jbtn8.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
        String Enternum = jTxtDisplay.getText() + jbtndot.getText();
        jTxtDisplay.setText(Enternum);
    }//GEN-LAST:event_jbtndotActionPerformed

    private void jbtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnminusActionPerformed
      firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText(" ");
        operation = "-";

    }//GEN-LAST:event_jbtnminusActionPerformed

    private void jBtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCEActionPerformed
        jTxtDisplay.setText("");

    }//GEN-LAST:event_jBtnCEActionPerformed

    private void jBtnEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEqActionPerformed
       String ans ;
       secondnum = Double.parseDouble(jTxtDisplay.getText());
       if(operation == "+")
       {
           result = firstnum + secondnum;
           ans = String.format("%.4f", result);
           jTxtDisplay.setText(ans);          
       }
       else if(operation == "-")
       {
           result = firstnum - secondnum;
           ans = String.format("%.4f", result);
           jTxtDisplay.setText(ans);          
       }
       else if(operation == "*")
       {
           result = firstnum * secondnum;
           ans = String.format("%.4f", result);
           jTxtDisplay.setText(ans);          
       }
       else if(operation == "/")
       {
           result = firstnum / secondnum;
           ans = String.format("%.4f", result);
           jTxtDisplay.setText(ans);          
       }
       
    }//GEN-LAST:event_jBtnEqActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCE;
    private javax.swing.JButton jBtnEq;
    private javax.swing.JTextField jTxtDisplay;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtndiv;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnmul;
    private javax.swing.JButton jbtnplus;
    private javax.swing.JButton jbtnpm;
    // End of variables declaration//GEN-END:variables
}
