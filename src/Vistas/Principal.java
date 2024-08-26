
package Vistas;

import Modelos.Alumno;
import Modelos.Materia;
import java.beans.PropertyVetoException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {
    HashSet<Alumno> listaAlumno;
    HashSet<Materia> listaMateria;
    
    public Principal() {
        initComponents();
        listaAlumno = new HashSet<>();
        listaMateria = new HashSet<>();
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setTitle("Colegio");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jbMaterias = new javax.swing.JButton();
        jbAlumno = new javax.swing.JButton();
        jbInscripcion = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpPrincipal.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jbMaterias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbMaterias.setForeground(new java.awt.Color(0, 153, 204));
        jbMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/materia.png"))); // NOI18N
        jbMaterias.setText("Materias");
        jbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMateriasActionPerformed(evt);
            }
        });

        jbAlumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbAlumno.setForeground(new java.awt.Color(0, 153, 204));
        jbAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/alumno.png"))); // NOI18N
        jbAlumno.setText("Alumnos");
        jbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlumnoActionPerformed(evt);
            }
        });

        jbInscripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbInscripcion.setForeground(new java.awt.Color(0, 153, 204));
        jbInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inscripcio.png"))); // NOI18N
        jbInscripcion.setText("Inscripcion");
        jbInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbMaterias)
                .addGap(49, 49, 49)
                .addComponent(jbAlumno)
                .addGap(40, 40, 40)
                .addComponent(jbInscripcion)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMaterias)
                    .addComponent(jbAlumno)
                    .addComponent(jbInscripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMateriasActionPerformed
        FormMaterias materias = new FormMaterias(listaMateria);
        jdpPrincipal.add(materias);
        materias.setVisible(true);
        try {
            materias.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbMateriasActionPerformed

    private void jbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlumnoActionPerformed
        FormAlumnos alumnos = new FormAlumnos(listaAlumno);
        jdpPrincipal.add(alumnos);
        alumnos.setVisible(true);
        try {
            alumnos.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAlumnoActionPerformed

    private void jbInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscripcionActionPerformed
        FormInscripcion inscripcion = new FormInscripcion(listaAlumno, listaMateria);
        jdpPrincipal.add(inscripcion);
        inscripcion.setVisible(true);
        try {
            inscripcion.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbInscripcionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlumno;
    private javax.swing.JButton jbInscripcion;
    private javax.swing.JButton jbMaterias;
    private javax.swing.JDesktopPane jdpPrincipal;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
}
