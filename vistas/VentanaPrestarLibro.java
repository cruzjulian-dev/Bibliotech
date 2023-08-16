
package vistas;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import controlador.*;
import javax.swing.ButtonGroup;

public class VentanaPrestarLibro extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrestarLibro
     */
    public VentanaPrestarLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JComboBox<String> getLibroComboBox() {
        return libroComboBox;
    }

    public JRadioButton getDocenteBoton() {
        return docenteBoton;
    }

    public JComboBox<String> getDocenteComboBox() {
        return docenteComboBox;
    }

    public JRadioButton getEstudianteBoton() {
        return estudianteBoton;
    }

    public JComboBox<String> getEstudianteComboBox() {
        return estudianteComboBox;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return estudiantesDocentesLabel;
    }

    public JLabel getjLabel4() {
        return seleccioneLabel;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public JButton getQuitarBoton() {
        return prestarBoton;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }

    public JButton getVolverBoton() {
        return volverBoton;
    }

    public JLabel getFechaEditLabel() {
        return fechaEditLabel;
    }

    public ButtonGroup getBotonesSocio() {
        return botonesSocio;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesSocio = new javax.swing.ButtonGroup();
        tituloLabel = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        seleccioneLabel = new javax.swing.JLabel();
        libroComboBox = new javax.swing.JComboBox<>();
        panel2 = new javax.swing.JPanel();
        estudiantesDocentesLabel = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        estudianteComboBox = new javax.swing.JComboBox<>();
        docenteComboBox = new javax.swing.JComboBox<>();
        estudianteBoton = new javax.swing.JRadioButton();
        docenteBoton = new javax.swing.JRadioButton();
        volverBoton = new javax.swing.JButton();
        prestarBoton = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        fechaTxtLabel = new javax.swing.JLabel();
        fechaEditLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLabel.setText("Prestar Libro");

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        seleccioneLabel.setText("Seleccione el libro:");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccioneLabel)
                    .addComponent(libroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seleccioneLabel)
                .addGap(18, 18, 18)
                .addComponent(libroComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        estudiantesDocentesLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estudiantesDocentesLabel.setText("    Estudiantes                                     Docentes");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(estudiantesDocentesLabel)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(estudiantesDocentesLabel)
                .addGap(14, 14, 14))
        );

        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        estudianteComboBox.setFocusable(false);
        estudianteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteComboBoxActionPerformed(evt);
            }
        });

        docenteComboBox.setFocusable(false);
        docenteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteComboBoxActionPerformed(evt);
            }
        });

        estudianteBoton.setText("Seleccionar");
        estudianteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudianteBotonActionPerformed(evt);
            }
        });

        docenteBoton.setText("Seleccionar");
        docenteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estudianteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estudianteBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docenteBoton)
                    .addComponent(docenteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estudianteBoton)
                    .addComponent(docenteBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estudianteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docenteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        volverBoton.setText("Volver");
        volverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBotonActionPerformed(evt);
            }
        });
        volverBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                volverBotonKeyPressed(evt);
            }
        });

        prestarBoton.setText("Prestar");
        prestarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarBotonActionPerformed(evt);
            }
        });
        prestarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prestarBotonKeyPressed(evt);
            }
        });

        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        fechaTxtLabel.setText("Fecha de retiro:");

        fechaEditLabel.setText(" ");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechaTxtLabel)
                .addGap(18, 18, 18)
                .addComponent(fechaEditLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaTxtLabel)
                    .addComponent(fechaEditLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(volverBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prestarBoton)
                .addGap(42, 42, 42))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(tituloLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prestarBoton)
                    .addComponent(volverBoton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estudianteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteComboBoxActionPerformed
        //
    }//GEN-LAST:event_estudianteComboBoxActionPerformed

    private void docenteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteComboBoxActionPerformed
        //
    }//GEN-LAST:event_docenteComboBoxActionPerformed

    private void estudianteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudianteBotonActionPerformed
        PrestarLibroController.clickEstudianteBoton();
    }//GEN-LAST:event_estudianteBotonActionPerformed

    private void docenteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteBotonActionPerformed
        PrestarLibroController.clickDocenteBoton();
    }//GEN-LAST:event_docenteBotonActionPerformed

    private void volverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBotonActionPerformed
        PrestarLibroController.botonVolver();
    }//GEN-LAST:event_volverBotonActionPerformed

    private void volverBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_volverBotonKeyPressed
        //PrestarLibroController.botonVolverEnter(evt);
    }//GEN-LAST:event_volverBotonKeyPressed

    private void prestarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarBotonActionPerformed
        PrestarLibroController.botonPrestar();
    }//GEN-LAST:event_prestarBotonActionPerformed

    private void prestarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prestarBotonKeyPressed
        //PrestarLibroController.botonPrestarEnter(evt);
    }//GEN-LAST:event_prestarBotonKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrestarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrestarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesSocio;
    private javax.swing.JRadioButton docenteBoton;
    private javax.swing.JComboBox<String> docenteComboBox;
    private javax.swing.JRadioButton estudianteBoton;
    private javax.swing.JComboBox<String> estudianteComboBox;
    private javax.swing.JLabel estudiantesDocentesLabel;
    private javax.swing.JLabel fechaEditLabel;
    private javax.swing.JLabel fechaTxtLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> libroComboBox;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JButton prestarBoton;
    private javax.swing.JLabel seleccioneLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton volverBoton;
    // End of variables declaration//GEN-END:variables
}
