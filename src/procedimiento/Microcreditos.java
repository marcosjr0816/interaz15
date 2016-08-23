/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Sarmientos
 */
public class Microcreditos extends javax.swing.JFrame {

    /**
     * Creates new form Microcreditos
     */
    public Microcreditos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        txtPrestamo = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtEspeciales = new javax.swing.JTextField();
        txtOrdinarias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MICROCREDITOS A EMPRESARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setText("Total del prestamo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Total a pagar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("Cuotas especiales");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("Cuotas ordinarias");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        txtPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrestamoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 60, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 60, -1));
        getContentPane().add(txtEspeciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 60, -1));
        getContentPane().add(txtOrdinarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
      double prestamo, tpagar, cuotas, cespeciales, cordinarias;
      String pagar, especiales, ordinarias;
      
    if(txtPrestamo.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite la cantidad prestada","Error", JOptionPane.ERROR_MESSAGE);  
        txtPrestamo.requestFocusInWindow(); 
         txtPrestamo.selectAll();    

     }
     else{ 
    prestamo=Double.parseDouble(txtPrestamo.getText());
    
    if(prestamo==0) {
       JOptionPane.showMessageDialog(this, "No hubo préstamo","Aviso", JOptionPane.INFORMATION_MESSAGE);  
        txtPrestamo.requestFocusInWindow(); 
        txtPrestamo.selectAll();  
       }  
    tpagar=(prestamo+(prestamo*0.24));
    cuotas=(tpagar/2);
    cespeciales=(cuotas/4);
    cordinarias=(cuotas/20);
    
    pagar=String.valueOf(tpagar);
    txtTotal.setText (pagar);    
    
    especiales=String.valueOf(cespeciales);
    txtEspeciales.setText (especiales);  
    
    ordinarias=String.valueOf(cordinarias);
    txtOrdinarias.setText(ordinarias);      
       }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
     txtPrestamo.setText("");
     txtTotal.setText("");
     txtEspeciales.setText("");
     txtOrdinarias.setText("");
     txtPrestamo.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrestamoKeyTyped
        char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
    }//GEN-LAST:event_txtPrestamoKeyTyped

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
            java.util.logging.Logger.getLogger(Microcreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Microcreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Microcreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Microcreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Microcreditos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEspeciales;
    private javax.swing.JTextField txtOrdinarias;
    private javax.swing.JTextField txtPrestamo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
