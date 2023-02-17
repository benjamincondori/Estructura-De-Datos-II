package Presentacion;

import Arboles.AVL;
import Arboles.ArbolBinario;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Vista extends javax.swing.JFrame {

    ArbolBinario<Integer, String> miArbol;
//    AVL<Integer, String> miArbol = new AVL();

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.inicializar(false);
        this.miArbol = new ArbolBinario<>();
//        this.miArbol = new AVL<>();
    }

    private void inicializar(boolean enable) {
        this.InOrden.setEnabled(enable);
        this.PostOrden.setEnabled(enable);
        this.PreOrden.setEnabled(enable);
        this.PorNiveles.setEnabled(enable);
        this.Todo.setEnabled(enable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        botonInsertar = new javax.swing.JButton();
        InOrden = new javax.swing.JButton();
        PreOrden = new javax.swing.JButton();
        PostOrden = new javax.swing.JButton();
        txtdato = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PorNiveles = new javax.swing.JButton();
        Todo = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        altura = new javax.swing.JButton();
        nivel = new javax.swing.JButton();
        size = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Panel de Pruebas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel2.setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(210, 90));

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setRows(5);
        impresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de operaciones"));
        impresion.setOpaque(false);
        impresion.setPreferredSize(new java.awt.Dimension(210, 90));
        jScrollPane1.setViewportView(impresion);

        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        InOrden.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        InOrden.setText("InOrden");
        InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrdenActionPerformed(evt);
            }
        });

        PreOrden.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PreOrden.setText("PreOrden");
        PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrdenActionPerformed(evt);
            }
        });

        PostOrden.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PostOrden.setText("PostOrden");
        PostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrdenActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("RECORRIDOS:");

        PorNiveles.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PorNiveles.setText("Por Niveles");
        PorNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorNivelesActionPerformed(evt);
            }
        });

        Todo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Todo.setText("TODO");
        Todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodoActionPerformed(evt);
            }
        });

        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(8, 8, 686, 309);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CALCULAR:");

        altura.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        altura.setText("ALTURA");
        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        nivel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        nivel.setText("NIVEL");
        nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelActionPerformed(evt);
            }
        });

        size.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        size.setText("SIZE");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtdato, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(PorNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resultado))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PreOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PostOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PorNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Todo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int clave = Integer.parseInt(txtdato.getText());
            String valor = "";
            this.miArbol.insertar(clave, valor);
//            JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
            this.inicializar(true);
            complementos();
            txtdato.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrdenActionPerformed
        List<Integer> recorrido;
        recorrido = this.miArbol.recorridoInOrden();
        this.impresion.setText("Recorrido InOrden: " + recorrido.toString());
    }//GEN-LAST:event_InOrdenActionPerformed

    private void PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrdenActionPerformed
        List<Integer> recorrido;
        recorrido = this.miArbol.recorridoPreOrden();
        this.impresion.setText("Recorrido PreOrden: " + recorrido.toString());
    }//GEN-LAST:event_PreOrdenActionPerformed

    private void PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrdenActionPerformed
        List<Integer> recorrido;
        recorrido = this.miArbol.recorridoPostOrden();
        this.impresion.setText("Recorrido PostOrden: " + recorrido.toString());
    }//GEN-LAST:event_PostOrdenActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            int clave = Integer.parseInt(txtdato.getText());
            this.miArbol.eliminar(clave);
            this.inicializar(true);
            complementos();
            txtdato.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el dato", "Intenta de nuevo...", 0);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void PorNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorNivelesActionPerformed
        List<Integer> recorrido;
        recorrido = this.miArbol.recorridoPorNiveles();
        this.impresion.setText("Recorrido Por Niveles: " + recorrido.toString());
    }//GEN-LAST:event_PorNivelesActionPerformed

    private void TodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodoActionPerformed
        String recorrido;
        recorrido = "Recorrido Por Niveles: " + this.miArbol.recorridoPorNiveles().toString();
        recorrido = recorrido + "\nRecorrido PreOrden:   " + this.miArbol.recorridoPreOrden().toString();
        recorrido = recorrido + "\nRecorrido InOrden:     " + this.miArbol.recorridoInOrden().toString();
        recorrido = recorrido + "\nRecorrido PostOrden:  " + this.miArbol.recorridoPostOrden().toString();
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_TodoActionPerformed

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        int altura = this.miArbol.altura();
        this.resultado.setText("La Altura es: " + altura);
    }//GEN-LAST:event_alturaActionPerformed

    private void nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelActionPerformed
        int nivel = this.miArbol.nivel();
        this.resultado.setText("El Nivel es: " + nivel);
    }//GEN-LAST:event_nivelActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        int size = this.miArbol.size();
        this.resultado.setText("El Size es: " + size);
    }//GEN-LAST:event_sizeActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            boolean siExiste = false;
            int dato = Integer.parseInt(txtdato.getText());
            siExiste = this.miArbol.existe(dato);
            if (siExiste) {
                this.impresion.setText("El dato a buscar: '" + dato + "'.\nSI se encuentra en el Árbol");
            } else {
                this.impresion.setText("El dato a buscar: '" + dato + "'.\nNO se encuentra en el Árbol");
            }
            txtdato.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo buscar el dato", "Intenta de nuevo...", 0);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void complementos() {
        this.repintarArbol();
    }

    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.miArbol.getDibujo(), BorderLayout.CENTER);
    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InOrden;
    private javax.swing.JButton PorNiveles;
    private javax.swing.JButton PostOrden;
    private javax.swing.JButton PreOrden;
    private javax.swing.JButton Todo;
    private javax.swing.JButton altura;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nivel;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton size;
    private javax.swing.JTextField txtdato;
    // End of variables declaration//GEN-END:variables
}
