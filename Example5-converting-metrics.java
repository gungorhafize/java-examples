package exp5;

public class exp5 {

	
		class NewJFrame extends javax.swing.JFrame {

		    
			private static final long serialVersionUID = 1L;
			
		    public NewJFrame() {
		        initComponents();
		    }

		    
		    private void initComponents() {

		        grup1 = new javax.swing.ButtonGroup();
		        jLabel1 = new javax.swing.JLabel();
		        tf = new javax.swing.JTextField();
		        miles = new javax.swing.JRadioButton();
		        kilometers = new javax.swing.JRadioButton();
		        gallons = new javax.swing.JRadioButton();
		        liters = new javax.swing.JRadioButton();
		        pounds = new javax.swing.JRadioButton();
		        kilograms = new javax.swing.JRadioButton();
		        mph = new javax.swing.JRadioButton();
		        knots = new javax.swing.JRadioButton();
		        inches = new javax.swing.JRadioButton();
		        centimeters = new javax.swing.JRadioButton();
		        jScrollPane1 = new javax.swing.JScrollPane();
		        ta = new javax.swing.JTextArea();
		        jButton1 = new javax.swing.JButton();
		        jButton2 = new javax.swing.JButton();
		        jButton3 = new javax.swing.JButton();
		        jButton4 = new javax.swing.JButton();
		        jButton5 = new javax.swing.JButton();
		        jButton6 = new javax.swing.JButton();
		        jButton7 = new javax.swing.JButton();
		        jButton8 = new javax.swing.JButton();
		        jButton9 = new javax.swing.JButton();
		        jButton10 = new javax.swing.JButton();
		        jButton11 = new javax.swing.JButton();
		        jButton12 = new javax.swing.JButton();
		        jButton13 = new javax.swing.JButton();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        jLabel1.setText("input:");

		        grup1.add(miles);
		        miles.setSelected(true);
		        miles.setText("in miles");

		        grup1.add(kilometers);
		        kilometers.setText("in kilometers");

		        grup1.add(gallons);
		        gallons.setText("in gallons");

		        grup1.add(liters);
		        liters.setText("in liters");

		        grup1.add(pounds);
		        pounds.setText("in pounds");

		        grup1.add(kilograms);
		        kilograms.setText("in kilograms");

		        grup1.add(mph);
		        mph.setText("in mph");

		        grup1.add(knots);
		        knots.setText("in knots");

		        grup1.add(inches);
		        inches.setText("in inches");

		        grup1.add(centimeters);
		        centimeters.setText("in centimeters");

		        ta.setEditable(false);
		        ta.setColumns(20);
		        ta.setRows(5);
		        jScrollPane1.setViewportView(ta);

		        jButton1.setText("1");
		        jButton1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton1ActionPerformed(evt);
		            }
		        });

		        jButton2.setText("2");
		        jButton2.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton2ActionPerformed(evt);
		            }
		        });

		        jButton3.setText("3");
		        jButton3.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton3ActionPerformed(evt);
		            }
		        });

		        jButton4.setText("4");
		        jButton4.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton4ActionPerformed(evt);
		            }
		        });

		        jButton5.setText("5");
		        jButton5.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton5ActionPerformed(evt);
		            }
		        });

		        jButton6.setText("6");
		        jButton6.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton6ActionPerformed(evt);
		            }
		        });

		        jButton7.setText("7");
		        jButton7.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton7ActionPerformed(evt);
		            }
		        });

		        jButton8.setText("8");
		        jButton8.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton8ActionPerformed(evt);
		            }
		        });

		        jButton9.setText("9");
		        jButton9.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton9ActionPerformed(evt);
		            }
		        });

		        jButton10.setText("c");
		        jButton10.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton10ActionPerformed(evt);
		            }
		        });

		        jButton11.setText("0");
		        jButton11.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton11ActionPerformed(evt);
		            }
		        });

		        jButton12.setText(".");
		        jButton12.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton12ActionPerformed(evt);
		            }
		        });

		        jButton13.setText("convert");
		        jButton13.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton13ActionPerformed(evt);
		            }
		        });

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                    .addComponent(jScrollPane1)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
		                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
		                                .addGap(82, 82, 82)
		                                .addComponent(jLabel1)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(tf))
		                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(miles)
		                                    .addComponent(gallons))
		                                .addGap(58, 58, 58)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(liters)
		                                    .addComponent(kilometers)))
		                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(pounds)
		                                    .addComponent(mph)
		                                    .addComponent(inches))
		                                .addGap(58, 58, 58)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(centimeters)
		                                    .addComponent(knots)
		                                    .addComponent(kilograms))))
		                        .addGap(18, 18, 18)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addComponent(jButton1)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton2)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton3))
		                            .addGroup(layout.createSequentialGroup()
		                                .addComponent(jButton4)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton5)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton6))
		                            .addGroup(layout.createSequentialGroup()
		                                .addComponent(jButton7)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton8)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton9))
		                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addGroup(layout.createSequentialGroup()
		                                .addComponent(jButton10)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(jButton11)
		                                .addGap(10, 10, 10)
		                                .addComponent(jButton12)))))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jLabel1)
		                            .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(miles)
		                            .addComponent(kilometers))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(gallons)
		                            .addComponent(liters))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(pounds)
		                            .addComponent(kilograms))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(mph)
		                            .addComponent(knots))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(inches)
		                            .addComponent(centimeters)))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jButton1)
		                            .addComponent(jButton2)
		                            .addComponent(jButton3))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jButton4)
		                            .addComponent(jButton5)
		                            .addComponent(jButton6))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jButton7)
		                            .addComponent(jButton8)
		                            .addComponent(jButton9))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jButton10)
		                            .addComponent(jButton11)
		                            .addComponent(jButton12))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jButton13)))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );

		        pack();
		    }// </editor-fold>//GEN-END:initComponents

		    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		tf.setText(tf.getText() + 1);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton1ActionPerformed

		    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		tf.setText(tf.getText() + 2);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton2ActionPerformed

		    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		tf.setText(tf.getText() + 3);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton3ActionPerformed

		    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		tf.setText(tf.getText() + 4);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton4ActionPerformed

		    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		tf.setText(tf.getText() + 5);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton5ActionPerformed

		    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		tf.setText(tf.getText() + 6);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton6ActionPerformed

		    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		tf.setText(tf.getText() + 7);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton7ActionPerformed

		    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
		tf.setText(tf.getText() + 8);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton8ActionPerformed

		    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
		tf.setText(tf.getText() + 9);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton9ActionPerformed

		    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
		tf.setText(tf.getText() + 0);        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton11ActionPerformed

		    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
		tf.setText("");        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton10ActionPerformed

		    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
		tf.setText(tf.getText() + ".");        // TODO add your handling code here:
		    }//GEN-LAST:event_jButton12ActionPerformed

		    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
		        try {
		            float f = Float.parseFloat(tf.getText());
		            if (miles.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "miles equals to-> " + f * 1.609344 + "kilometers");
		            } else if (kilometers.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "kilometers equals to-> " + f * 0.621371192 + "miles");
		            }
		            else if (gallons.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "gallons equals to-> " + f * 3.78541178  + "liters");
		            }
		            else if (liters.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "liters equals to-> " + f * 0.264172052  + "gallons");
		            }
		            else if (pounds.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "pounds equals to-> " + f * 0.45359237  + "kilograms");
		            }
		            else if (kilograms.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "kilograms equals to-> " + f * 2.20462262  + "pounds");
		            }
		            else if (mph.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "mph equals to-> " + f * 0.868976242  + "knots");
		            }
		            else if (knots.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "knots equals to-> " + f * 1.15077945  + "mph");
		            }
		            else if (inches.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "inches equals to-> " + f * 2.54  + "centimeters");
		            }
		            else if (centimeters.isSelected()) {
		                ta.setText(ta.getText() + "\n" + f + "centimeters equals to-> " + f * 0.393700787  + "inches");
		            }
		        } catch (NumberFormatException e) {
		            ta.setText(ta.getText() + "\ninvalid input!");
		        }
		    }

		   
		    public void main(String args[]) {
		        
		        try {
		            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		                if ("Nimbus".equals(info.getName())) {
		                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		                    break;
		                }
		            }
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Create and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new NewJFrame().setVisible(true);
		            }
		        });
		    }
		    
		    private javax.swing.JRadioButton centimeters;
		    private javax.swing.JRadioButton gallons;
		    private javax.swing.ButtonGroup grup1;
		    private javax.swing.JRadioButton inches;
		    private javax.swing.JButton jButton1;
		    private javax.swing.JButton jButton10;
		    private javax.swing.JButton jButton11;
		    private javax.swing.JButton jButton12;
		    private javax.swing.JButton jButton13;
		    private javax.swing.JButton jButton2;
		    private javax.swing.JButton jButton3;
		    private javax.swing.JButton jButton4;
		    private javax.swing.JButton jButton5;
		    private javax.swing.JButton jButton6;
		    private javax.swing.JButton jButton7;
		    private javax.swing.JButton jButton8;
		    private javax.swing.JButton jButton9;
		    private javax.swing.JLabel jLabel1;
		    private javax.swing.JScrollPane jScrollPane1;
		    private javax.swing.JRadioButton kilograms;
		    private javax.swing.JRadioButton kilometers;
		    private javax.swing.JRadioButton knots;
		    private javax.swing.JRadioButton liters;
		    private javax.swing.JRadioButton miles;
		    private javax.swing.JRadioButton mph;
		    private javax.swing.JRadioButton pounds;
		    private javax.swing.JTextArea ta;
		    private javax.swing.JTextField tf;
		    // End of variables declaration//GEN-END:variables
		}


	}


