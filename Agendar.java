
package Grooming_consultas;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Agendar extends javax.swing.JFrame {

    
    public static  int id, seleccion;
    public static String dia, hora; 
    public Agendar() {
        initComponents();
         this.setLocationRelativeTo(null);
         // como al menos una de las opciones de los grupo de radio buton
         // deben estar elegidas, voy a elegir dos por default
         
         rb_lunes.setSelected(true);
         rb_8.setSelected(true);
         
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        rb_9 = new javax.swing.JRadioButton();
        rb_10 = new javax.swing.JRadioButton();
        rb_16 = new javax.swing.JRadioButton();
        rb_8 = new javax.swing.JRadioButton();
        rb_11 = new javax.swing.JRadioButton();
        rb_12 = new javax.swing.JRadioButton();
        rb_13 = new javax.swing.JRadioButton();
        rb_14 = new javax.swing.JRadioButton();
        rb_15 = new javax.swing.JRadioButton();
        bt_agendar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_bañalo = new javax.swing.JButton();
        bt_revisalo = new javax.swing.JButton();
        rb_lunes = new javax.swing.JRadioButton();
        rb_martes = new javax.swing.JRadioButton();
        rb_miercoles = new javax.swing.JRadioButton();
        rb_jueves = new javax.swing.JRadioButton();
        rb_viernes = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rb_9);
        rb_9.setText("09");

        buttonGroup1.add(rb_10);
        rb_10.setText("10");

        buttonGroup1.add(rb_16);
        rb_16.setText("16");

        buttonGroup1.add(rb_8);
        rb_8.setText("08");

        buttonGroup1.add(rb_11);
        rb_11.setText("11");

        buttonGroup1.add(rb_12);
        rb_12.setText("12");

        buttonGroup1.add(rb_13);
        rb_13.setText("13");

        buttonGroup1.add(rb_14);
        rb_14.setText("14");
        rb_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_14ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_15);
        rb_15.setText("15");

        bt_agendar.setText("AGENDAR");
        bt_agendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agendarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MS PMincho", 1, 14)); // NOI18N
        jLabel2.setText("HORARIOS ");

        bt_bañalo.setText("¡Bañalo!");
        bt_bañalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bañaloActionPerformed(evt);
            }
        });

        bt_revisalo.setText("¡Revisalo!");
        bt_revisalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_revisaloActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_lunes);
        rb_lunes.setText("LUNES");

        buttonGroup2.add(rb_martes);
        rb_martes.setText("MARTES");

        buttonGroup2.add(rb_miercoles);
        rb_miercoles.setText("MIÉRCOLES");

        buttonGroup2.add(rb_jueves);
        rb_jueves.setText("JUEVES");

        buttonGroup2.add(rb_viernes);
        rb_viernes.setText("VIERNES");

        jLabel3.setFont(new java.awt.Font("MS PMincho", 1, 14)); // NOI18N
        jLabel3.setText("DÍA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grooming_consultas/blueeye.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(bt_bañalo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_revisalo)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rb_miercoles)
                                        .addComponent(rb_martes)
                                        .addComponent(rb_jueves)
                                        .addComponent(rb_lunes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_viernes)
                                        .addGap(22, 22, 22)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rb_9)
                                    .addComponent(rb_8)
                                    .addComponent(rb_10)
                                    .addComponent(rb_11)
                                    .addComponent(rb_12)
                                    .addComponent(rb_13)
                                    .addComponent(rb_14)
                                    .addComponent(rb_15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(78, 78, 78))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_agendar)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_bañalo)
                    .addComponent(bt_revisalo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_agendar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(rb_lunes)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rb_11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(rb_martes)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rb_12)
                                    .addComponent(rb_miercoles))
                                .addComponent(rb_13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rb_14)
                                    .addComponent(rb_jueves))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_15)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_16)
                            .addComponent(rb_viernes))
                        .addGap(71, 71, 71))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_14ActionPerformed

    private void bt_bañaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bañaloActionPerformed

        //le cambie a agendar.seleccion según para hacerlo global 
        Agendar.seleccion=1;
        bt_bañalo.setBackground(Color.blue);
        bt_revisalo.setBackground(Color.white);
        
    }//GEN-LAST:event_bt_bañaloActionPerformed

    private void bt_revisaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_revisaloActionPerformed
        Agendar.seleccion=2;
        bt_bañalo.setBackground(Color.white);
        bt_revisalo.setBackground(Color.blue);
    }//GEN-LAST:event_bt_revisaloActionPerformed

    private void bt_agendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agendarActionPerformed
        
       // aqui tengo que darle valores a las variables dia y hora 
       
       if(rb_lunes.isSelected()){
           Agendar.dia=" Lunes";
       }
       
       if(rb_martes.isSelected()){
           Agendar.dia=" Martes";
       }
       
       if(rb_miercoles.isSelected()){
           Agendar.dia=" Miercoles";
       }
       
       if(rb_jueves.isSelected()){
           Agendar.dia=" Jueves";
       }
       
       if(rb_viernes.isSelected()){
           Agendar.dia=" Viernes";
       }
       
       //hora
       if(rb_8.isSelected()){
           Agendar.hora=" 8 am ";
                     
       }
       
       if(rb_9.isSelected()){
           Agendar.hora=" 9 am ";
                    
       }
       
         if(rb_10.isSelected()){
           Agendar.hora=" 10 am ";
                     
       }
         
        if(rb_11.isSelected()){
           Agendar.hora=" 11 am ";
                     
       }
          
        if(rb_12.isSelected()){
           Agendar.hora=" 12 pm ";
                     
       }
            
        if(rb_13.isSelected()){
           Agendar.hora=" 1 pm ";
                     
       }
              
        if(rb_14.isSelected()){
           Agendar.hora=" 2 pm ";
                     
       }
        
        if(rb_15.isSelected()){
           Agendar.hora=" 3 pm ";
                     
       }
         
        if(rb_16.isSelected()){
           Agendar.hora=" 4 pm ";
                     
       }
         
        
        
        /*
        de aquí la ventana que abrirá después dependerá si es una consulta
        o un grooming, seleccion solo puede ser 1 o 2 por lo que usaré
        un if/else
        
        */
        
        if(seleccion==1){
            Grooming ventana= new Grooming(); 
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(ventana.HIDE_ON_CLOSE);
            
        } else {
            Consulta ventana= new Consulta();
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(ventana.HIDE_ON_CLOSE);
            
        }
        
       
        
        
    }//GEN-LAST:event_bt_agendarActionPerformed

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
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agendar;
    private static javax.swing.JButton bt_bañalo;
    private javax.swing.JButton bt_revisalo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rb_10;
    private javax.swing.JRadioButton rb_11;
    private javax.swing.JRadioButton rb_12;
    private javax.swing.JRadioButton rb_13;
    private javax.swing.JRadioButton rb_14;
    private javax.swing.JRadioButton rb_15;
    private javax.swing.JRadioButton rb_16;
    private javax.swing.JRadioButton rb_8;
    private javax.swing.JRadioButton rb_9;
    private javax.swing.JRadioButton rb_jueves;
    private javax.swing.JRadioButton rb_lunes;
    private javax.swing.JRadioButton rb_martes;
    private javax.swing.JRadioButton rb_miercoles;
    private javax.swing.JRadioButton rb_viernes;
    // End of variables declaration//GEN-END:variables
}
