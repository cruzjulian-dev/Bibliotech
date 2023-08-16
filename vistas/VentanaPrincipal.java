
package vistas;

import controlador.*;
import static java.awt.event.KeyEvent.VK_ENTER; // detectar pulsacion tecla ENTER
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.GestionBiblioteca;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JButton getDocenteBoton() {
        return agregarDoceBoton;
    }

    public void setDocenteBoton(JButton docenteBoton) {
        this.agregarDoceBoton = docenteBoton;
    }

    public JLabel getEstuNumLabel() {
        return estuNumLabel;
    }

    public void setEstuNumLabel(JLabel estuNumLabel) {
        this.estuNumLabel = estuNumLabel;
    }

    public JLabel getLibrosNumLabel() {
        return librosNumLabel;
    }

    public void setLibrosNumLabel(JLabel librosNumLabel) {
        this.librosNumLabel = librosNumLabel;
    }

    public JLabel getPrestaNumLabel() {
        return prestaNumLabel;
    }

    public void setPrestaNumLabel(JLabel prestaNumLabel) {
        this.prestaNumLabel = prestaNumLabel;
    }

    public JLabel getSocioNumLabel() {
        return doceNumLabel;
    }

    public void setSocioNumLabel(JLabel socioNumLabel) {
        this.doceNumLabel = socioNumLabel;
    }

    public JLabel getNombreEditLabel() {
        return nombreEditLabel;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informacionPanel = new javax.swing.JPanel();
        cantLibrosLabel = new javax.swing.JLabel();
        cantEstuLabel = new javax.swing.JLabel();
        cantDoceLabel = new javax.swing.JLabel();
        cantPrestaVenLabel = new javax.swing.JLabel();
        librosNumLabel = new javax.swing.JLabel();
        estuNumLabel = new javax.swing.JLabel();
        doceNumLabel = new javax.swing.JLabel();
        prestaNumLabel = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        nombreTxtLabel = new javax.swing.JLabel();
        actualizarBoton = new javax.swing.JButton();
        tituloPanel = new javax.swing.JLabel();
        nombreEditLabel = new javax.swing.JLabel();
        primerCuadrantePanel = new javax.swing.JPanel();
        nombreBoton = new javax.swing.JButton();
        agregarDoceBoton = new javax.swing.JButton();
        libroBoton = new javax.swing.JButton();
        buscarSocioBoton = new javax.swing.JButton();
        listaSociosBoton = new javax.swing.JButton();
        listaLibrosBoton = new javax.swing.JButton();
        agregarEstuBoton = new javax.swing.JButton();
        segundoCuadrantePanel = new javax.swing.JPanel();
        quitarLibroBoton = new javax.swing.JButton();
        devolverLibroBoton = new javax.swing.JButton();
        diasPrestamoBoton = new javax.swing.JButton();
        tieneLibroBoton = new javax.swing.JButton();
        docentesRespoBoton = new javax.swing.JButton();
        prestarLibroBoton = new javax.swing.JButton();
        quitarSocio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        informacionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));

        cantLibrosLabel.setText("Cantidad de Libros:");

        cantEstuLabel.setText("Cantidad de Estudiantes:");

        cantDoceLabel.setText("Cantidad de Docentes:");

        cantPrestaVenLabel.setText("Cantidad de Prestamos vencidos:");

        librosNumLabel.setText("--------");

        estuNumLabel.setText("--------");

        doceNumLabel.setText("--------");

        prestaNumLabel.setText("--------");

        javax.swing.GroupLayout informacionPanelLayout = new javax.swing.GroupLayout(informacionPanel);
        informacionPanel.setLayout(informacionPanelLayout);
        informacionPanelLayout.setHorizontalGroup(
            informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantLibrosLabel)
                    .addComponent(cantEstuLabel)
                    .addComponent(cantDoceLabel)
                    .addComponent(cantPrestaVenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doceNumLabel)
                    .addComponent(prestaNumLabel)
                    .addComponent(estuNumLabel)
                    .addComponent(librosNumLabel))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        informacionPanelLayout.setVerticalGroup(
            informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantLibrosLabel)
                    .addComponent(librosNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantEstuLabel)
                    .addComponent(estuNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantDoceLabel)
                    .addComponent(doceNumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(informacionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantPrestaVenLabel)
                    .addComponent(prestaNumLabel))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloLabel.setText("Biblioteca Digital");

        nombreTxtLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreTxtLabel.setText("Nombre:");

        actualizarBoton.setText("Actualizar datos");
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });

        tituloPanel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloPanel.setForeground(new java.awt.Color(102, 0, 102));
        tituloPanel.setText("Panel de informacion");

        nombreEditLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreEditLabel.setForeground(new java.awt.Color(102, 0, 102));
        nombreEditLabel.setText("\"");

        nombreBoton.setText("Cambiar Nombre");
        nombreBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBotonActionPerformed(evt);
            }
        });
        nombreBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreBotonKeyPressed(evt);
            }
        });

        agregarDoceBoton.setText("Agregar Docente");
        agregarDoceBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDoceBotonActionPerformed(evt);
            }
        });
        agregarDoceBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agregarDoceBotonKeyPressed(evt);
            }
        });

        libroBoton.setText("Agregar Libro");
        libroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libroBotonActionPerformed(evt);
            }
        });
        libroBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                libroBotonKeyPressed(evt);
            }
        });

        buscarSocioBoton.setText("Buscar Socio");
        buscarSocioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarSocioBotonActionPerformed(evt);
            }
        });

        listaSociosBoton.setText("Lista Socios");
        listaSociosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSociosBotonActionPerformed(evt);
            }
        });

        listaLibrosBoton.setText("Lista Libros");
        listaLibrosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaLibrosBotonActionPerformed(evt);
            }
        });

        agregarEstuBoton.setText("Agregar Estudiante");
        agregarEstuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEstuBotonActionPerformed(evt);
            }
        });
        agregarEstuBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agregarEstuBotonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout primerCuadrantePanelLayout = new javax.swing.GroupLayout(primerCuadrantePanel);
        primerCuadrantePanel.setLayout(primerCuadrantePanelLayout);
        primerCuadrantePanelLayout.setHorizontalGroup(
            primerCuadrantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primerCuadrantePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primerCuadrantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarDoceBoton)
                    .addComponent(nombreBoton)
                    .addComponent(libroBoton)
                    .addComponent(buscarSocioBoton)
                    .addComponent(listaSociosBoton)
                    .addComponent(listaLibrosBoton)
                    .addComponent(agregarEstuBoton))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        primerCuadrantePanelLayout.setVerticalGroup(
            primerCuadrantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primerCuadrantePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreBoton)
                .addGap(18, 18, 18)
                .addComponent(agregarEstuBoton)
                .addGap(18, 18, 18)
                .addComponent(agregarDoceBoton)
                .addGap(18, 18, 18)
                .addComponent(libroBoton)
                .addGap(18, 18, 18)
                .addComponent(buscarSocioBoton)
                .addGap(18, 18, 18)
                .addComponent(listaSociosBoton)
                .addGap(18, 18, 18)
                .addComponent(listaLibrosBoton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        quitarLibroBoton.setText("Quitar Libro");
        quitarLibroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarLibroBotonActionPerformed(evt);
            }
        });

        devolverLibroBoton.setText("Devolver Libro");
        devolverLibroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverLibroBotonActionPerformed(evt);
            }
        });

        diasPrestamoBoton.setText("Dias de Prestamo");
        diasPrestamoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasPrestamoBotonActionPerformed(evt);
            }
        });

        tieneLibroBoton.setText("¿Quien tiene el Libro?");
        tieneLibroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tieneLibroBotonActionPerformed(evt);
            }
        });

        docentesRespoBoton.setText("Lista Docentes Responsables");
        docentesRespoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docentesRespoBotonActionPerformed(evt);
            }
        });

        prestarLibroBoton.setText("Prestar Libro");
        prestarLibroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarLibroBotonActionPerformed(evt);
            }
        });

        quitarSocio.setText("Quitar Socio");
        quitarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarSocioActionPerformed(evt);
            }
        });
        quitarSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quitarSocioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout segundoCuadrantePanelLayout = new javax.swing.GroupLayout(segundoCuadrantePanel);
        segundoCuadrantePanel.setLayout(segundoCuadrantePanelLayout);
        segundoCuadrantePanelLayout.setHorizontalGroup(
            segundoCuadrantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segundoCuadrantePanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(segundoCuadrantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quitarSocio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(devolverLibroBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(diasPrestamoBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(docentesRespoBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prestarLibroBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quitarLibroBoton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tieneLibroBoton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        segundoCuadrantePanelLayout.setVerticalGroup(
            segundoCuadrantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segundoCuadrantePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prestarLibroBoton)
                .addGap(18, 18, 18)
                .addComponent(quitarSocio)
                .addGap(18, 18, 18)
                .addComponent(quitarLibroBoton)
                .addGap(18, 18, 18)
                .addComponent(devolverLibroBoton)
                .addGap(18, 18, 18)
                .addComponent(diasPrestamoBoton)
                .addGap(18, 18, 18)
                .addComponent(tieneLibroBoton)
                .addGap(18, 18, 18)
                .addComponent(docentesRespoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(nombreTxtLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreEditLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(primerCuadrantePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segundoCuadrantePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informacionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(tituloPanel)))
                .addGap(0, 301, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(actualizarBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(tituloLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreTxtLabel)
                            .addComponent(nombreEditLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primerCuadrantePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(segundoCuadrantePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tituloPanel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(informacionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizarBoton)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarEstuBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEstuBotonActionPerformed
        EstudianteController.limpiarFields();
        EstudianteController.mostrar();
    }//GEN-LAST:event_agregarEstuBotonActionPerformed

    private void agregarDoceBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDoceBotonActionPerformed
        DocenteController.limpiarFields();
        DocenteController.mostrar();
    }//GEN-LAST:event_agregarDoceBotonActionPerformed

    private void agregarEstuBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarEstuBotonKeyPressed
        EstudianteController.limpiarFields();
        EstudianteController.mostrar();
    }//GEN-LAST:event_agregarEstuBotonKeyPressed

    private void agregarDoceBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agregarDoceBotonKeyPressed
        DocenteController.limpiarFields();
        DocenteController.mostrar();
    }//GEN-LAST:event_agregarDoceBotonKeyPressed

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        GestionBibliotecaController.botonActualizar();
    }//GEN-LAST:event_actualizarBotonActionPerformed

    private void quitarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarSocioActionPerformed
        QuitarSocioController.botonAcceso();
    }//GEN-LAST:event_quitarSocioActionPerformed

    private void quitarSocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quitarSocioKeyPressed
        QuitarSocioController.botonAccesoEnter(evt);
    }//GEN-LAST:event_quitarSocioKeyPressed

    private void libroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libroBotonActionPerformed
        LibroController.botonLibro();
    }//GEN-LAST:event_libroBotonActionPerformed

    private void libroBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_libroBotonKeyPressed
        LibroController.botonLibroEnter(evt);
    }//GEN-LAST:event_libroBotonKeyPressed

    private void nombreBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBotonActionPerformed
        GestionBibliotecaController.cambiarNombreBoton(); 
    }//GEN-LAST:event_nombreBotonActionPerformed
    
    private void nombreBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreBotonKeyPressed
        if(evt.getExtendedKeyCode()==VK_ENTER){
            GestionBibliotecaController.cambiarNombreBoton();
        }
    }//GEN-LAST:event_nombreBotonKeyPressed

    private void buscarSocioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarSocioBotonActionPerformed
        BuscarSocioController.botonAcceso();
    }//GEN-LAST:event_buscarSocioBotonActionPerformed

    private void listaSociosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSociosBotonActionPerformed
        ListaSociosController.botonAcceso();
    }//GEN-LAST:event_listaSociosBotonActionPerformed

    private void listaLibrosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaLibrosBotonActionPerformed
        ListaLibrosController.botonAcceso();
    }//GEN-LAST:event_listaLibrosBotonActionPerformed

    private void docentesRespoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docentesRespoBotonActionPerformed
        DocentesResponsablesController.botonAcceso();
    }//GEN-LAST:event_docentesRespoBotonActionPerformed

    private void quitarLibroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarLibroBotonActionPerformed
        QuitarLibroController.botonAcceso();
    }//GEN-LAST:event_quitarLibroBotonActionPerformed

    private void tieneLibroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tieneLibroBotonActionPerformed
        QuienTieneController.botonAcceso();
    }//GEN-LAST:event_tieneLibroBotonActionPerformed

    private void prestarLibroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarLibroBotonActionPerformed
        PrestarLibroController.botonAcceso();
    }//GEN-LAST:event_prestarLibroBotonActionPerformed

    private void diasPrestamoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diasPrestamoBotonActionPerformed
        DiasPrestamoController.botonAcceso();
    }//GEN-LAST:event_diasPrestamoBotonActionPerformed

    private void devolverLibroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverLibroBotonActionPerformed
        DevolverLibroController.botonAcceso();
    }//GEN-LAST:event_devolverLibroBotonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JButton agregarDoceBoton;
    private javax.swing.JButton agregarEstuBoton;
    private javax.swing.JButton buscarSocioBoton;
    private javax.swing.JLabel cantDoceLabel;
    private javax.swing.JLabel cantEstuLabel;
    private javax.swing.JLabel cantLibrosLabel;
    private javax.swing.JLabel cantPrestaVenLabel;
    private javax.swing.JButton devolverLibroBoton;
    private javax.swing.JButton diasPrestamoBoton;
    private javax.swing.JLabel doceNumLabel;
    private javax.swing.JButton docentesRespoBoton;
    private javax.swing.JLabel estuNumLabel;
    private javax.swing.JPanel informacionPanel;
    private javax.swing.JButton libroBoton;
    private javax.swing.JLabel librosNumLabel;
    private javax.swing.JButton listaLibrosBoton;
    private javax.swing.JButton listaSociosBoton;
    private javax.swing.JButton nombreBoton;
    private javax.swing.JLabel nombreEditLabel;
    private javax.swing.JLabel nombreTxtLabel;
    private javax.swing.JLabel prestaNumLabel;
    private javax.swing.JButton prestarLibroBoton;
    private javax.swing.JPanel primerCuadrantePanel;
    private javax.swing.JButton quitarLibroBoton;
    private javax.swing.JButton quitarSocio;
    private javax.swing.JPanel segundoCuadrantePanel;
    private javax.swing.JButton tieneLibroBoton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel tituloPanel;
    // End of variables declaration//GEN-END:variables
}
