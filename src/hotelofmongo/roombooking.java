/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelofmongo;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author krish
 */
public class roombooking extends javax.swing.JFrame {

    
    public roombooking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        JTotal = new javax.swing.JTextField();
        JSubTotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        JTax = new javax.swing.JTextField();
        JCustomerRef = new javax.swing.JTextField();
        JFirstName = new javax.swing.JTextField();
        JSurname = new javax.swing.JTextField();
        JAddress1 = new javax.swing.JTextField();
        JPostCode = new javax.swing.JTextField();
        JCustomerMobile = new javax.swing.JTextField();
        JEmailID = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        JIDtype = new javax.swing.JComboBox();
        JGender = new javax.swing.JComboBox();
        JRoomType = new javax.swing.JComboBox();
        JRoomNo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        JbtnTotalcost = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JbtnDelete = new javax.swing.JButton();
        JbtnReset = new javax.swing.JButton();
        JbtnReport1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JbtnTotalcost1 = new javax.swing.JButton();
        JbtnReport2 = new javax.swing.JButton();
        JDateOfBirth = new com.toedter.calendar.JDateChooser();
        JCheckInDate = new com.toedter.calendar.JDateChooser();
        JCheckOutDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FirstName:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer_Ref:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Surname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Post Code:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Customer Mobile:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nationality:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ID Type:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Date Of Birth:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gender:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Check In Date:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Check Out Date:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Room Type:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Room No:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Room Type:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 160, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Room No:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 160, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Room Ext. No:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 160, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Tax:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        JTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(JTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, -1));

        JSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(JSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("SubTotal:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Total:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        JTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(JTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 320, 180));
        getContentPane().add(JCustomerRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 145, -1));

        JFirstName.setText("\n");
        getContentPane().add(JFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 145, -1));
        getContentPane().add(JSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 145, -1));
        getContentPane().add(JAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 145, -1));
        getContentPane().add(JPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 145, -1));
        getContentPane().add(JCustomerMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 145, -1));

        JEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEmailIDActionPerformed(evt);
            }
        });
        getContentPane().add(JEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 145, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Nationality", "Arabic (United Arab Emirates)", "Arabic (Jordan)", "Arabic (Syria)", "Croatian (Croatia)", "French (Belgium)", "Spanish (Panama)", "Maltese (Malta)", "Spanish (Venezuela)", "Chinese (Taiwan)", "Danish (Denmark)", "Spanish (Puerto Rico)", "Vietnamese (Vietnam)", "English (United States)", "Serbian (Montenegro)", "Swedish (Sweden)", "Spanish (Bolivia)", "English (Singapore)", "Arabic (Bahrain)", "Arabic (Saudi Arabia)", "Arabic (Yemen)", "Hindi (India)", "English (Malta)", "Finnish (Finland)", "Serbian (Latin,Bosnia and Herzegovina)", "Ukrainian (Ukraine)", "French (Switzerland)", "Spanish (Argentina)", "Arabic (Egypt)", "Japanese (Japan,JP)", "Spanish (El Salvador)", "Portuguese (Brazil)", "Icelandic (Iceland)", "Czech (Czech Republic)", "Polish (Poland)", "Catalan (Spain)", "Serbian (Serbia and Montenegro)", "Malay (Malaysia)", "Spanish (Spain)", "Spanish (Colombia)", "Bulgarian (Bulgaria)", "Serbian (Bosnia and Herzegovina)", "Spanish (Paraguay)", "Spanish (Ecuador)", "Spanish (United States)", "Arabic (Sudan)", "Romanian (Romania)", "English (Philippines)", "Arabic (Tunisia)", "Serbian (Latin,Montenegro)", "Spanish (Guatemala)", "Korean (South Korea)", "Greek (Cyprus)", "Spanish (Mexico)", "Russian (Russia)", "Spanish (Honduras)", "Chinese (Hong Kong)", "Norwegian (Norway,Nynorsk)", "Hungarian (Hungary)", "Thai (Thailand)", "Arabic (Iraq)", "Spanish (Chile)", "Arabic (Morocco)", "Irish (Ireland)", "Turkish (Turkey)", "Estonian (Estonia)", "Arabic (Qatar)", "Portuguese (Portugal)", "French (Luxembourg)", "Arabic (Oman)", "Albanian (Albania)", "Spanish (Dominican Republic)", "Spanish (Cuba)", "English (New Zealand)", "Serbian (Serbia)", "German (Switzerland)", "Spanish (Uruguay)", "Greek (Greece)", "Hebrew (Israel)", "English (South Africa)", "Thai (Thailand,TH)", "French (France)", "German (Austria)", "Norwegian (Norway)", "English (Australia)", "Dutch (Netherlands)", "French (Canada)", "Latvian (Latvia)", "German (Luxembourg)", "Spanish (Costa Rica)", "Arabic (Kuwait)", "Arabic (Libya)", "Italian (Switzerland)", "German (Germany)", "Arabic (Algeria)", "Slovak (Slovakia)", "Lithuanian (Lithuania)", "Italian (Italy)", "English (Ireland)", "Chinese (Singapore)", "English (Canada)", "Dutch (Belgium)", "Chinese (China)", "Japanese (Japan)", "German (Greece)", "Serbian (Latin,Serbia)", "English (India)", "Arabic (Lebanon)", "Spanish (Nicaragua)", "Macedonian (Macedonia)", "Belarusian (Belarus)", "Slovenian (Slovenia)", "Spanish (Peru)", "Indonesian (Indonesia)", "English (United Kingdom)" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 147, -1));

        JIDtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ID Type", "Driving license", "Passport", "Voter ID", "AAdhar" }));
        getContentPane().add(JIDtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 150, -1));

        JGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        getContentPane().add(JGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 150, -1));

        JRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Room Type", "Single", "Double", "Familly" }));
        getContentPane().add(JRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 150, -1));

        JRoomNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "101", "102", "103", "104", "105", "106", "201", "202", "203", "204", "205", "206", "301", "302", "303", "304", "305", "306", "401", "402", "403", "404", "405", "406", "501", "502", "503", "504", "505", "506", " " }));
        getContentPane().add(JRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 150, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JbtnTotalcost.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JbtnTotalcost.setText("TotalCost");
        JbtnTotalcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnTotalcostActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnTotalcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 40));

        JbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JbtnDelete.setText("Delete");
        JbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 40));

        JbtnReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JbtnReset.setText("Reset");
        JbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnResetActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 40));

        JbtnReport1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JbtnReport1.setText("Update");
        JbtnReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnReport1ActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnReport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 200, 40));

        JbtnTotalcost1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JbtnTotalcost1.setText("Get Details");
        JbtnTotalcost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnTotalcost1ActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnTotalcost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 50));

        JbtnReport2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JbtnReport2.setText("Food Billing");
        JbtnReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnReport2ActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnReport2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 270, 450));
        getContentPane().add(JDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, -1));
        getContentPane().add(JCheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 150, 30));
        getContentPane().add(JCheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnResetActionPerformed
      /*  DefaultTableModel model = (DefaultTableModel) jTable1.getModel();*/
        //model.setRowCount(0);

        JCustomerRef.setText(null);
        JFirstName.setText(null);
        JSurname.setText(null);
        JAddress1.setText(null);
        JPostCode.setText(null);
        JCustomerMobile.setText(null);
        JEmailID.setText(null);
        jComboBox1.setSelectedIndex(0);
        JDateOfBirth.setDate(null);
        JIDtype.setSelectedIndex(0);
        JGender.setSelectedIndex(0);
        JCheckInDate.setDate(null);
        JCheckOutDate.setDate(null);
        JRoomType.setSelectedIndex(0);
        JRoomNo.setSelectedIndex(0);
        JTax.setText(null);
        JSubTotal.setText(null);
        JTotal.setText(null);

    }//GEN-LAST:event_JbtnResetActionPerformed

    private void JbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnDeleteActionPerformed
        try {
            //BasicDBObject oldDocument = new BasicDBObject().append("username", "admin1");
            String cm = JCustomerMobile.getText();
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB dbs = mongoClient.getDB("MongoHotel");
            DBCollection coll = dbs.getCollection("hotelsystem");
            BasicDBObject oldDocument = new BasicDBObject().append("CustomerMobile", cm);
            coll.remove(oldDocument);
        } catch (UnknownHostException ex) {
            Logger.getLogger(roombooking.class.getName()).log(Level.SEVERE, null, ex);
        }
       JOptionPane.showMessageDialog(null, "Data Deleted successfully","Hotel Management System",JOptionPane.OK_OPTION);
       JCustomerMobile.setText(null);
    }//GEN-LAST:event_JbtnDeleteActionPerformed

    private void JbtnTotalcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnTotalcostActionPerformed

        int SingleRoom=800;
        int DoubleRoom=900;
        int FamilyRoom=1000;
        

        SimpleDateFormat format= new SimpleDateFormat("yyyy-mm-dd");
        Date Check_In_Date=null;
        Date Check_Out_Date=null;

        try{
            Check_In_Date=format.parse(format.format(JCheckInDate.getDate()));
            Check_Out_Date=format.parse(format.format(JCheckOutDate.getDate()));
        }  catch(Exception e)
        {
            e.printStackTrace();
        }
        /*if(JCustomerRef.getText().trim().isEmpty()||JFirstName.getText().trim().isEmpty()||JSurname.getText().trim().isEmpty()||JAddress1.getText().trim().isEmpty()||JPostCode.getText().trim().isEmpty()||JCustomerMobile.getText().trim().isEmpty()||JEmailID.getText().trim().isEmpty()||jComboBox1.getSelectedIndex()== 0||JDateOfBirth.getDate().equals("")||JIDtype.getSelectedIndex()==0||JGender.getSelectedIndex()==0||JCheckInDate.getDate().equals("")||JCheckOutDate.getDate().equals("")||JRoomType.getSelectedIndex()==0||JRoomNo.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Fields are empty","Hotel Management System",JOptionPane.OK_OPTION);
        }*/

        long Checkdiff =Check_Out_Date.getTime()-Check_In_Date.getTime();
        int Daysdiff = (int) (Checkdiff /1000/60/60/24);
        if(JRoomType.getSelectedItem().equals("Single"))
        {
            JTotal.setText(Integer.toString(Daysdiff*SingleRoom));
            
            JTax.setText(Integer.toString(Daysdiff*SingleRoom));
            JSubTotal.setText(Integer.toString(Daysdiff*SingleRoom));

            double q = Double.parseDouble(JTax.getText());
            q = (q*0.25)/100;
            String tax =  String.format(("Rs %.2f"), q);
            JTax.setText(tax);

            double st = Double.parseDouble(JSubTotal.getText());
            String SubTotal =  String.format(("Rs %.2f"), st);
            JSubTotal.setText(SubTotal);

            double tt = Double.parseDouble(JTotal.getText());
            tt=st+q;
            String Total =  String.format(("Rs %.2f"), tt);
            JTotal.setText(Total);
        }

        else if(JRoomType.getSelectedItem().equals("Double"))
        {
            JTotal.setText(Integer.toString(Daysdiff*DoubleRoom));
            JTax.setText(Integer.toString(Daysdiff*DoubleRoom));
            JSubTotal.setText(Integer.toString(Daysdiff*DoubleRoom));

            double q = Double.parseDouble(JTax.getText());
            q = (q*0.25)/100;
            String tax =  String.format(("Rs %.2f"), q);
            JTax.setText(tax);

            double st = Double.parseDouble(JSubTotal.getText());
            String SubTotal =  String.format(("Rs %.2f"), st);
            JSubTotal.setText(SubTotal);

            double tt = Double.parseDouble(JTotal.getText());
            tt=st+q;
            String Total =  String.format(("Rs %.2f"), tt);
            JTotal.setText(Total);
        }

        else if(JRoomType.getSelectedItem().equals("Family"))
        {
            JTotal.setText(Integer.toString(Daysdiff*FamilyRoom));
            JTax.setText(Integer.toString(Daysdiff*FamilyRoom));
            JSubTotal.setText(Integer.toString(Daysdiff*FamilyRoom));

            double q = Double.parseDouble(JTax.getText());
            q = (q*0.25)/100;
            String tax =  String.format(("Rs %.2f"), q);
            JTax.setText(tax);

            double st = Double.parseDouble(JSubTotal.getText());
            String SubTotal =  String.format(("Rs %.2f"), st);
            JSubTotal.setText(SubTotal);

            double tt = Double.parseDouble(JTotal.getText());
            tt=st+q;
            String Total =  String.format(("Rs %.2f"), tt);
            JTotal.setText(Total);
        }
        //===============================================================================

      /*  DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            JCustomerRef.getText(),
            JFirstName.getText(),
            JSurname.getText(),
            JAddress1.getText(),
            JPostCode.getText(),
            JCustomerMobile.getText(),
            JEmailID.getText(),
            jComboBox1.getSelectedItem(),
            JDateOfBirth.getDate(),
            JIDtype.getSelectedItem(),
            JGender.getSelectedItem(),
            JCheckInDate.getDate(),
            JCheckOutDate.getDate(),
            JRoomType.getSelectedItem(),
            JRoomNo.getSelectedItem(),
            JTotal.getText(),
        });*/
        /*JCustomerRef.setText(null);
        JFirstName.setText(null);
        JSurname.setText(null);
        JAddress1.setText(null);
        JPostCode.setText(null);
        JCustomerMobile.setText(null);
        JEmailID.setText(null);
        jComboBox1.setSelectedIndex(0);
        JDateOfBirth.setDate(null);
        JIDtype.setSelectedIndex(0);
        JGender.setSelectedIndex(0);
        JCheckInDate.setDate(null);
        JCheckOutDate.setDate(null);
        JMeal.setSelectedIndex(0);
        JRoomType.setSelectedIndex(0);
        JRoomNo.setSelectedIndex(0);
        JRoomExtNo.setSelectedIndex(0);
        JTax.setText(null);
        JSubTotal.setText(null);
        JTotal.setText(null);*/

    }//GEN-LAST:event_JbtnTotalcostActionPerformed
