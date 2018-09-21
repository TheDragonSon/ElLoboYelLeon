
package Grooming_consultas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class Perro extends javax.swing.JFrame {

    int id;
    String tamaño, especie;
    double totalba;
    public Perro() {
        initComponents();
         this.setLocationRelativeTo(null);
         rb_mediano.setSelected(true);
         rb_gato.setSelected(true);
         bt_otra.setVisible(false);
          //necesito que la información del perro se guarde en un documento 
          
            //en esta ventana se crea el id 
         
             File archivo= new File ("id.txt");
        try{
            BufferedReader lector= new BufferedReader (new FileReader (archivo));
            id= Integer.parseInt(lector.readLine());
            id++;
          
            
        
            
        } catch(Exception e){
            System.out.println(e.toString());
        }
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_chico = new javax.swing.JRadioButton();
        rb_mediano = new javax.swing.JRadioButton();
        rb_grande = new javax.swing.JRadioButton();
        rb_muygrande = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rb_gato = new javax.swing.JRadioButton();
        rb_perro = new javax.swing.JRadioButton();
        rb_caballo = new javax.swing.JRadioButton();
        rb_conejo = new javax.swing.JRadioButton();
        rb_otro = new javax.swing.JRadioButton();
        txt_especie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bt_terminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        bt_otra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("¡Cuéntanos más sobre tu mascota! ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("TAMAÑO");

        buttonGroup1.add(rb_chico);
        rb_chico.setText("Chico");

        buttonGroup1.add(rb_mediano);
        rb_mediano.setText("Mediano");

        buttonGroup1.add(rb_grande);
        rb_grande.setText("Grande");

        buttonGroup1.add(rb_muygrande);
        rb_muygrande.setText("Muy muy grande");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("ESPECIE");

        buttonGroup2.add(rb_gato);
        rb_gato.setText("Gato");

        buttonGroup2.add(rb_perro);
        rb_perro.setText("Perro");

        buttonGroup2.add(rb_caballo);
        rb_caballo.setText("Caballo");

        buttonGroup2.add(rb_conejo);
        rb_conejo.setText("Conejo");

        buttonGroup2.add(rb_otro);
        rb_otro.setText("Otro");

        jLabel4.setText("¿Cuál?");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("EDAD");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("NOMBRE");

        bt_terminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt_terminar.setForeground(new java.awt.Color(255, 0, 0));
        bt_terminar.setText("TERMINAR");
        bt_terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_terminarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("TU TELEFONO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "días", "meses", "años", " " }));

        bt_otra.setForeground(new java.awt.Color(255, 102, 0));
        bt_otra.setText("AGENDAR OTRA CITA O PAGAR");
        bt_otra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_otraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_otra, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(bt_terminar)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_grande)
                                    .addComponent(rb_muygrande))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb_otro)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rb_caballo)
                                            .addComponent(rb_conejo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_chico)
                                    .addComponent(rb_mediano)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2)))
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_perro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb_gato)
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nombre)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_chico)
                    .addComponent(rb_gato)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_mediano)
                            .addComponent(rb_perro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_grande)
                            .addComponent(rb_caballo)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_muygrande)
                    .addComponent(rb_conejo))
                .addGap(28, 28, 28)
                .addComponent(rb_otro)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txt_especie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_terminar)
                    .addComponent(bt_otra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_terminarActionPerformed
        
        bt_otra.setVisible(true);
// mi problema es que separé las ventanas de grooming y consulta y ahora debo meter todo en un solo archivo
        
        //hacer los radio buttons, tamaño:
        String tamaño = null; //con esto se me quitó el error de que no había sido inicializado tamaño, pero no edad? 
        if(rb_chico.isSelected()){
            tamaño=" chico";
        }
        if(rb_mediano.isSelected()){
            tamaño=" mediano";
        }
        if(rb_grande.isSelected()){
            tamaño=" grande";
        }
        if(rb_muygrande.isSelected()){
            tamaño=" muy grande";
        }
        
        //rb especie: 
        
       String especie=null; 
        if(rb_gato.isSelected()){
            especie="Gato";
            totalba=Grooming.money; 
        }
        if(rb_perro.isSelected()){
            especie="Perro";
            totalba=Grooming.money;
        }
        if(rb_caballo.isSelected()){
            especie="Caballo";
            totalba=Grooming.money*3;
        }
        if(rb_conejo.isSelected()){
            especie="Conejo";
            totalba=Grooming.money*0.5; 
            
        }
        if(rb_otro.isSelected()){
            especie=txt_especie.getText();
        }
        
        String edad;
        int age; 
        edad=txt_edad.getText();
        age= Integer.parseInt(edad); //quiero pasar edad de string a int
        
        String nombre;
        nombre=txt_nombre.getText();
        
        String telefono;
        telefono=txt_telefono.getText();
        
        // cómo me traigo la variable selección de agendar? o si vine de groomin vale 1 si viene de consulta vale 2 
        
        BufferedWriter writer = null;
        File logFile = new File("agenda.txt");
       switch(Agendar.seleccion){
           case 1: //bañarlo
               detalles baño= new lavadoyencerado(Grooming.tipo,tamaño, especie, age,telefono, Agendar.dia, Agendar.hora, nombre, id  );
               try{ 
                    writer = new BufferedWriter(new FileWriter(logFile, true));
                    String agendaATxt=id+ "|" +Agendar.seleccion+"|" +tamaño+ "|" +nombre+ "|" +especie
                            +"|" +age+ "|"+Agendar.dia+ "|" +Agendar.hora+ "|"+"|"+telefono+ "|" +totalba +System.getProperty("line.separator");
                    writer.write(agendaATxt);
                    writer.close();
                     JOptionPane.showMessageDialog(null, "Cita registrada", "Cita", JOptionPane.OK_OPTION,null);
                    // limpiar(); esto lo usamos para limpiar pero yo no hice ese metodo
                } catch (Exception e) {
                    System.out.println(e.toString());
                    
                }
               
                                           
               break;
            
           case 2: //consulta
               detalles consulta= new getwell(Consulta.paquete, tamaño, especie, age, telefono, Agendar.dia, Agendar.hora, nombre, id);
               try{ 
                    writer = new BufferedWriter(new FileWriter(logFile, true));
                    String agendaATxt=id+ "|" +Agendar.seleccion+"|" +tamaño+ "|" +nombre+ "|" +especie+"|" +age+ "|"+Agendar.dia+ "|" +Agendar.hora+ "|"+"|"+telefono + "|" +Consulta.paquete + "|" +Consulta.precio +System.getProperty("line.separator");
                    writer.write(agendaATxt);
                    writer.close();
                     JOptionPane.showMessageDialog(null, "Cita registrada", "Cita", JOptionPane.OK_OPTION,null);
                    // limpiar(); esto lo usamos para limpiar pero yo no hice ese metodo
                } catch (Exception e) {
                    System.out.println(e.toString());
                    
                }
               
               
               
               break; 
                default:
                JOptionPane.showMessageDialog(null, "No has seleccionado que quieres", "Selecciona una opcion", JOptionPane.OK_OPTION,null);
                break;
               
       } 
        
  
       try {
                
            BufferedWriter writer2=null; 
            File logFile2= new File("id.txt");
            writer2=new BufferedWriter(new FileWriter(logFile2));
            String idtxt=String.valueOf(id);
            writer2.write(idtxt);
            writer2.close();
            } catch(Exception e){
                System.out.println(e.toString());
            }
        
        
        
        
    }//GEN-LAST:event_bt_terminarActionPerformed

    private void bt_otraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_otraActionPerformed
      
        // esto es lo que pondría si aquí se creara el nuevo id 
        
        //voy a tratar de ponerlo en terminar a ver si si me agarra el id
     /*   File archivo = new File("id.txt");
        try{
           BufferedReader lector= new BufferedReader (new FileReader (archivo));
            id= Integer.parseInt(lector.readLine());
            id++;
        } catch(Exception e){
            System.out.println(e.toString());
        } */
       
        
         opciones_ventana ventana=new opciones_ventana();
          ventana.setVisible(true);
          ventana.setDefaultCloseOperation(ventana.HIDE_ON_CLOSE);  
     
     
       
          // aumentará el id? 
        
        
    }//GEN-LAST:event_bt_otraActionPerformed

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
            java.util.logging.Logger.getLogger(Perro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_otra;
    private javax.swing.JButton bt_terminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rb_caballo;
    private javax.swing.JRadioButton rb_chico;
    private javax.swing.JRadioButton rb_conejo;
    private javax.swing.JRadioButton rb_gato;
    private javax.swing.JRadioButton rb_grande;
    private javax.swing.JRadioButton rb_mediano;
    private javax.swing.JRadioButton rb_muygrande;
    private javax.swing.JRadioButton rb_otro;
    private javax.swing.JRadioButton rb_perro;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_especie;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
