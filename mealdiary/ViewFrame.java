/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealdiary;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author waikh
 */
public class ViewFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewFrame
     */
    MealRecord mr = new MealRecord(null, null, null, null, null, null, null, null);
    DefaultTableModel dtm;
            
//    public ViewFrame(ArrayList<MealRecord> mealRecordList) {
//        initComponents();
//        for(int i = 0; i < mealRecordList.size(); i++){
//            mr.setFoodName(mealRecordList.get(i).getFoodName());
//            mr.setRecordID(mealRecordList.get(i).getRecordID().substring(4));
//            mr.setDrink(mealRecordList.get(i).getDrink());
//            mr.setDay(mealRecordList.get(i).getDay());
//            mr.setDate(mealRecordList.get(i).getDate());
//            mr.setFoodGrp(mealRecordList.get(i).getFoodGrp());
//            mr.setMealType(mealRecordList.get(i).getMealType());
//            mr.add();
//            
//        }
//       // JOptionPane.showMessageDialog(null, MealRecord.getMealRecordList().size()); // to check inserted array
//        AddRowToJTable();
//    }
    
    public ViewFrame() {
        initComponents();
        AddRowToJTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        foodGrpLabel = new javax.swing.JLabel();
        mealTypeLabel = new javax.swing.JLabel();
        foodGroupBox = new javax.swing.JComboBox<>();
        mealTypeBox = new javax.swing.JComboBox<>();
        GoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane1.setViewportView(jTable1);

        searchText.setText("-");
        searchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextMouseClicked(evt);
            }
        });

        jLabel1.setText("Search");

        foodGrpLabel.setText("Food Group");

        mealTypeLabel.setText("Meal Type");

        foodGroupBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Fruits", "Vegetables", "Grains", "Protein Foods", "Dairy", "Noodles"}));
        foodGroupBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodGroupBoxActionPerformed(evt);
            }
        });

        mealTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Breakfast", "Lunch", "Dinner" }));

        GoBtn.setText("Go");
        GoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBtnMouseClicked(evt);
            }
        });
        GoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(foodGrpLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foodGroupBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mealTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(mealTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(GoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(foodGrpLabel)
                    .addComponent(mealTypeLabel)
                    .addComponent(foodGroupBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mealTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoBtn))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBtnActionPerformed
        search();
        clearField();
    }//GEN-LAST:event_GoBtnActionPerformed

    private void foodGroupBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodGroupBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodGroupBoxActionPerformed

    private void GoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GoBtnMouseClicked

    private void searchTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextMouseClicked
        // TODO add your handling code here:
        searchText.setText("");
    }//GEN-LAST:event_searchTextMouseClicked
    
    private void AddRowToJTable(){
        dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0); // for reset the table
        for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
            
            Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
            dtm.addRow(obj);
        }

    }
    private void clearField(){
        searchText.setText("-");
        foodGroupBox.setSelectedItem("-");
        mealTypeBox.setSelectedItem("-");
    }
    
    public void search(){
        String getSearchText = searchText.getText().toLowerCase(); 
        String getFoodGrp = foodGroupBox.getSelectedItem().toString().toLowerCase();
        String getMealType = mealTypeBox.getSelectedItem().toString().toLowerCase();
        
        dtm.setRowCount(0); // for reset the table
        for(int i = 0; i < MealRecord.getMealRecordList().size(); i++){
            if("-".equals(getFoodGrp) && "-".equals(getMealType) && "-".equals(getSearchText)){
                Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
                dtm.addRow(obj);   
            }
            else if("-".equals(getFoodGrp) && "-".equals(getMealType) && !"-".equals(getSearchText)){
                if
                (
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getRecordID().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodName().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDate().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDay().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDrink().toLowerCase()) ||
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getMealType().toLowerCase())
                )
                {
                Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
                dtm.addRow(obj);
                }
            }
            else if("-".equals(getFoodGrp) && !"-".equals(getMealType) && !"-".equals(getSearchText)){
                if(MealRecord.getMealRecordList().get(i).getMealType().toLowerCase().equals(getMealType) &&
                (
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getRecordID().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodName().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDate().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDay().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDrink().toLowerCase()) ||
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getMealType().toLowerCase())
                )
                        ){
                Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
                dtm.addRow(obj);

                }
            }
            else if(!"-".equals(getFoodGrp) && !"-".equals(getMealType) && !"-".equals(getSearchText)){
                if(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase().equals(getFoodGrp) && 
                 MealRecord.getMealRecordList().get(i).getMealType().toLowerCase().equals(getMealType) &&
                (
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getRecordID().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodName().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDate().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDay().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDrink().toLowerCase()) ||
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getMealType().toLowerCase())
                ))
                {
                    Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                                MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                                MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                                MealRecord.getMealRecordList().get(i).getMealType()};
                    dtm.addRow(obj);
                }
            }
            else if(!"-".equals(getFoodGrp) && !"-".equals(getMealType) && "-".equals(getSearchText)){
                if(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase().equals(getFoodGrp) && 
                 MealRecord.getMealRecordList().get(i).getMealType().toLowerCase().equals(getMealType))
                {
                    Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                                MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                                MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                                MealRecord.getMealRecordList().get(i).getMealType()};
                    dtm.addRow(obj);
                } 
            }
            else if(!"-".equals(getFoodGrp) && "-".equals(getMealType) && "-".equals(getSearchText)){
                if(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase().equals(getFoodGrp))
                {
                    Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                                MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                                MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                                MealRecord.getMealRecordList().get(i).getMealType()};
                    dtm.addRow(obj);
                }
            }
            else if(!"-".equals(getFoodGrp) && "-".equals(getMealType) && !"-".equals(getSearchText)){
                if(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase().equals(getFoodGrp) &&
                (
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getRecordID().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodName().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getFoodGrp().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDate().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDay().toLowerCase()) || 
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getDrink().toLowerCase()) ||
                    getSearchText.matches(MealRecord.getMealRecordList().get(i).getMealType().toLowerCase())
                ))
                {
                    Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                                MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                                MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                                MealRecord.getMealRecordList().get(i).getMealType()};
                    dtm.addRow(obj);
                } 
            }
            else if("-".equals(getFoodGrp) && !"-".equals(getMealType) && "-".equals(getSearchText)){
                if(MealRecord.getMealRecordList().get(i).getMealType().toLowerCase().equals(getMealType))
                {
                Object[] obj = {MealRecord.getMealRecordList().get(i).getRecordID(), MealRecord.getMealRecordList().get(i).getFoodName(), 
                            MealRecord.getMealRecordList().get(i).getFoodGrp(), MealRecord.getMealRecordList().get(i).getDate(),
                            MealRecord.getMealRecordList().get(i).getDay(), MealRecord.getMealRecordList().get(i).getDrink(),
                            MealRecord.getMealRecordList().get(i).getMealType()};
                dtm.addRow(obj);
                }
           }
        }
    }
    
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
            java.util.logging.Logger.getLogger(ViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GoBtn;
    private javax.swing.JComboBox<String> foodGroupBox;
    private javax.swing.JLabel foodGrpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> mealTypeBox;
    private javax.swing.JLabel mealTypeLabel;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}
