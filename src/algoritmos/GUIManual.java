/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author EZEA2
 */
public class GUIManual extends javax.swing.JFrame {

    /**
     * Creates new form GUIManual
     */
    int i;
    int n;
    int v[];
    
    public GUIManual(int _n) {
        FlatLightLaf.setup();
        initComponents();
        setLocationRelativeTo(null);
        
        n=_n;
        v=new int[n];
        
        txtN.setText(Integer.toString(n));
        txtIterador.setText(Integer.toString(i+1));
        
        Action actionTecho = new AbstractAction(){ //para detectar el enter
            @Override
            public void actionPerformed(ActionEvent e)
            {
                btnSiguienteActionPerformed(e);
            }
        };
        txtIngreso.addActionListener(actionTecho);
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
        txtIterador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese el valor #");

        txtIterador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtIterador.setText("1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("/");

        txtN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtN.setText("n");

        txtIngreso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIterador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIterador)
                    .addComponent(jLabel3)
                    .addComponent(txtN))
                .addGap(45, 45, 45)
                .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSiguiente)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        if(i!=n-1){
            try{
                v[i]=Integer.parseInt(txtIngreso.getText());
                i++;
                txtIngreso.setText(null);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ingrese un parametro valido");
                return;
            }
            
            txtIterador.setText(Integer.toString(i+1));
        }
        else {
            v[i]=Integer.parseInt(txtIngreso.getText());
            new GUIOrden(n,v).setVisible(true);
            dispose();
        }
        
       
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JLabel txtIterador;
    private javax.swing.JLabel txtN;
    // End of variables declaration//GEN-END:variables
}
