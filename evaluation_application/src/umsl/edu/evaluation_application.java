/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.derby.jdbc.ClientDriver;

/**
 *
 * @author Josh Hootman
 */
public class evaluation_application extends javax.swing.JFrame {

    private Connection myConnection;
    private Statement myStatement;
    private ResultSet myResultSet;


    public evaluation_application(String databaseDriver, String databaseURL) 
    {
        try
        {
            DriverManager.registerDriver(new ClientDriver());
            
            myConnection = DriverManager.getConnection("jdbc:derby://localhost:1527/evaluation_application_db");
            
            myStatement = myConnection.createStatement();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        initComponents();
        submitButton.setEnabled(false);
        loadTeams();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSliderTechnical = new javax.swing.JSlider();
        jSliderUseful = new javax.swing.JSlider();
        jSliderClarity = new javax.swing.JSlider();
        jSliderOverall = new javax.swing.JSlider();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelTechnical = new javax.swing.JLabel();
        jLabelUseful = new javax.swing.JLabel();
        jLabelClarity = new javax.swing.JLabel();
        jLabelOverall = new javax.swing.JLabel();
        jLabelTeams = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneGroupMembers = new javax.swing.JTextPane();
        jLabelComments = new javax.swing.JLabel();
        jTextFieldAverage = new javax.swing.JTextField();
        computeAvgLabel = new javax.swing.JLabel();
        calcAvg = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSliderTechnical.setMajorTickSpacing(1);
        jSliderTechnical.setMaximum(8);
        jSliderTechnical.setMinimum(1);
        jSliderTechnical.setPaintLabels(true);
        jSliderTechnical.setPaintTicks(true);
        jSliderTechnical.setSnapToTicks(true);
        jSliderTechnical.setToolTipText("");

        jSliderUseful.setMajorTickSpacing(1);
        jSliderUseful.setMaximum(8);
        jSliderUseful.setMinimum(1);
        jSliderUseful.setPaintLabels(true);
        jSliderUseful.setPaintTicks(true);
        jSliderUseful.setSnapToTicks(true);
        jSliderUseful.setToolTipText("");

        jSliderClarity.setMajorTickSpacing(1);
        jSliderClarity.setMaximum(8);
        jSliderClarity.setMinimum(1);
        jSliderClarity.setPaintLabels(true);
        jSliderClarity.setPaintTicks(true);
        jSliderClarity.setSnapToTicks(true);
        jSliderClarity.setToolTipText("");

        jSliderOverall.setMajorTickSpacing(1);
        jSliderOverall.setMaximum(8);
        jSliderOverall.setMinimum(1);
        jSliderOverall.setPaintLabels(true);
        jSliderOverall.setPaintTicks(true);
        jSliderOverall.setSnapToTicks(true);
        jSliderOverall.setToolTipText("");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabelTechnical.setText("Q1: Technical?");

        jLabelUseful.setText("Q2: Useful?");

        jLabelClarity.setText("Q3: Clarity?");

        jLabelOverall.setText("Q4: Overall?");

        jLabelTeams.setText("TEAMS");

        jTextPaneGroupMembers.setText("Add Group Member Names Here");
        jScrollPane1.setViewportView(jTextPaneGroupMembers);

        jLabelComments.setText("Comments:");

        jTextFieldAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAverageActionPerformed(evt);
            }
        });

        computeAvgLabel.setText("Computed Average from questions above:");

        calcAvg.setText("Calc Avg");
        calcAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcAvgActionPerformed(evt);
            }
        });

        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelClarity, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSliderClarity, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelUseful, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSliderUseful, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTechnical, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSliderTechnical, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelOverall, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelComments, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSliderOverall, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcAvg)
                            .addComponent(computeAvgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTeams, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTechnical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addComponent(jSliderTechnical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderUseful, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUseful, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderClarity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClarity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderOverall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOverall, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComments, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(computeAvgLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcAvg))
                    .addComponent(jTextFieldAverage))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void calcAvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcAvgActionPerformed
       //retrieves slider values
       int technical = jSliderTechnical.getValue();
       int useful = jSliderUseful.getValue();
       int clarity = jSliderClarity.getValue();
       int overall = jSliderOverall.getValue();
       
       //calculate the average and change to String
       double average = (double) (technical + useful + clarity + overall) / 4;
       String tempStringAverage = Double.toString(average);
       //Set the jTextFieldAverage text to our string average, enable the submit button 
       jTextFieldAverage.setText(tempStringAverage);
       submitButton.setEnabled(true);
    }//GEN-LAST:event_calcAvgActionPerformed

    private void jTextFieldAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAverageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAverageActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        //returns sliders to original position, hides the submit button, and clears the text in jTextFieldAverage
        jTextFieldAverage.setText("");
        jSliderTechnical.setValue(8);
        jSliderUseful.setValue(8);
        jSliderClarity.setValue(8);
        jSliderOverall.setValue(8);
        submitButton.setEnabled(false);

    }//GEN-LAST:event_clearButtonActionPerformed
    
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        //Retrieving the current values from the sliders and textfields
        int q1T = jSliderTechnical.getValue();
        int q2U = jSliderUseful.getValue();
        int q3C = jSliderClarity.getValue();
        int q4O = jSliderOverall.getValue();
        String stringTeamavg = jTextFieldAverage.getText();
        double teamavg = Double.parseDouble(stringTeamavg);
        String comments = jTextPaneGroupMembers.getText();
        String myteamname = (String)jComboBox1.getSelectedItem();
        double currentAverage = (double) (q1T + q2U + q3C + q4O)/4;
        
        //A conditional that checks the current average and the calculated average
        //If they do not match, the sliders have been moved after calc average has been pressed
        if (currentAverage == teamavg)
        {
            //upload data to database
            try
            {
                String sql1 = "UPDATE APP.TEAMS SET Q1T = " + q1T
                + ", Q2U = " + q2U
                + ", Q3C = " + q3C
                + ", Q4O = " + q4O
                + ", TEAMAVG = " + teamavg
                + ", COMMENTS = " + "'" + comments
                + "'" + "WHERE " + "TEAMNAME = " + "'" + myteamname + "'";
                myStatement.executeUpdate(sql1);
            }
            catch ( SQLException exception )
            {
                exception.printStackTrace();
            }
                //reset sliders and clear calc average textfield, hide the submit button
                // and send pop up (with JOptionPane) stating successful submission message
                jTextFieldAverage.setText("");
                jSliderTechnical.setValue(8);
                jSliderUseful.setValue(8);
                jSliderClarity.setValue(8);
                jSliderOverall.setValue(8);
                submitButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Submission was succesful, thank you", "Submission Status", JOptionPane.PLAIN_MESSAGE);
            }
        //If the two averages don't match, notify the user with JOption pane popup
        else if (currentAverage != teamavg)
        {
            JOptionPane.showMessageDialog(null, "Calc avg does not match the sliders. "
                    + "To properly submit, you must re-calculate the average.");
            //JOptionPane.showMessageDialog(null, currentAverage);
            //JOptionPane.showMessageDialog(null, teamavg);

        }
        
        
        
    }//GEN-LAST:event_submitButtonActionPerformed
    
    private void loadTeams()
    {
// get team names from the database and add them to the combobox(dropdown bar) at the top
        try
        {
            
            myResultSet = myStatement.executeQuery( "SELECT TEAMNAME FROM APP.TEAMS" );

            while ( myResultSet.next() )
            {

                jComboBox1.addItem( myResultSet.getString( "TEAMNAME" ) );
            }

            myResultSet.close(); // close myResultSet

        }

        catch ( SQLException exception )
        {
            System.out.println(exception.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        //database connection information 
        String databaseDriver = "org.apache.derbt.jdbc.ClientDriver";
        String databaseURL = "jdbc:derby://localhost:1527/evaluation_application_db";

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evaluation_application(databaseDriver, databaseURL).setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcAvg;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel computeAvgLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelClarity;
    private javax.swing.JLabel jLabelComments;
    private javax.swing.JLabel jLabelOverall;
    private javax.swing.JLabel jLabelTeams;
    private javax.swing.JLabel jLabelTechnical;
    private javax.swing.JLabel jLabelUseful;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderClarity;
    private javax.swing.JSlider jSliderOverall;
    private javax.swing.JSlider jSliderTechnical;
    private javax.swing.JSlider jSliderUseful;
    private javax.swing.JTextField jTextFieldAverage;
    private javax.swing.JTextPane jTextPaneGroupMembers;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables

    
}
