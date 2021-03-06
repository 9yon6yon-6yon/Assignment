/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;

/**
 * @author user
 */
public class EditContactsPannel extends javax.swing.JFrame {

    /**
     * Creates new form EditContactsPannel
     */
    public EditContactsPannel() {
        this.setTitle("AddressBook Application");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddressBookLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        PhoneField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressField = new javax.swing.JTextArea();
        SaveIneditbutton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        EditContactlabel = new javax.swing.JLabel();
        OldnameLabel = new javax.swing.JLabel();
        OldNameField = new javax.swing.JTextField();
        description = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenuItemOfShowContacts = new javax.swing.JMenuItem();
        MenuItemOfSearchContacts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddressBookLabel.setBackground(new java.awt.Color(102, 255, 204));
        AddressBookLabel.setFont(new java.awt.Font("hooge 05_53", 2, 14)); // NOI18N
        AddressBookLabel.setForeground(new java.awt.Color(0, 102, 102));
        AddressBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddressBookLabel.setText(" AddressBook Application");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NameLabel.setText("Name :");

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PhoneLabel.setText("Phone :");

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmailLabel.setText("Email :");

        AddressLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddressLabel.setText("Address : ");

        PhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneFieldActionPerformed(evt);
            }
        });

        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        AddressField.setColumns(20);
        AddressField.setRows(5);
        jScrollPane1.setViewportView(AddressField);

        SaveIneditbutton.setBackground(new java.awt.Color(102, 255, 102));
        SaveIneditbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SaveIneditbutton.setForeground(new java.awt.Color(51, 51, 51));
        SaveIneditbutton.setText("Save");
        SaveIneditbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    SaveIneditbuttonActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 255, 51));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        EditContactlabel.setBackground(new java.awt.Color(255, 255, 204));
        EditContactlabel.setFont(new java.awt.Font("hooge 05_53", 1, 14)); // NOI18N
        EditContactlabel.setForeground(new java.awt.Color(0, 102, 102));
        EditContactlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditContactlabel.setText("Edit Contact");

        OldnameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OldnameLabel.setText("Old Name :");

        OldNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldNameFieldActionPerformed(evt);
            }
        });

        description.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        description.setForeground(new java.awt.Color(102, 102, 102));
        description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        description.setText("You must enter an old name that you want to edit");
        description.setToolTipText("");

        jMenu2.setBackground(new java.awt.Color(204, 255, 153));
        jMenu2.setText("Menu");

        MenuItemOfShowContacts.setText("Contacts");
        MenuItemOfShowContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOfShowContactsActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemOfShowContacts);

        MenuItemOfSearchContacts.setText("Search Contacts");
        MenuItemOfSearchContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOfSearchContactsActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemOfSearchContacts);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cancelButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SaveIneditbutton).addGap(40, 40, 40))
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(AddressBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        450, Short.MAX_VALUE)
                                                .addComponent(
                                                        EditContactlabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup().addGap(60, 60, 60).addGroup(layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NameField)
                                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PhoneLabel).addComponent(OldnameLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(OldNameField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane1)
                                                .addComponent(EmailField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PhoneField)))
                                .addComponent(description, javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE))
                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addComponent(AddressBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditContactlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18).addComponent(description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(OldnameLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OldNameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25).addComponent(PhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(EmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23).addComponent(AddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SaveIneditbutton).addComponent(cancelButton))
                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_NameFieldActionPerformed

    private void PhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PhoneFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_PhoneFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_EmailFieldActionPerformed

    private void MenuItemOfShowContactsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MenuItemOfShowContactsActionPerformed
        this.dispose();
        new ShowContactsPannel().setVisible(true);// TODO add your handling code here:
    }// GEN-LAST:event_MenuItemOfShowContactsActionPerformed

    private void MenuItemOfSearchContactsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_MenuItemOfSearchContactsActionPerformed
        this.dispose();
        new SearchPannel().setVisible(true);// TODO add your handling code here:
    }// GEN-LAST:event_MenuItemOfSearchContactsActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        new UserPanel().setVisible(true); // TODO add your handling code here:
    }// GEN-LAST:event_cancelButtonActionPerformed

    private void OldNameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OldNameFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_OldNameFieldActionPerformed

    private void SaveIneditbuttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        String oldname = OldNameField.getText();
        String name = NameField.getText();
        String number = PhoneField.getText();
        String email = EmailField.getText();
        String address = AddressField.getText();
        File file = new File("Files/Contacts.txt");
        File temp = new File("Files/temp.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        FileWriter fileWriter = new FileWriter(temp, true);
        String line;
        String newLine = name + " " + number + " " + email + " " + address;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains(oldname)) {
                line = newLine;
            }
            fileWriter.append(line).append("\n");
        }
        bufferedReader.close();
        fileWriter.close();
        temp.renameTo(file);

        OldNameField.setText("");
        NameField.setText("");
        PhoneField.setText("");
        EmailField.setText("");
        AddressField.setText("");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditContactsPannel.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditContactsPannel.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditContactsPannel.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditContactsPannel.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditContactsPannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressBookLabel;
    private javax.swing.JTextArea AddressField;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel EditContactlabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JMenuItem MenuItemOfSearchContacts;
    private javax.swing.JMenuItem MenuItemOfShowContacts;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField OldNameField;
    private javax.swing.JLabel OldnameLabel;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton SaveIneditbutton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel description;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
