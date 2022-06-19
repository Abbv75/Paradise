/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paradise;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import paradise.objets.Medecin;
import paradise.objets.Patient;
import paradise.objets.SQL_Outil;

/**
 *
 * @author Younouss boré
 */
public class Prise_en_charge_interface extends javax.swing.JFrame {

    /**
     * Creates new form Prise_en_charge_interface
     */
    public Prise_en_charge_interface() {
        initComponents();
        initialiser_interface();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        action_name = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        facture_detail = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        facture_prix = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        facture_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        facture_nom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        facture_prenom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        action_name.setText("Action");

        jLabel2.setText("Detail de prise en charge:");

        facture_detail.setColumns(20);
        facture_detail.setRows(5);
        jScrollPane1.setViewportView(facture_detail);

        facture_prix.setText("0000");
        facture_prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facture_prixActionPerformed(evt);
            }
        });

        jLabel3.setText("FCFA");

        facture_btn.setText("Facturer");
        facture_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facture_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facture_prix, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(facture_btn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facture_prix, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(facture_btn))
                .addContainerGap())
        );

        jLabel1.setText("Nom:");

        facture_nom.setText("son nom");

        jLabel5.setText("Prenom:");

        facture_prenom.setText("son prenom");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facture_nom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facture_prenom)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(facture_nom)
                    .addComponent(jLabel5)
                    .addComponent(facture_prenom))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 201, Short.MAX_VALUE)
                        .addComponent(action_name)
                        .addGap(0, 202, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(action_name)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void facture_prixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facture_prixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facture_prixActionPerformed

    private void facture_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facture_btnMouseClicked
        // TODO add your handling code here:
        if(facturer()){
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Une erreur est survenue", "erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_facture_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Prise_en_charge_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prise_en_charge_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prise_en_charge_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prise_en_charge_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prise_en_charge_interface().setVisible(true);
            }
        });
    }
    
    SQL_Outil C1=new SQL_Outil("paradis");
    
    public boolean facturer(){
        String[] traitement_key= new String[1];
        traitement_key[0]="detail";
        String[] traitement_value= new String[1];
        traitement_value[0]=facture_detail.getText();
        if(action_name.getText().equals("traitement")){
            try{
                if(C1.try_connection()){
                    if(C1.insert_into("traitement", traitement_key, traitement_value)){
                        ResultSet traitement=C1.simple_select("traitement");
                        if(traitement!=null){
                            traitement.next();
                            String[] prise_en_charge_key= new String[2];
                            prise_en_charge_key[0]="id_patient";
                            prise_en_charge_key[1]="id_traitement";
                            String[] prise_en_charge_value= new String[2];
                            prise_en_charge_value[0]=String.valueOf(Interface_docteur.current_patient.id);
                            prise_en_charge_value[1]=traitement.getString("id");
                            if(C1.insert_into("prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                traitement=C1.simple_select("prise_en_charge");
                                if(traitement!=null){
                                    traitement.next();
                                    prise_en_charge_key[0]="prix";
                                    prise_en_charge_key[1]="id_prise_en_charge";
                                    prise_en_charge_value[0]=facture_prix.getText();
                                    prise_en_charge_value[1]=traitement.getString("id");
                                    if(C1.insert_into("facture",prise_en_charge_key,prise_en_charge_value)){
                                        prise_en_charge_key[0]="id_user";
                                        prise_en_charge_key[1]="id_prise_en_charge";
                                        prise_en_charge_value[0]=Medecin.id;
                                        prise_en_charge_value[1]=traitement.getString("id");
                                        if(C1.insert_into("relation_prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                            String[] ticket_off_key=new String[1];
                                            String[] ticket_off_value=new String[1];
                                            ticket_off_key[0]="statut";
                                            ticket_off_value[0]="0";
                                            if(C1.edit_from_id("ticket", ticket_off_key, ticket_off_value, Integer.parseInt(Interface_docteur.current_patient.numero_ticket))){
                                                return true;
                                            }
                                            else{
                                                return false;
                                            }
                                            
                                        }
                                        else{
                                            return false;
                                        }
                                    }
                                    else{
                                        return false;
                                    }
                                }
                                else{
                                    return false;
                                } 
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            return false;
                        }     
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        else if(action_name.getText().equals("Consulter")){
            try{
                if(C1.try_connection()){
                    if(C1.insert_into("consultation", traitement_key, traitement_value)){
                        ResultSet traitement=C1.simple_select("consultation");
                        if(traitement!=null){
                            traitement.next();
                            String[] prise_en_charge_key= new String[2];
                            prise_en_charge_key[0]="id_patient";
                            prise_en_charge_key[1]="id_consultation";
                            String[] prise_en_charge_value= new String[2];
                            prise_en_charge_value[0]=String.valueOf(Interface_docteur.current_patient.id);
                            prise_en_charge_value[1]=traitement.getString("id");
                            if(C1.insert_into("prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                traitement=C1.simple_select("prise_en_charge");
                                if(traitement!=null){
                                    traitement.next();
                                    prise_en_charge_key[0]="prix";
                                    prise_en_charge_key[1]="id_prise_en_charge";
                                    prise_en_charge_value[0]=facture_prix.getText();
                                    prise_en_charge_value[1]=traitement.getString("id");
                                    if(C1.insert_into("facture",prise_en_charge_key,prise_en_charge_value)){
                                        prise_en_charge_key[0]="id_user";
                                        prise_en_charge_key[1]="id_prise_en_charge";
                                        prise_en_charge_value[0]=Medecin.id;
                                        prise_en_charge_value[1]=traitement.getString("id");
                                        if(C1.insert_into("relation_prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                            String[] ticket_off_key=new String[1];
                                            String[] ticket_off_value=new String[1];
                                            ticket_off_key[0]="statut";
                                            ticket_off_value[0]="0";
                                            if(C1.edit_from_id("ticket", ticket_off_key, ticket_off_value, Integer.parseInt(Interface_docteur.current_patient.numero_ticket))){
                                                return true;
                                            }
                                            else{
                                                return false;
                                            }
                                        }
                                        else{
                                            return false;
                                        }
                                    }
                                    else{
                                        return false;
                                    }
                                }
                                else{
                                    return false;
                                } 
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            return false;
                        }     
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        else if(action_name.getText().equals("Analyser")){
            try{
                if(C1.try_connection()){
                    if(C1.insert_into("analyse", traitement_key, traitement_value)){
                        ResultSet traitement=C1.simple_select("analyse");
                        if(traitement!=null){
                            traitement.next();
                            String[] prise_en_charge_key= new String[2];
                            prise_en_charge_key[0]="id_patient";
                            prise_en_charge_key[1]="id_analyse";
                            String[] prise_en_charge_value= new String[2];
                            prise_en_charge_value[0]=String.valueOf(Interface_docteur.current_patient.id);
                            prise_en_charge_value[1]=traitement.getString("id");
                            if(C1.insert_into("prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                traitement=C1.simple_select("prise_en_charge");
                                if(traitement!=null){
                                    traitement.next();
                                    prise_en_charge_key[0]="prix";
                                    prise_en_charge_key[1]="id_prise_en_charge";
                                    prise_en_charge_value[0]=facture_prix.getText();
                                    prise_en_charge_value[1]=traitement.getString("id");
                                    if(C1.insert_into("facture",prise_en_charge_key,prise_en_charge_value)){
                                        prise_en_charge_key[0]="id_user";
                                        prise_en_charge_key[1]="id_prise_en_charge";
                                        prise_en_charge_value[0]=Medecin.id;
                                        prise_en_charge_value[1]=traitement.getString("id");
                                        if(C1.insert_into("relation_prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                            String[] ticket_off_key=new String[1];
                                            String[] ticket_off_value=new String[1];
                                            ticket_off_key[0]="statut";
                                            ticket_off_value[0]="0";
                                            if(C1.edit_from_id("ticket", ticket_off_key, ticket_off_value, Integer.parseInt(Interface_docteur.current_patient.numero_ticket))){
                                                return true;
                                            }
                                            else{
                                                return false;
                                            }
                                        }
                                        else{
                                            return false;
                                        }
                                    }
                                    else{
                                        return false;
                                    }
                                }
                                else{
                                    return false;
                                } 
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            return false;
                        }     
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        else if(action_name.getText().equals("Prescription")){
            try{
                if(C1.try_connection()){
                    if(C1.insert_into("ordonnance", traitement_key, traitement_value)){
                        ResultSet traitement=C1.simple_select("ordonnance");
                        if(traitement!=null){
                            traitement.next();
                            String[] prise_en_charge_key= new String[2];
                            prise_en_charge_key[0]="id_patient";
                            prise_en_charge_key[1]="id_ordonnance";
                            String[] prise_en_charge_value= new String[2];
                            prise_en_charge_value[0]=String.valueOf(Interface_docteur.current_patient.id);
                            prise_en_charge_value[1]=traitement.getString("id");
                            if(C1.insert_into("prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                traitement=C1.simple_select("prise_en_charge");
                                if(traitement!=null){
                                    traitement.next();
                                    prise_en_charge_key[0]="prix";
                                    prise_en_charge_key[1]="id_prise_en_charge";
                                    prise_en_charge_value[0]=facture_prix.getText();
                                    prise_en_charge_value[1]=traitement.getString("id");
                                    if(C1.insert_into("facture",prise_en_charge_key,prise_en_charge_value)){
                                        prise_en_charge_key[0]="id_user";
                                        prise_en_charge_key[1]="id_prise_en_charge";
                                        prise_en_charge_value[0]=Medecin.id;
                                        prise_en_charge_value[1]=traitement.getString("id");
                                        if(C1.insert_into("relation_prise_en_charge",prise_en_charge_key,prise_en_charge_value)){
                                            String[] ticket_off_key=new String[1];
                                            String[] ticket_off_value=new String[1];
                                            ticket_off_key[0]="statut";
                                            ticket_off_value[0]="0";
                                            if(C1.edit_from_id("ticket", ticket_off_key, ticket_off_value, Integer.parseInt(Interface_docteur.current_patient.numero_ticket))){
                                                return true;
                                            }
                                            else{
                                                return false;
                                            }
                                        }
                                        else{
                                            return false;
                                        }
                                    }
                                    else{
                                        return false;
                                    }
                                }
                                else{
                                    return false;
                                } 
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            return false;
                        }     
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }  
        }
        
        else{
            return false;
        }
        
    }
    
    void initialiser_interface(){
        action_name.setText(Interface_docteur.action);
        facture_nom.setText(Interface_docteur.current_patient.nom);
        facture_prenom.setText(Interface_docteur.current_patient.prenom);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel action_name;
    private javax.swing.JButton facture_btn;
    private javax.swing.JTextArea facture_detail;
    private javax.swing.JLabel facture_nom;
    private javax.swing.JLabel facture_prenom;
    private javax.swing.JTextField facture_prix;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
