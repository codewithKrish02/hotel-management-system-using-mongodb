/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelofmongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author krish
 */
public class foodbillings extends javax.swing.JFrame {

    /**
     * Creates new form foodbillings
     */
    public foodbillings() {
        initComponents();
    }
    static String bill;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTexteb = new javax.swing.JTextField();
        jTextidly = new javax.swing.JTextField();
        jTextdosa = new javax.swing.JTextField();
        jTextvada = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextpongal = new javax.swing.JTextField();
        jTextod = new javax.swing.JTextField();
        jTextmb = new javax.swing.JTextField();
        jTextvb = new javax.swing.JTextField();
        jTextcb = new javax.swing.JTextField();
        EBPRICE = new javax.swing.JTextField();
        IDLYPRICE = new javax.swing.JTextField();
        DOSAPRICE = new javax.swing.JTextField();
        VADAPRICE = new javax.swing.JTextField();
        PURIPRICE = new javax.swing.JTextField();
        PONGALPRICE = new javax.swing.JTextField();
        ODPRICE = new javax.swing.JTextField();
        MBPRICE = new javax.swing.JTextField();
        VBPRICE = new javax.swing.JTextField();
        CBPRICE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jtotal = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FOOD BILLING");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 80, 180, 40);

        jLabel2.setText("IDLY:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 170, 24, 13);

        jLabel3.setText("DOSA:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 210, 30, 13);

        jLabel4.setText("VADA:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 250, 30, 13);

        jLabel5.setText("PURI:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 290, 26, 13);

        jLabel6.setText("PONGAL:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 330, 41, 13);

        jLabel7.setText("ONION DOSA:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 370, 64, 13);

        jLabel8.setText("MYSORE BONDA:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 410, 78, 13);

        jLabel9.setText("VEG BIRIYANI:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 450, 66, 13);

        jLabel10.setText("CHICKEN BIRIYANI:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 490, 87, 13);

        jLabel11.setText("TOTAL:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 590, 35, 13);

        jLabel12.setText("LIST");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(150, 130, 21, 13);

        jLabel13.setText("NO OF ITEMS");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(250, 130, 62, 13);

        jLabel14.setText("PRICE");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(380, 130, 40, 13);

        jTexteb.setText("0");
        jTexteb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextebMouseClicked(evt);
            }
        });
        jPanel1.add(jTexteb);
        jTexteb.setBounds(190, 530, 180, 19);

        jTextidly.setText("0");
        jTextidly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextidlyMouseClicked(evt);
            }
        });
        jPanel1.add(jTextidly);
        jTextidly.setBounds(190, 170, 180, 19);

        jTextdosa.setText("0");
        jTextdosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextdosaMouseClicked(evt);
            }
        });
        jTextdosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdosaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextdosa);
        jTextdosa.setBounds(190, 210, 180, 19);

