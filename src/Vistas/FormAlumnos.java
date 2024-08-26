
package Vistas;

import Modelos.Alumno;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class FormAlumnos extends javax.swing.JInternalFrame {
    HashSet<Alumno> listaAlumno;
    
    public FormAlumnos(HashSet listaAlumno) {
        initComponents();
        this.listaAlumno = listaAlumno;
        this.setTitle("Alumnos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfLegajo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Alta de Alumnos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("LEGAJO:");

        jtfLegajo.setEnabled(false);
        jtfLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfLegajoFocusLost(evt);
            }
        });
        jtfLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLegajoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("APELLIDO:");

        jtfApellido.setEnabled(false);
        jtfApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfApellidoFocusLost(evt);
            }
        });
        jtfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("NOMBRE:");

        jtfNombre.setEnabled(false);
        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNombreFocusLost(evt);
            }
        });

        jbGuardar.setForeground(new java.awt.Color(0, 153, 204));
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setForeground(new java.awt.Color(0, 153, 204));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setForeground(new java.awt.Color(0, 153, 204));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellido)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidoActionPerformed
        
    }//GEN-LAST:event_jtfApellidoActionPerformed

    private void jtfLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLegajoActionPerformed
        
    }//GEN-LAST:event_jtfLegajoActionPerformed

    private void jtfLegajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfLegajoFocusLost
        try {
            Integer legajo = Integer.parseInt(jtfLegajo.getText());
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Sólo numeros");
            jtfLegajo.requestFocus();
        }
    }//GEN-LAST:event_jtfLegajoFocusLost

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        activarAlumno();
        limpiarAlumno();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Integer legajo = Integer.parseInt(jtfLegajo.getText());
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        Alumno a = new Alumno(legajo, apellido, nombre);
        listaAlumno.add(a);
        limpiarAlumno();
        desactivarAlumno();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtfApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfApellidoFocusLost

    }//GEN-LAST:event_jtfApellidoFocusLost

    private void jtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusLost

    }//GEN-LAST:event_jtfNombreFocusLost

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
    private void desactivarAlumno() {
        jtfLegajo.setEnabled(false);
        jtfApellido.setEnabled(false);
        jtfNombre.setEnabled(false);
        jbGuardar.setEnabled(false);
    }
    
    private void activarAlumno() {
        jtfLegajo.setEnabled(true);
        jtfApellido.setEnabled(true);
        jtfNombre.setEnabled(true);
        jbGuardar.setEnabled(true);
    }
    
    private void limpiarAlumno() {
        jtfLegajo.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
