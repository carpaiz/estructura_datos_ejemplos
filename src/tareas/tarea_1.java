/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;


import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseg
 */
public class tarea_1 extends javax.swing.JFrame {
int tam=1000000;
    /**
     * Creates new form Inicio
     */
    public tarea_1() {
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

        btn_generar_hs = new javax.swing.JButton();
        btn_ordenar = new javax.swing.JButton();
        lbl_resultado_arr = new javax.swing.JLabel();
        lbl_resultado_arrl = new javax.swing.JLabel();
        lbl_resultado_hs = new javax.swing.JLabel();
        btn_generar_array = new javax.swing.JButton();
        btn_generar_al = new javax.swing.JButton();
        lbl_resultado_lkls = new javax.swing.JLabel();
        btn_generar_lklst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_generar_hs.setText("GENERAR NUMEROS CON HASH SET");
        btn_generar_hs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_hsActionPerformed(evt);
            }
        });

        btn_ordenar.setText("ORDENAR NUMEROS CON ESTRUCTURAS DE DATOS");
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        lbl_resultado_arr.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_resultado_arr.setText("Array");

        lbl_resultado_arrl.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_resultado_arrl.setText("Array List");

        lbl_resultado_hs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_resultado_hs.setText("Hash Set");

        btn_generar_array.setText("GENERAR NUMEROS ARRAY");
        btn_generar_array.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_arrayActionPerformed(evt);
            }
        });

        btn_generar_al.setText("GENERAR NUMEROS CON ARRAY LIST");
        btn_generar_al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_alActionPerformed(evt);
            }
        });

        lbl_resultado_lkls.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lbl_resultado_lkls.setText("Array List");

        btn_generar_lklst.setText("GENERAR NUMEROS CON LINKEND LIST");
        btn_generar_lklst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_lklstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_ordenar)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_generar_array, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_generar_hs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_generar_al, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_resultado_arr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_resultado_arrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_resultado_hs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_resultado_lkls, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_generar_lklst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_generar_array)
                .addGap(1, 1, 1)
                .addComponent(btn_generar_al)
                .addGap(1, 1, 1)
                .addComponent(btn_generar_lklst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_generar_hs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_resultado_arr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_resultado_arrl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_resultado_lkls)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_resultado_hs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btn_ordenar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generar_hsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_hsActionPerformed
        try {
            // TODO add your handling code here:
          long inicio = System.currentTimeMillis();
            lbl_resultado_hs.setText("");
           String resultado =  Archivo.Generar();
           long fin = System.currentTimeMillis();
           long tiempo = fin - inicio;
           lbl_resultado_hs.setText(resultado + " " + tiempo);
           
           
        } catch (IOException ex) {
            Logger.getLogger(tarea_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_generar_hsActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
        try {
            // TODO add your handling code here:
            String resultado = Archivo.Ordenar();
            lbl_resultado_arr.setText(resultado);
        } catch (IOException ex) {
            Logger.getLogger(tarea_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ordenarActionPerformed

    private void btn_generar_arrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_arrayActionPerformed
        /*try {
            // TODO add your handling code here:
            long inicio = System.currentTimeMillis();
            lbl_resultado_arr.setText("");
           String resultado =  Archivo.Generar_2();
           long fin = System.currentTimeMillis();
           long tiempo = fin - inicio;
           lbl_resultado_arr.setText(resultado + ", Tiempo" + tiempo);
           
           
        } catch (IOException ex) {
            Logger.getLogger(tarea_1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
                long inicio = System.currentTimeMillis();
        lbl_resultado_arr.setText("");
        
        int[] numeros = Archivo.generarNumerosAleatorios3(tam, -tam, tam,tam);
        long fin = System.currentTimeMillis();
        Archivo.guardarNumerosEnArchivo3(numeros, "numeros_arr.txt");
        long tiempo = fin - inicio;
        lbl_resultado_arr.setText("Numeros generados correctamente... Array" + ", Tiempo:" + tiempo);

    }//GEN-LAST:event_btn_generar_arrayActionPerformed

    private void btn_generar_alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_alActionPerformed
        // TODO add your handling code here:
                /*try {
           long inicio = System.currentTimeMillis();
            lbl_resultado_arrl.setText("");
           String resultado =  Archivo.Generar_3();
           long fin = System.currentTimeMillis();
           long tiempo = fin - inicio;
           lbl_resultado_arrl.setText(resultado + ", Tiempo:" + tiempo);
           
           
        } catch (IOException ex) {
            Logger.getLogger(tarea_1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
                long inicio = System.currentTimeMillis();
        lbl_resultado_arrl.setText("");
        
        ArrayList<Integer> numeros = Archivo.generarNumerosAleatorios2(tam, -tam, tam);
        long fin = System.currentTimeMillis();
        Archivo.guardarNumerosEnArchivo2(numeros, "numeros_arrl.txt");
        long tiempo = fin - inicio;
        lbl_resultado_arrl.setText("Numeros generados correctamente... ArrayList" + ", Tiempo:" + tiempo);

    }//GEN-LAST:event_btn_generar_alActionPerformed

    private void btn_generar_lklstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_lklstActionPerformed
        // TODO add your handling code here
        long inicio = System.currentTimeMillis();
        lbl_resultado_lkls.setText("");
        
        LinkedList<Integer> numeros = Archivo.generarNumerosAleatorios(tam, -tam, tam);
        long fin = System.currentTimeMillis();
        Archivo.guardarNumerosEnArchivo(numeros, "numeros_lklst.txt");
        long tiempo = fin - inicio;
        lbl_resultado_lkls.setText("Numeros generados correctamente... linkedlist" + ", Tiempo:" + tiempo);

    }//GEN-LAST:event_btn_generar_lklstActionPerformed

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
            java.util.logging.Logger.getLogger(tarea_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarea_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarea_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarea_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tarea_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar_al;
    private javax.swing.JButton btn_generar_array;
    private javax.swing.JButton btn_generar_hs;
    private javax.swing.JButton btn_generar_lklst;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JLabel lbl_resultado_arr;
    private javax.swing.JLabel lbl_resultado_arrl;
    private javax.swing.JLabel lbl_resultado_hs;
    private javax.swing.JLabel lbl_resultado_lkls;
    // End of variables declaration//GEN-END:variables
}