        jTextvada.setText("0");
        jTextvada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextvadaMouseClicked(evt);
            }
        });
        jPanel1.add(jTextvada);
        jTextvada.setBounds(190, 250, 180, 19);

        jTextField5.setText("0");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(190, 290, 180, 19);

        jTextpongal.setText("0");
        jTextpongal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextpongalMouseClicked(evt);
            }
        });
        jPanel1.add(jTextpongal);
        jTextpongal.setBounds(190, 330, 180, 19);

        jTextod.setText("0");
        jTextod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextodMouseClicked(evt);
            }
        });
        jPanel1.add(jTextod);
        jTextod.setBounds(190, 370, 180, 19);

        jTextmb.setText("0");
        jTextmb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextmbMouseClicked(evt);
            }
        });
        jTextmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextmbActionPerformed(evt);
            }
        });
        jPanel1.add(jTextmb);
        jTextmb.setBounds(190, 410, 180, 19);

        jTextvb.setText("0");
        jTextvb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextvbMouseClicked(evt);
            }
        });
        jPanel1.add(jTextvb);
        jTextvb.setBounds(190, 450, 180, 19);

        jTextcb.setText("0");
        jTextcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextcbMouseClicked(evt);
            }
        });
        jPanel1.add(jTextcb);
        jTextcb.setBounds(190, 490, 180, 19);

        EBPRICE.setEditable(false);
        EBPRICE.setText("90");
        jPanel1.add(EBPRICE);
        EBPRICE.setBounds(380, 530, 40, 19);

        IDLYPRICE.setEditable(false);
        IDLYPRICE.setText("30");
        jPanel1.add(IDLYPRICE);
        IDLYPRICE.setBounds(380, 170, 40, 19);

        DOSAPRICE.setEditable(false);
        DOSAPRICE.setText("35");
        DOSAPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOSAPRICEActionPerformed(evt);
            }
        });
        jPanel1.add(DOSAPRICE);
        DOSAPRICE.setBounds(380, 210, 40, 19);

        VADAPRICE.setEditable(false);
        VADAPRICE.setText("30");
        jPanel1.add(VADAPRICE);
        VADAPRICE.setBounds(380, 250, 40, 19);

        PURIPRICE.setEditable(false);
        PURIPRICE.setText("25");
        PURIPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PURIPRICEActionPerformed(evt);
            }
        });
        jPanel1.add(PURIPRICE);
        PURIPRICE.setBounds(380, 290, 40, 19);

        PONGALPRICE.setEditable(false);
        PONGALPRICE.setText("40");
        PONGALPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PONGALPRICEActionPerformed(evt);
            }
        });
        jPanel1.add(PONGALPRICE);
        PONGALPRICE.setBounds(380, 330, 40, 19);

        ODPRICE.setEditable(false);
        ODPRICE.setText("45");
        ODPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODPRICEActionPerformed(evt);
            }
        });
        jPanel1.add(ODPRICE);
        ODPRICE.setBounds(380, 370, 40, 19);

        MBPRICE.setEditable(false);
        MBPRICE.setText("25");
        jPanel1.add(MBPRICE);
        MBPRICE.setBounds(380, 410, 40, 19);

        VBPRICE.setEditable(false);
        VBPRICE.setText("80");
        VBPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VBPRICEActionPerformed(evt);
            }
        });
        jPanel1.add(VBPRICE);
        VBPRICE.setBounds(380, 450, 40, 19);

        CBPRICE.setEditable(false);
        CBPRICE.setText("100");
        jPanel1.add(CBPRICE);
        CBPRICE.setBounds(380, 490, 40, 19);

        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 640, 87, 21);

        jLabel15.setText("EGG BIRIYANI:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(110, 530, 66, 20);
        jPanel1.add(jtotal);
        jtotal.setBounds(190, 590, 180, 19);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 640, 57, 21);

        jLabel16.setText("Customer Mobile:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(108, 36, 120, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(220, 30, 210, 19);

        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(230, 690, 90, 21);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DOSAPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOSAPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOSAPRICEActionPerformed

    private void PURIPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PURIPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PURIPRICEActionPerformed

    private void PONGALPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PONGALPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PONGALPRICEActionPerformed

    private void ODPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ODPRICEActionPerformed

    private void jTextmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextmbActionPerformed

    private void VBPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VBPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VBPRICEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int idly=Integer.parseInt(jTextidly.getText());
        int dosa=Integer.parseInt(jTextdosa.getText());
        int vada=Integer.parseInt(jTextvada.getText());
        int pongal=Integer.parseInt(jTextpongal.getText());
        int od=Integer.parseInt(jTextod.getText());
        int mb=Integer.parseInt(jTextmb.getText());
        int vb=Integer.parseInt(jTextvb.getText());
        int cb=Integer.parseInt(jTextcb.getText());
        int eb=Integer.parseInt(jTexteb.getText());
        
        int idlyprice=Integer.parseInt(IDLYPRICE.getText());
        int dosaprice=Integer.parseInt(DOSAPRICE.getText());
        int vadaprice=Integer.parseInt(VADAPRICE.getText());
        int pongalprice=Integer.parseInt(PONGALPRICE.getText());
        int oniondosa=Integer.parseInt(ODPRICE.getText());
        int mysorebonda=Integer.parseInt(MBPRICE.getText());
        int vegbiriyani=Integer.parseInt(VBPRICE.getText());
        int chickenbiriyani=Integer.parseInt(CBPRICE.getText());
        int eggbiriyani=Integer.parseInt(EBPRICE.getText());
        
        int total=idly*idlyprice+dosa*dosaprice+vada*vadaprice+pongal*pongalprice+od*oniondosa+mb*mysorebonda+vb*vegbiriyani+cb*chickenbiriyani+eb*eggbiriyani;
        jtotal.setText(Integer.toString(total));
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new home().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB dbs = mongoClient.getDB("MongoHotel");
            DBCollection coll = dbs.getCollection("food");
            
            BasicDBObject updatedDocument = new BasicDBObject();
            updatedDocument.append("$set", new BasicDBObject().append("FoodTotal", jtotal.getText()));
            BasicDBObject oldDocument = new BasicDBObject().append("CustomerMobile", jTextField1.getText());
            coll.update(oldDocument, updatedDocument,false,true);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(foodbillings.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Billing successfully","Hotel Management System",JOptionPane.OK_OPTION);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextdosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdosaActionPerformed

    private void jTextidlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextidlyMouseClicked
        // TODO add your handling code here:
       jTextidly.setText(null);
       
    }//GEN-LAST:event_jTextidlyMouseClicked

    private void jTextdosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextdosaMouseClicked
        // TODO add your handling code here:
        jTextdosa.setText(null);
    }//GEN-LAST:event_jTextdosaMouseClicked

    private void jTextvadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextvadaMouseClicked
        // TODO add your handling code here:
        jTextvada.setText(null);
    }//GEN-LAST:event_jTextvadaMouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
        jTextField5.setText(null);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextpongalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextpongalMouseClicked
        // TODO add your handling code here:
        jTextpongal.setText(null);
    }//GEN-LAST:event_jTextpongalMouseClicked

    private void jTextodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextodMouseClicked
        // TODO add your handling code here:
        jTextod.setText(null);
    }//GEN-LAST:event_jTextodMouseClicked

    private void jTextmbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextmbMouseClicked
        // TODO add your handling code here:
        jTextmb.setText(null);
    }//GEN-LAST:event_jTextmbMouseClicked

    private void jTextvbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextvbMouseClicked
        // TODO add your handling code here:
        jTextvb.setText(null);
    }//GEN-LAST:event_jTextvbMouseClicked

    private void jTextcbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextcbMouseClicked
        // TODO add your handling code here:
        jTextcb.setText(null);
    }//GEN-LAST:event_jTextcbMouseClicked

    private void jTextebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextebMouseClicked
        // TODO add your handling code here:
        jTexteb.setText(null);
    }//GEN-LAST:event_jTextebMouseClicked

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
            java.util.logging.Logger.getLogger(foodbillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(foodbillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(foodbillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(foodbillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new foodbillings().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CBPRICE;
    private javax.swing.JTextField DOSAPRICE;
    private javax.swing.JTextField EBPRICE;
    private javax.swing.JTextField IDLYPRICE;
    private javax.swing.JTextField MBPRICE;
    private javax.swing.JTextField ODPRICE;
    private javax.swing.JTextField PONGALPRICE;
    private javax.swing.JTextField PURIPRICE;
    private javax.swing.JTextField VADAPRICE;
    private javax.swing.JTextField VBPRICE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextcb;
    private javax.swing.JTextField jTextdosa;
    private javax.swing.JTextField jTexteb;
    private javax.swing.JTextField jTextidly;
    private javax.swing.JTextField jTextmb;
    private javax.swing.JTextField jTextod;
    private javax.swing.JTextField jTextpongal;
    private javax.swing.JTextField jTextvada;
    private javax.swing.JTextField jTextvb;
    private javax.swing.JTextField jtotal;
    // End of variables declaration//GEN-END:variables
}
