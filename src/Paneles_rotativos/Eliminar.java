/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles_rotativos;
import clases.Auto;
import clases.Camioneta;
import clases.Vehiculo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import clases.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Eliminar extends javax.swing.JPanel {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        bus_nroc = new javax.swing.JLabel();
        nro_chasis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_camioneta = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        auto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_auto = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        bus_nroc.setText("Buscar");
        bus_nroc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bus_nroc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bus_nroc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bus_nrocMousePressed(evt);
            }
        });

        nro_chasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nro_chasisActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar camioneta por numero de chasis:");

        tab_camioneta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Chasis", "Nro Motor", "Color", "Marca", "Modelo", "Anio", "Cant puertas"
            }
        ));
        jScrollPane2.setViewportView(tab_camioneta);

        jButton4.setText("Eliminar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nro_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bus_nroc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addContainerGap(394, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nro_chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bus_nroc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("CAMIONETAS", jPanel1);

        jLabel2.setText("Buscar auto por numero de chasis:");

        tab_auto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Chasis", "Nro Motor", "Color", "Marca", "Modelo", "Anio", "Cant puertas"
            }
        ));
        jScrollPane1.setViewportView(tab_auto);

        jButton2.setText("Eliminar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(auto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jButton2))
                        .addGap(0, 459, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(auto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("AUTOS", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("CAMIONETAS");
    }// </editor-fold>//GEN-END:initComponents

    private void nro_chasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nro_chasisActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_nro_chasisActionPerformed

    private void bus_nrocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bus_nrocMousePressed
       
       //aca va todo loque hay que haccerrr de camioneta
       try{
           try{
            
            int n = Integer.parseInt(nro_chasis.getText());
            nro_chasis.setText(null);
            
            int c = 0;
            
            
            
            for(int x = 0;x< Vehiculo.vehiculo.size();x++){
                if( Vehiculo.vehiculo.get(x).getNro_chasis() == n && Vehiculo.vehiculo.get(x) instanceof Camioneta){
                    //aca elimino del archivo xD
                    Camioneta cb = (Camioneta)Vehiculo.vehiculo.get(x);
                    c++;
                    JFrame jFrame = new JFrame();
                    int result = JOptionPane.showConfirmDialog(jFrame, "Esta es la camioneta que desea eliminar:\nMarca: "+ cb.getMarca() + "\nModelo: "+ cb.getModelo()+"\nAnio: "+cb.getAnio()+"\nNro Chasis: "+cb.getNro_chasis()+"\nNro Motor: "+ cb.getNro_motor()+"\nTipo de Cabina: "+ cb.getTpo_cabina()+"\nColor: "+cb.getColor()+ "\nTraccion: "+ cb.getTraccion());

                    if (result == 0){
                        
                    
                    Vehiculo.vehiculo.remove(Vehiculo.vehiculo.get(x));
                    File camionetaas = new File("camionetas.txt");
                    PrintWriter camionetaasr = new PrintWriter(camionetaas);
                    camionetaasr.close();
                    
                    FileWriter camionetsr = new FileWriter(camionetaas, true);
                    BufferedWriter camionetsb = new BufferedWriter(camionetsr);

                    camionetsb.write("nro_chasis nro_motor color marca modelo anio traccion tpo_cabina");
                    
                    for(int j = 0;j< Vehiculo.vehiculo.size();j++){
                                    if(Vehiculo.vehiculo.get(j) instanceof Camioneta){
                                        Camioneta ca = (Camioneta) Vehiculo.vehiculo.get(j);
                                        camionetsb.write("\n");
                                        camionetsb.write(ca.getNro_chasis()+ " " + ca.getNro_motor() + " " + ca.getColor() + " " + ca.getMarca() + " " + ca.getModelo()  + " " + ca.getAnio() + " " + ca.getTraccion()+" "+ca.getTpo_cabina());
                                    
                                    }
                                    
                    }
                    camionetsb.close();
                    camionetsr.close();
                    Tablas.CargadeCamionetasArchivo();
                    cargade_camioneta();
                    }
        
                }
    
            }   
            if(c==0){
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "No se encontro ninguna camioneta con ese numero de chasis en el sistema.");
            }
            
        
            
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        }catch (java.lang.NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error, complete la casilla correctamente.", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
           
    }//GEN-LAST:event_bus_nrocMousePressed

    
    
    public void cargade_auto(){
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            ArrayList<Object>nombrecolumna = new ArrayList<Object>();
            nombrecolumna.add("Nro Chasis");
            nombrecolumna.add("Nro Motor");
            nombrecolumna.add("Color");
            nombrecolumna.add("Marca");
            nombrecolumna.add("Modelo");
            nombrecolumna.add("Anio");
            nombrecolumna.add("Cant puertas");
            for(Object columna : nombrecolumna){
                modelo.addColumn(columna);
            }
            
            this.tab_auto.setModel(modelo);
            
            for(int k=0;k<Vehiculo.vehiculo.size();k++){
                if(Vehiculo.vehiculo.get(k) instanceof Auto){
                    Auto cc = (Auto)Vehiculo.vehiculo.get(k);

                    String cant_puertas = Integer.toString(cc.getCant_puertas());
                    String numero_chasis = Integer.toString(cc.getNro_chasis());
                    String numero_motor = Integer.toString(cc.getNro_motor());
                
                    String tab[] = {numero_chasis, numero_motor, cc.getColor(), cc.getMarca(), cc.getModelo(), cc.getAnio(), cant_puertas};
                
                    modelo.addRow(tab);
                }
            }
            
            tab_auto.setModel(modelo);
            
            
            
            }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO el codigo de eliminar de tabla UN AUTO
        try{
        int fila = tab_auto.getSelectedRow();
            String valor = tab_auto.getValueAt(fila, 0).toString();
        
            int n =Integer.parseInt(valor);
            
             for(int x = 0;x< Vehiculo.vehiculo.size();x++ ){
                if( Vehiculo.vehiculo.get(x).getNro_chasis() == n && Vehiculo.vehiculo.get(x) instanceof Auto){
                    JFrame jFrame = new JFrame();
                        int result = JOptionPane.showConfirmDialog(jFrame, "Esta seguro que desea eliminar este auto?");

                    if (result == 0){
                    PrintWriter autoosr = null;
                    try {
                        //aca elimino del archivo xD
                        
                        Vehiculo.vehiculo.remove(Vehiculo.vehiculo.get(x));
                        File autoos = new File("autos.txt");
                        autoosr = new PrintWriter(autoos);
                        autoosr.close();
                        try (FileWriter auttsr = new FileWriter(autoos, true); BufferedWriter auttsb = new BufferedWriter(auttsr)) {
                            auttsb.write("nro_chasis nro_motor marca color modelo anio cant_puertas");
                            for(int j = 0;j< Vehiculo.vehiculo.size();j++){
                                if(Vehiculo.vehiculo.get(j) instanceof Auto){
                                    Auto ab = (Auto)Vehiculo.vehiculo.get(j);
                                    auttsb.write("\n");
                                    auttsb.write(ab.getNro_chasis() + " " + ab.getNro_motor() + " " + ab.getMarca() + " " + ab.getColor() + " " + ab.getModelo() + " " + ab.getAnio()+ " " + ab.getCant_puertas());
                                    
                                }
                                
                            }
                            Tablas.CargadeAutosArchivo();
                            cargade_auto();
                        }
                        
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        autoosr.close();
                    }
                    }
                }
        
                }
        }catch(java.lang.ArrayIndexOutOfBoundsException ex){
                javax.swing.JOptionPane.showMessageDialog(this, "Error, ingrese un auto de la lista.", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }
    }//GEN-LAST:event_jButton2MousePressed

    
     public void cargade_camioneta(){
        
            DefaultTableModel modelo = new DefaultTableModel();
            
            ArrayList<Object>nombrecolumna = new ArrayList<>();
            
            nombrecolumna.add("Nro Chasis");
            nombrecolumna.add("Nro Motor");
            nombrecolumna.add("Color");
            nombrecolumna.add("Marca");
            nombrecolumna.add("Modelo");
            nombrecolumna.add("Anio");
            nombrecolumna.add("Traccion");
            nombrecolumna.add("Tipo de cabina");
            for(Object columna : nombrecolumna){
                modelo.addColumn(columna);
            }
            
            this.tab_camioneta.setModel(modelo);
            
            for(int k=0;k<Vehiculo.vehiculo.size();k++){
                
                if(Vehiculo.vehiculo.get(k) instanceof Camioneta){
                
                Camioneta cb = (Camioneta) Vehiculo.vehiculo.get(k);
                String numero_chasis = Integer.toString(cb.getNro_chasis());
                String numero_motor = Integer.toString(cb.getNro_motor());

                String tab[] = {numero_chasis, numero_motor, cb.getColor(), cb.getMarca(), cb.getModelo(), cb.getAnio(),cb.getTraccion(), cb.getTpo_cabina()};
                
                modelo.addRow(tab);
            }
       
            }
            
            tab_camioneta.setModel(modelo);

            }

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO CODIGO ELIMINAR CAMIONETA DE TABLA
            try{
            int fila = tab_camioneta.getSelectedRow();
            String valor = tab_camioneta.getValueAt(fila, 0).toString();
            
            int n =Integer.parseInt(valor);
            
             for(int x = 0;x< Vehiculo.vehiculo.size();x++ ){
                if( Vehiculo.vehiculo.get(x).getNro_chasis() == n && Vehiculo.vehiculo.get(x) instanceof Camioneta){
                    
                    JFrame jFrame = new JFrame();
                        int result = JOptionPane.showConfirmDialog(jFrame, "Esta seguro que desea eliminar esta camioneta?");

                    if (result == 0){
                    PrintWriter camionetaasr = null;
                    try {
                        //aca elimino del archivo xD
                        
                        Vehiculo.vehiculo.remove(Vehiculo.vehiculo.get(x));
                        File camionetaas = new File("camionetas.txt");
                        camionetaasr = new PrintWriter(camionetaas);
                        camionetaasr.close();
                        try (FileWriter camionetsr = new FileWriter(camionetaas, true); BufferedWriter camionetsb = new BufferedWriter(camionetsr)) {
                            camionetsb.write("nro_chasis nro_motor color marca modelo anio traccion tpo_cabina");
                            for(int j = 0;j< Vehiculo.vehiculo.size();j++){
                                if(Vehiculo.vehiculo.get(j) instanceof Camioneta){
                                    Camioneta cb = (Camioneta)Vehiculo.vehiculo.get(j);
                                    camionetsb.write("\n");
                                    camionetsb.write(cb.getNro_chasis()+ " " + cb.getNro_motor() + " " + cb.getColor() + " " + cb.getMarca() + " " + cb.getModelo()  + " " + cb.getAnio() + " " + cb.getTraccion()+" "+cb.getTpo_cabina());
                                    
                                }
                                
                            }
                            Tablas.CargadeCamionetasArchivo();
                            cargade_camioneta();
                        }
                        
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        camionetaasr.close();
                    }
                    }
                }
        
             }  
        
            }catch(java.lang.ArrayIndexOutOfBoundsException ex){
                javax.swing.JOptionPane.showMessageDialog(this, "Error, ingrese una camioneta de la lista.", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        try{
            try{
            
            int n = Integer.parseInt(auto.getText());
            auto.setText(null);
            
            int c = 0;
            
            
            
            for(int x = 0;x< Vehiculo.vehiculo.size();x++){
                if( Vehiculo.vehiculo.get(x).getNro_chasis() == n && Vehiculo.vehiculo.get(x) instanceof Auto){
                    //aca elimino del archivo xD
                    Auto ab = (Auto)Vehiculo.vehiculo.get(x);
                    c++;
                    JFrame jFrame = new JFrame();
                    int result = JOptionPane.showConfirmDialog(jFrame, "Este es el auto que desea eliminar:\nMarca: "+ ab.getMarca() + "\nModelo: "+ ab.getModelo()+"\nAnio: "+ab.getAnio()+"\nNro Chasis: "+ab.getNro_chasis()+"\nNro Motor: "+ ab.getNro_motor()+"\nCantidad de Puertas: "+ ab.getCant_puertas()+"\nColor: "+ab.getColor());

                    if (result == 0){
                        
                    
                    Vehiculo.vehiculo.remove(Vehiculo.vehiculo.get(x));
                    File autoos = new File("autos.txt");
                    PrintWriter autoosr = new PrintWriter(autoos);
                    autoosr.close();
                    
                    FileWriter autsr = new FileWriter(autoos, true);
                    BufferedWriter autsb = new BufferedWriter(autsr);

                    autsb.write("nro_chasis nro_motor marca color modelo anio cant_puertas");
                    
                    for(int j = 0;j< Vehiculo.vehiculo.size();j++){
                                    if(Vehiculo.vehiculo.get(j) instanceof Auto){
                                        Auto ca = (Auto) Vehiculo.vehiculo.get(j);
                                        autsb.write("\n");
                                        autsb.write(ca.getNro_chasis() + " " + ca.getNro_motor() + " " + ca.getMarca() + " " + ca.getColor() + " " + ca.getModelo() + " " + ca.getAnio()+ " " + ca.getCant_puertas());

                                    }
                                    
                    }
                    autsb.close();
                    autsr.close();
                    Tablas.CargadeAutosArchivo();
                    cargade_auto();
                    }
        
                }
    
            }   
            if(c==0){
                JFrame jFrame = new JFrame();
                JOptionPane.showMessageDialog(jFrame, "No se encontro ningun auto con ese numero de chasis en el sistema.");
            }
            
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        }catch (java.lang.NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error, complete la casilla correctamente.", "ERROR", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField auto;
    private javax.swing.JLabel bus_nroc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField nro_chasis;
    private javax.swing.JTable tab_auto;
    private javax.swing.JTable tab_camioneta;
    // End of variables declaration//GEN-END:variables
}
