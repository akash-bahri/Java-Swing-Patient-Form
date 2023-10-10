/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.Patient;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Akash Bahri
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form newpanel
     */
    private ImageIcon icon;
    public FormPanel() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        FNameLabel = new javax.swing.JLabel();
        FNameText = new javax.swing.JTextField();
        UploadLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        AgeLabel = new javax.swing.JLabel();
        LNameLabel = new javax.swing.JLabel();
        ImageButton = new javax.swing.JButton();
        LNameText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        MessageLabel = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        PatientType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        OtherButton = new javax.swing.JRadioButton();
        MaleButton = new javax.swing.JRadioButton();
        FemaleButton = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(153, 204, 255));

        FNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FNameLabel.setText("First Name");

        FNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTextActionPerformed(evt);
            }
        });
        FNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FNameTextKeyPressed(evt);
            }
        });

        UploadLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UploadLabel.setText("Upload Image");

        SubmitButton.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        AgeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgeLabel.setText("Age");

        LNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LNameLabel.setText("Last Name");

        ImageButton.setBackground(new java.awt.Color(204, 204, 204));
        ImageButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ImageButton.setText("Choose File...");
        ImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageButtonActionPerformed(evt);
            }
        });

        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmailLabel.setText("Email");

        MessageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MessageLabel.setText("Message");

        ImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TitleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Patient Registration Form ");

        MessageTextArea.setColumns(20);
        MessageTextArea.setRows(5);
        jScrollPane1.setViewportView(MessageTextArea);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Patient Type");

        PatientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "ICU", "Emergency", "Pregnancy", "Surgery", "Staff" }));
        PatientType.setSelectedIndex(-1);
        PatientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Gender");

        GenderGroup.add(OtherButton);
        OtherButton.setText("Other");

        GenderGroup.add(MaleButton);
        MaleButton.setText("Male");

        GenderGroup.add(FemaleButton);
        FemaleButton.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgeLabel)
                            .addComponent(EmailLabel)
                            .addComponent(FNameLabel)
                            .addComponent(LNameLabel)
                            .addComponent(MessageLabel)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MaleButton)
                                .addGap(77, 77, 77)
                                .addComponent(FemaleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OtherButton))
                            .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FNameText)
                            .addComponent(LNameText)
                            .addComponent(AgeText)
                            .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(PatientType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UploadLabel)
                            .addComponent(ImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FNameLabel)
                            .addComponent(FNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNameLabel)
                            .addComponent(LNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeLabel)
                            .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel)
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MessageLabel)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(UploadLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ImageButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(PatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MaleButton)
                    .addComponent(FemaleButton)
                    .addComponent(OtherButton))
                .addGap(24, 24, 24)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FNameTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FNameTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_FNameTextActionPerformed

    private void FNameTextKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_FNameTextKeyPressed

        // TODO add your handling code here:
    }// GEN-LAST:event_FNameTextKeyPressed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        Patient newPatient = new Patient();

        try {
            newPatient.setFName(FNameText.getText());
            newPatient.setLName(LNameText.getText());
            newPatient.setAge(AgeText.getText());
            newPatient.setEmail(EmailText.getText());
            newPatient.setMessage(MessageTextArea.getText());
            newPatient.setIcon(icon);
            try {
                newPatient.setPatientType(PatientType.getSelectedItem().toString());
            } catch (Exception e) {
                throw new Exception("Patient Type Not Selected");
            }
            try {
                newPatient.setGender(GenderGroup.getSelection().getActionCommand());
            } catch (Exception e) {
                throw new Exception("Patient Gender Not Selected");
            }

            JOptionPane.showMessageDialog(this, "Submitted", "User Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage(), "User Information", JOptionPane.ERROR_MESSAGE);
        }

        // System.out.println(FName+Age);
    }// GEN-LAST:event_SubmitButtonActionPerformed

    private void ImageButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ImageButtonActionPerformed
        

        JFileChooser file = new JFileChooser();
        
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    ImageIcon icon = new ImageIcon(edited_image);
                    ImageLabel.setIcon(icon);
                    JOptionPane.showMessageDialog(null,"Successfully uploaded","Display Image",JOptionPane.INFORMATION_MESSAGE,(Icon) icon);
                    UploadLabel.setText("Image Uploaded");
                } else {
                    throw new Exception("Unsupported File");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "User Information", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        

    }// GEN-LAST:event_ImageButtonActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_EmailTextActionPerformed

    private void PatientTypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PatientTypeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PatientTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeText;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel FNameLabel;
    private javax.swing.JTextField FNameText;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JButton ImageButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel LNameLabel;
    private javax.swing.JTextField LNameText;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JRadioButton OtherButton;
    private javax.swing.JComboBox<String> PatientType;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UploadLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
