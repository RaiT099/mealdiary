/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealdiary;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author waikh
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    String recordID = "";
    String foodName = "";
    String drink = "";
    String day = "";
    String date = "";
    String foodGrp = "";
    String mealType = "";
    String jTextRecordID = "";
    int record = 0;
    DefaultTableModel dtm;
    int row;
    String currentUser;
    boolean preset = false;
    MealRecord mr = new MealRecord(null, null, null, null, null, null, null, null);
    ArrayList<String> imgList = new ArrayList<>();
    String path;
    
    public MainFrame(String user) {
        initComponents();
        // 2nd method  
        currentUser = user;
        
        for(int i = 0; i < Customer.getCustomerList().size(); i++){
            if(currentUser.equals("user") && !preset){
            	mr.setFoodName("Kolo Mee");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Noodles");
                mr.setDay("Wednesday");
                mr.setDate("02-06-2021");
                mr.setMealType("Breakfast");
                mr.setDrink("Teh C");
                imgList.add(".\\src\\mealdiary\\Image\\kolomee.jpg");
                mr.add();
                
                mr.setFoodName("Nasi Lemak");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Grains");
                mr.setDay("Wednesday");
                mr.setDate("02-06-2021");
                mr.setMealType("Lunch");
                mr.setDrink("Teh Ais");
                imgList.add(".\\src\\mealdiary\\Image\\nasilemak.jpg");
                mr.add();
                
                mr.setFoodName("Kueh Chap");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Noodles");
                mr.setDay("Wednesday");
                mr.setDate("02-06-2021");
                mr.setMealType("Dinner");
                mr.setDrink("Kopi O");
                imgList.add(".\\src\\mealdiary\\Image\\kuehchap.png");
                mr.add(); 
                
                mr.setFoodName("Kompia");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Grains");
                mr.setDay("Thursday");
                mr.setDate("03-06-2021");
                mr.setMealType("Breakfast");
                mr.setDrink("Plain water");
                imgList.add(".\\src\\mealdiary\\Image\\kompia.png");
                mr.add();
                
                mr.setFoodName("Sarawak Laksa");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Noodles");
                mr.setDay("Thursday");
                mr.setDate("03-06-2021");
                mr.setMealType("Lunch");
                mr.setDrink("Orange juice");
                imgList.add(".\\src\\mealdiary\\Image\\sarawaklaksa.png");
                mr.add();
                
                mr.setFoodName("Kampua Mee");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Noodles");
                mr.setDay("Thursday");
                mr.setDate("03-06-2021");
                mr.setMealType("Dinner");
                mr.setDrink("Plain water");
                imgList.add(".\\src\\mealdiary\\Image\\kampuamee.png");
                mr.add();
                
                mr.setFoodName("Cold Cereal");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Grains");
                mr.setDay("Friday");
                mr.setDate("04-06-2021");
                mr.setMealType("Breakfast");
                mr.setDrink("Milk");
                imgList.add(".\\src\\mealdiary\\Image\\cereal.jpeg");
                mr.add();
                
                mr.setFoodName("Nasik Aruk");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Grains");
                mr.setDay("Friday");
                mr.setDate("04-06-2021");
                mr.setMealType("Lunch");
                mr.setDrink("Teh Ais");
                imgList.add(".\\src\\mealdiary\\Image\\nasikaruk.jpeg");
                mr.add();
                
                mr.setFoodName("Belacan Bihun");
                mr.setRecordID(String.valueOf(++record));
                mr.setFoodGrp("Grains");
                mr.setDay("Friday");
                mr.setDate("03-06-2021");
                mr.setMealType("Dinner");
                mr.setDrink("Lemonade");
                imgList.add(".\\src\\mealdiary\\Image\\belacanbihun.png");
                mr.add();
                
                preset = true;
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // for reset the table
        for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
            
            Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
            model.addRow(obj);
        }
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        View = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        foodGrpBox = new javax.swing.JComboBox<>();
        dayBox = new javax.swing.JComboBox<>();
        drinkText = new javax.swing.JTextField();
        browseBtn = new javax.swing.JButton();
        foodNameLabel = new javax.swing.JLabel();
        foodGrpLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        drinkLabel = new javax.swing.JLabel();
        foodNameText = new javax.swing.JTextField();
        imgLabel = new javax.swing.JLabel();
        imageOutput = new javax.swing.JLabel();
        daysBox = new javax.swing.JComboBox<>();
        monthsBox = new javax.swing.JComboBox<>();
        yearsBox = new javax.swing.JComboBox<>();
        mealTypeLabel = new javax.swing.JLabel();
        mealTypeBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logoutBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        View.setText("View");
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewMouseClicked(evt);
            }
        });
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(View)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(clearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(View)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        foodGrpBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruits", "Vegetables", "Grains", "Protein Foods", "Dairy", "Noodles"}));
        foodGrpBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodGrpBoxActionPerformed(evt);
            }
        });

        dayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        dayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBoxActionPerformed(evt);
            }
        });

        browseBtn.setText("Browse...");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        foodNameLabel.setText("Food Name");

        foodGrpLabel.setText("Food Group");

        dateLabel.setText("Date");

        dayLabel.setText("Day");

        drinkLabel.setText("Drink");

        foodNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodNameTextActionPerformed(evt);
            }
        });

        imgLabel.setText("Image");

        imageOutput.setBackground(new java.awt.Color(0, 0, 0));
        imageOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        daysBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        daysBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysBoxActionPerformed(evt);
            }
        });

        monthsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        monthsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsBoxActionPerformed(evt);
            }
        });

        yearsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        mealTypeLabel.setText("Meal Type");

        mealTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Breakfast", "Lunch", "Dinner" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(browseBtn)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(imgLabel)
                            .addGap(42, 42, 42)
                            .addComponent(imageOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(foodGrpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(mealTypeLabel)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mealTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(daysBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(foodGrpBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dayBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drinkText))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(foodNameLabel)
                        .addGap(30, 30, 30)
                        .addComponent(foodNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgLabel)
                    .addComponent(imageOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(browseBtn)
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodGrpLabel)
                    .addComponent(foodGrpBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkLabel)
                    .addComponent(drinkText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mealTypeLabel)
                    .addComponent(mealTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Food Name", "Food Group", "Date", "Day", "Drink", "Meal Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        foodName = foodNameText.getText(); 
        
        foodGrp = foodGrpBox.getSelectedItem().toString();
        
        date = mr.dateConvert(daysBox.getSelectedItem().toString(), monthsBox.getSelectedItem().toString(), yearsBox.getSelectedItem().toString());
        
        day = dayBox.getSelectedItem().toString();
        drink = drinkText.getText();
        mealType = mealTypeBox.getSelectedItem().toString();
        
        mr.setFoodName(foodName);
        mr.setRecordID(String.valueOf(++record));
        mr.setDrink(drink);
        mr.setDay(day);
        mr.setDate(date);
        mr.setFoodGrp(foodGrp);
        mr.setMealType(mealType);
        mr.add();
       
        imgList.add(path);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // for reset the table
        for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
            
            Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
            model.addRow(obj);
        }
        clearField();
        
//        JOptionPane.showMessageDialog(null, MealRecord.getMealRecordList().size());
        
        // add row to jTable
    }//GEN-LAST:event_addBtnActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        path = file.getAbsolutePath();
        
        Image im = Toolkit.getDefaultToolkit().createImage(path);
        im = im.getScaledInstance(imageOutput.getWidth(),imageOutput.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ii = new ImageIcon(im);
        imageOutput.setIcon(ii);
        
        
    }//GEN-LAST:event_browseBtnActionPerformed

    private void clearField(){
        foodNameText.setText("");
        drinkText.setText("");
        dayBox.setSelectedIndex(0);
        daysBox.setSelectedIndex(0);
        monthsBox.setSelectedIndex(0);
        yearsBox.setSelectedIndex(0);
        foodGrpBox.setSelectedIndex(0);
        mealTypeBox.setSelectedIndex(0);
        imageOutput.setIcon(null);
    }
    
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void foodGrpBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodGrpBoxActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_foodGrpBoxActionPerformed

    private void dayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayBoxActionPerformed

    private void foodNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodNameTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_foodNameTextActionPerformed

    private void daysBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysBoxActionPerformed

    private void monthsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthsBoxActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        dtm = (DefaultTableModel) jTable1.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this record?", "Delete", dialogButton);
        if (dialogResult == 0) {
            if(jTable1.getSelectedRowCount()==1) {
                
                jTextRecordID = dtm.getValueAt(jTable1.getSelectedRow(), 0).toString();
                
                for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
                    if(MealRecord.getMealRecordList().get(i).getRecordID().equals(jTextRecordID)){
                        mr.del(i);
                        imgList.remove(i);
                    }
                }
                
                dtm.setRowCount(0);
                for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
                    
                    Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                                    MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                                    MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                                    MealRecord.getMealRecordList().get(i).getMealType()};
                    dtm.addRow(obj);
                }
                clearField();
            }
            else{
                if(jTable1.getRowCount()==0){
                    JOptionPane.showMessageDialog(this, "Table is Empty");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Selete a row to delete.");
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        dtm = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1) { //if a row is selected then update
            String updatefoodName = foodNameText.getText();
            String updatefoodGrp = foodGrpBox.getSelectedItem().toString();
            String updatedays =  daysBox.getSelectedItem().toString();
            String updatemonths = monthsBox.getSelectedItem().toString();
            String updateyears = yearsBox.getSelectedItem().toString();
            String updateday = dayBox.getSelectedItem().toString();
            String updatedrink = drinkText.getText();
            String updatedate = updatedays+"-"+updatemonths+"-"+updateyears;
            String getrecordID = dtm.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String updateMealType = mealTypeBox.getSelectedItem().toString();
            
            dtm.setValueAt(updatefoodName, jTable1.getSelectedRow(), 1);
            dtm.setValueAt(updatefoodGrp, jTable1.getSelectedRow(), 2);
            dtm.setValueAt(updatedays+"-"+updatemonths+"-"+updateyears, jTable1.getSelectedRow(), 3);
            dtm.setValueAt(updateday, jTable1.getSelectedRow(), 4);
            dtm.setValueAt(updatedrink, jTable1.getSelectedRow(), 5);
            dtm.setValueAt(updateMealType, jTable1.getSelectedRow(),6);
            
            for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
                if(MealRecord.getMealRecordList().get(i).getRecordID().equals(getrecordID)){
                    mr.edit(updatefoodName, updatedrink, updateday, updatedate, updatefoodGrp, updateMealType, i);
                }
            }
            
            JOptionPane.showMessageDialog(this, "Update Successfully...");
        }
        else {
            if(jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is Empty...");
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select a row for update...");
            }
        }
        
    }//GEN-LAST:event_updateBtnActionPerformed
    
    public String substring(String Jtextdate, int index) {
        String days;
        String months;
        String years;
        
        days = Jtextdate.substring(0,2);
        months = Jtextdate.substring(3,5);
        years = Jtextdate.substring(6,10);
        
        switch (index) {
            case 1 -> {
                return days;
            }
            case 2 -> {
                return months;
            }
            case 3 -> {
                return years;
            }
            default -> {
            }
        }
        return null;
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //set data to their textfield
        dtm = (DefaultTableModel)jTable1.getModel();
        //set data to textfield or combobox when row is selected
        String jTextrecordID = dtm.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String jTextfoodName = dtm.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String jTextfoodGrp = dtm.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String Jtextdate = dtm.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String jTextday = dtm.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String jTextdrink = dtm.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String jTextMealType = dtm.getValueAt(jTable1.getSelectedRow(), 6).toString();
        
        //set to textfield or combobox
        foodNameText.setText(jTextfoodName);
        foodGrpBox.setSelectedItem(jTextfoodGrp);
        daysBox.setSelectedItem(substring(Jtextdate, 1));
        monthsBox.setSelectedItem(substring(Jtextdate, 2));
        yearsBox.setSelectedItem(substring(Jtextdate, 3));
        dayBox.setSelectedItem(jTextday);
        drinkText.setText(jTextdrink);
        mealTypeBox.setSelectedItem(jTextMealType);
        for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
            if(MealRecord.getMealRecordList().get(i).getRecordID().equals(jTextrecordID)){
                System.out.println(i);
                
                Image im = Toolkit.getDefaultToolkit().createImage(imgList.get(i));
                im = im.getScaledInstance(imageOutput.getWidth(),imageOutput.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ii = new ImageIcon(im);
                imageOutput.setIcon(ii);
                
            }
        }
        
        System.out.println(path);
    }//GEN-LAST:event_jTable1MouseClicked

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
       //JOptionPane.showMessageDialog(this, MealRecord.getMealRecordList().size() + "\n" + jTextRecordID);
        ViewFrame Fview = new ViewFrame();
        Fview.setVisible(true);
        Fview.pack();
        Fview.setLocationRelativeTo(null);
        Fview.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_ViewActionPerformed

    private void ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ViewMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        LoginFrame FLogin = new LoginFrame();
        FLogin.setVisible(true);
        FLogin.pack();
        FLogin.setLocationRelativeTo(null);
        FLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton View;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JComboBox<String> daysBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel drinkLabel;
    private javax.swing.JTextField drinkText;
    private javax.swing.JComboBox<String> foodGrpBox;
    private javax.swing.JLabel foodGrpLabel;
    private javax.swing.JLabel foodNameLabel;
    private javax.swing.JTextField foodNameText;
    private javax.swing.JLabel imageOutput;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JComboBox<String> mealTypeBox;
    private javax.swing.JLabel mealTypeLabel;
    private javax.swing.JComboBox<String> monthsBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox<String> yearsBox;
    // End of variables declaration//GEN-END:variables
}