/**/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB dbs = mongoClient.getDB("MongoHotel");
            DBCollection coll = dbs.getCollection("hotelsystem");
            
            String customerRef=JCustomerRef.getText();
            String firstname=JFirstName.getText();
            String surname=JSurname.getText();
            String address=JAddress1.getText();
            String postcode=JPostCode.getText();
            String customermobile=JCustomerMobile.getText();
            String email=JEmailID.getText();
            String combo1=jComboBox1.getSelectedItem().toString();
            String idtype=JIDtype.getSelectedItem().toString();
            String gender=JGender.getSelectedItem().toString();
            String Indate=JCheckInDate.getDate().toString();
            String dob=JDateOfBirth.getDate().toString();
            String outdate=JCheckOutDate.getDate().toString();
            String roomtype=JRoomType.getSelectedItem().toString();
            String roomno=JRoomNo.getSelectedItem().toString();
            String total=JTotal.getText(); 
            
            BasicDBObject doc = new BasicDBObject("CustomerRef",customerRef).append("Firstname",firstname).append("Surname",surname).append("Address",address).
                    append("Postcode", postcode).append("CustomerMobile", customermobile).append("Email",email).append("Nationality",combo1).append("IDtype",idtype).
                    append("Gender", gender).append("Indate", Indate).append("Outdate",outdate).append("Dob",dob).append("Roomtype", roomtype).
                    append("RoomNo",roomno).append("Total",total);
            coll.insert(doc);
            
            DBCollection coll1=dbs.getCollection("food");
            BasicDBObject doc1 = new BasicDBObject("CustomerMobile",customermobile).append("FoodTotal", "0");
            coll1.insert(doc1);
            JCustomerRef.setText(null);
        JFirstName.setText(null);
        JSurname.setText(null);
        JAddress1.setText(null);
        JPostCode.setText(null);
        JCustomerMobile.setText(null);
        JEmailID.setText(null);
        jComboBox1.setSelectedIndex(0);
        JDateOfBirth.setDate(null);
        JIDtype.setSelectedIndex(0);
        JGender.setSelectedIndex(0);
        JCheckInDate.setDate(null);
        JCheckOutDate.setDate(null);
        JRoomType.setSelectedIndex(0);
        JRoomNo.setSelectedIndex(0);
        JTax.setText(null);
        JSubTotal.setText(null);
        JTotal.setText(null);
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(roombooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Data uploaded successfully","Hotel Management System",JOptionPane.OK_OPTION);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog( frame, "Confirm if you want to logout","Hotel Management System", JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION)
        {
            this.setVisible(false);
            new login().setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void JEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JEmailIDActionPerformed

    private void JbtnReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnReport1ActionPerformed
        try {
            // TODO add your handling code here:
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB dbs = mongoClient.getDB("MongoHotel");
            DBCollection coll = dbs.getCollection("hotelsystem");
            BasicDBObject updatedDocument = new BasicDBObject();
            updatedDocument.append("$set", new BasicDBObject().append("CustomerRef", JCustomerRef.getText()).append("Firstname", JFirstName.getText()).append("Surname", JSurname.getText()).append("Address", JAddress1.getText()).append("Address", JAddress1.getText()).append("Postcode", JPostCode.getText()).append("CustomerMobile", JCustomerMobile.getText()).append("Email", JEmailID.getText()).append("Nationality", jComboBox1.getSelectedItem()).append("IDtype", JIDtype.getSelectedItem()).append("Gender", JGender.getSelectedItem()).append("Roomtype", JRoomType.getSelectedItem()).append("RoomNo", JRoomNo.getSelectedItem()));
            BasicDBObject oldDocument = new BasicDBObject().append("CustomerMobile", JCustomerMobile.getText());
            coll.update(oldDocument, updatedDocument,false,true);
            JCustomerRef.setText(null);
        JFirstName.setText(null);
        JSurname.setText(null);
        JAddress1.setText(null);
        JPostCode.setText(null);
        JCustomerMobile.setText(null);
        JEmailID.setText(null);
        jComboBox1.setSelectedIndex(0);
        JDateOfBirth.setDate(null);
        JIDtype.setSelectedIndex(0);
        JGender.setSelectedIndex(0);
        JCheckInDate.setDate(null);
        JCheckOutDate.setDate(null);
        JRoomType.setSelectedIndex(0);
        JRoomNo.setSelectedIndex(0);
        JTax.setText(null);
        JSubTotal.setText(null);
        JTotal.setText(null);
        } catch (UnknownHostException ex) {
            Logger.getLogger(roombooking.class.getName()).log(Level.SEVERE, null, ex);
        }
         JOptionPane.showMessageDialog(null, "Data Updated successfully","Hotel Management System",JOptionPane.OK_OPTION);
    }//GEN-LAST:event_JbtnReport1ActionPerformed

    private void JbtnTotalcost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnTotalcost1ActionPerformed
            // TODO add your handling code here:
            String cm=JCustomerMobile.getText();
        try {
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            DB dbs = mongoClient.getDB("MongoHotel");
            DBCollection coll = dbs.getCollection("hotelsystem");
            
            BasicDBObject whereQuery = new BasicDBObject();
            whereQuery.put("CustomerMobile", cm);
            DBCursor cursor = coll.find(whereQuery);
            String documents=cursor.next().toString();
            //System.out.println(documents);
            Object obj = new JSONParser().parse(documents);
            JSONObject jo = (JSONObject) obj;
            String customerRef = (String) jo.get("CustomerRef");JCustomerRef.setText(customerRef);
            String firstName = (String) jo.get("Firstname");JFirstName.setText(firstName);
            String surname = (String) jo.get("Surname");JSurname.setText(surname);
            String address = (String) jo.get("Address");JAddress1.setText(address);
            String postcode = (String) jo.get("Postcode");JPostCode.setText(postcode);
            //String customerMobile = (String) jo.get("CustomerMobile");
            String email = (String) jo.get("Email");JEmailID.setText(email);
            String nationality = (String) jo.get("Nationality");jComboBox1.setSelectedItem(nationality);
            String idtype = (String) jo.get("IDtype");JIDtype.setSelectedItem(idtype);
            String gender = (String) jo.get("Gender");JGender.setSelectedItem(gender);
            //String indate = (String) jo.get("Indate");JCheckInDate.setText(indate);
            //Date outdate = (Date) jo.get("Outdate");JCheckOutDate.setDate(outdate);
            //Date dob = (Date) jo.get("Dob");JDateOfBirth.setDate(dob);
            String roomtype = (String) jo.get("Roomtype");JRoomType.setSelectedItem(roomtype);
            String roomno = (String) jo.get("RoomNo");JRoomNo.setSelectedItem(roomno);
            String total = (String) jo.get("Total");JTotal.setText(total);
            
            
            
            //while(cursor.hasNext()) {
            //    System.out.println(cursor.next());
            //
        } catch (UnknownHostException ex) {
            Logger.getLogger(roombooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(roombooking.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_JbtnTotalcost1ActionPerformed

    private void JbtnReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnReport2ActionPerformed
        // TODO add your handling code here:
        new foodbillings().setVisible(true);
    }//GEN-LAST:event_JbtnReport2ActionPerformed

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
            java.util.logging.Logger.getLogger(roombooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roombooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roombooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roombooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roombooking().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAddress1;
    private com.toedter.calendar.JDateChooser JCheckInDate;
    private com.toedter.calendar.JDateChooser JCheckOutDate;
    private javax.swing.JTextField JCustomerMobile;
    private javax.swing.JTextField JCustomerRef;
    private com.toedter.calendar.JDateChooser JDateOfBirth;
    private javax.swing.JTextField JEmailID;
    private javax.swing.JTextField JFirstName;
    private javax.swing.JComboBox JGender;
    private javax.swing.JComboBox JIDtype;
    private javax.swing.JTextField JPostCode;
    private javax.swing.JComboBox JRoomNo;
    private javax.swing.JComboBox JRoomType;
    private javax.swing.JTextField JSubTotal;
    private javax.swing.JTextField JSurname;
    private javax.swing.JTextField JTax;
    private javax.swing.JTextField JTotal;
    private javax.swing.JButton JbtnDelete;
    private javax.swing.JButton JbtnReport1;
    private javax.swing.JButton JbtnReport2;
    private javax.swing.JButton JbtnReset;
    private javax.swing.JButton JbtnTotalcost;
    private javax.swing.JButton JbtnTotalcost1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    // End of variables declaration//GEN-END:variables
}
