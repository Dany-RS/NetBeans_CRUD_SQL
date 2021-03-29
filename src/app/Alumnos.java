/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Alumnos extends javax.swing.JFrame {
    //creamos la variable de tipo ButtonGroup para hacer un grupo con los radiobuttons
    ButtonGroup btnGr;
    
    public Alumnos() {
        //esto para que salga centrada en la pantalla
        this.setLocationRelativeTo(null);
        initComponents();
        //no visible el campo de ID
        txtId.setVisible(false);
        //creamos el objeto y añadimos el grupo de radiobuttons
        btnGr = new ButtonGroup();
        btnGr.add(rbMasculino);
        btnGr.add(rbFemenino);
        //cargamos la tabla de forma inicial para que se vean los datos
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Matricula", "Nombre", "Sexo", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ALUMNOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setText("Matricula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:");

        rbMasculino.setText("Masculino");

        rbFemenino.setText("Femenino");

        jLabel6.setText("Email");

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula)
                            .addComponent(txtNombre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEmail)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbMasculino)
                                            .addGap(30, 30, 30)
                                            .addComponent(rbFemenino))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnLimpiar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText()); //este va como entero
        String email = txtEmail.getText();
        String sexo;
        if (rbMasculino.isSelected() == true){
            sexo = "M";
        }else if (rbFemenino.isSelected() == true){
            sexo = "F";
        }else {
            sexo = ""; //si no va nada informado lo dejo a espacios
            //la tabla la he definido con este campo que no permite nulos
            //así que debe ir informado
        }
        
        String updateSQL = "UPDATE Alumnos SET(matricula=?, nombre=?, edad=?, sexo=?, email=?) WHERE id=?";
        //Vamos a hacer el guardado, por lo que debemos conectarnos a BBDD
        //usamos la clase creada de conexión
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(updateSQL);
            //pasamos los parámetros a insertar
            ps.setString(1, matricula);
            ps.setString(2, nombre);
            ps.setInt(3, edad);
            ps.setString(4, sexo);
            ps.setString(5, email);
            ps.setInt(6, id );
            //ejecutamos la sentencia
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificado.");
            //limpia el formulario
            limpiar();
            //recargamos la tabla para mostrar el nuevo elemento
            cargarTabla();
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.toString());
        }
           
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText()); //este va como entero
        String email = txtEmail.getText();
        String sexo;
        if (rbMasculino.isSelected() == true){
            sexo = "M";
        }else if (rbFemenino.isSelected() == true){
            sexo = "F";
        }else {
            sexo = ""; //si no va nada informado lo dejo a espacios
            //la tabla la he definido con este campo que no permite nulos
            //así que debe ir informado
        }
        
        String insertSQL = "INSERT INTO Alumnos (matricula, nombre, edad, sexo, email, activo) VALUES (?,?,?,?,?,?)";
        //Vamos a hacer el guardado, por lo que debemos conectarnos a BBDD
        //usamos la clase creada de conexión
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(insertSQL);
            //pasamos los parámetros a insertar
            ps.setString(1, matricula);
            ps.setString(2, nombre);
            ps.setInt(3, edad);
            ps.setString(4, sexo);
            ps.setString(5, email);
            ps.setInt(6, 1 );
            //ejecutamos la sentencia
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro guardado.");
            //limpia el formulario
            limpiar();
            //recargamos la tabla para mostrar el nuevo elemento
            cargarTabla();
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.toString());
        }
   
    }//GEN-LAST:event_jBtnGuardarActionPerformed
    
    /*para seleccionar un elemento de la tabla y nos cargue el panel de datos
    *para luego modificarlo, tenemos que ir al diseño de la tabla, seleccionar
    *en la pestaña 'Eventos' => MousseClicked y nos genera el evento directamente
    *en el código
    */
    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // TODO add your handling code here:
        
        try{
            //identificamos la fila seleccionada
            int fila = tblAlumnos.getSelectedRow();
            //pasamos el valor de la columna Id, getValueAt(Fila, Columna) además
            //hay que hacer un parseo porque es un INT, pero hay que tener en cuenta
            //que lo que estamos tomando es un OBJETO con un valor, para sacar el 
            //valor necesitamos usar .toString
            int id = Integer.parseInt(tblAlumnos.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = Conexion.getConexion();
            String selectSQL = "SELECT matricula, nombre, edad, sexo, email FROM Alumnos WHERE id=?";
            ps = con.prepareStatement(selectSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //asigna a cada elemento su valor
                txtId.setText(String.valueOf(id));//el 'id' lo convierte a texto
                //porque viene como numero y así evita problemas
                txtMatricula.setText(rs.getString("matricula"));
                txtNombre.setText(rs.getString("nombre"));
                txtEdad.setText(rs.getString("edad"));
                txtEmail.setText(rs.getString("email"));
                //para el radiobutton hay que validar cuál es
                if(rs.getString("sexo").equals("M")){
                    rbMasculino.setSelected(true);
                }else if(rs.getString("sexo").equals("F")){
                    rbFemenino.setSelected(true);
                }
            }
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        //Solo necesitamos ID para borrar
        int id = Integer.parseInt(txtId.getText());
        
        //baja física
        //String deleteSQL = "DELETE FROM Alumnos WHERE id=?";
        //baja lógica: campo 'activo=0'
        String deleteSQL = "UPDATE Alumnos SET activo=0 WHERE id=?";
        //Vamos a hacer el guardado, por lo que debemos conectarnos a BBDD
        //usamos la clase creada de conexión
        try{
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(deleteSQL);
            //pasamos los parámetros a insertar
            ps.setInt(1, id );
            //ejecutamos la sentencia
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado.");
            //limpia el formulario
            limpiar();
            //recargamos la tabla para mostrar el nuevo elemento
            cargarTabla();
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.toString());
        }
           
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar(); 
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    //método para limpiar cuando se ha hecho una accion
    private void limpiar(){
        txtId.setText("");
        txtMatricula.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        //para el radiobutton, la variable la declaramos global y la usamos
        //aquí también para hacer limpieza de selección
        btnGr.clearSelection();
    }
    
    //método para cargar la tabla
    private void cargarTabla(){
        //uso la tabla diseñada 'tblAlumnos' como objeto de DefaultTableModel
        //pero para eso hay que hacer un casteo a dicho objeto. Así nos ahorramos
        //hacer todo el diseño por código
        DefaultTableModel modeloTabla = (DefaultTableModel)tblAlumnos.getModel();
        //para que siempre que se ejecute, se reinicie la información (salvo encabezados)
        modeloTabla.setRowCount(0);
        
        //vamos a hacer una select, declaramos las variables a usar
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        //La select para obtener todos los datos
        //String selectSQL = "SELECT id, matricula, nombre, sexo, email FROM Alumnos";
        //saca solo los activos, los dados de baja no
        String selectSQL = "SELECT id, matricula, nombre, sexo, email FROM Alumnos WHERE activo=1";
        
        //Tamaños de la tabla
        int[] anchos = {10,50,100,30,100}; //con esto establecemos el ancho de columna
        /*
        Con un bucle for, recorremos las columnas, para obtener el núm de columnas
        emplea getColumnCount, método de la tabla Alumnos.
        Después aplica varios métodos para poder aplicar el ancho que hemos definido
        a cada columna tiene que ir 1 a 1, indicando el ancho preferido declarado en
        el array
        */
        for (int i=0; i<tblAlumnos.getColumnCount(); i++) {
            tblAlumnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        //realizamos la conexión siempre controlada con try/catch
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement(selectSQL);
            rs = ps.executeQuery();//obtenemos el resultado 'resultset'
            rsmd = rs.getMetaData();//obtenemos metadatos de consulta y así podemos
            //obtener esta información
            columnas = rsmd.getColumnCount();
            
            //recorremos los datos, 
            /*1. Creamos un objeto que será un contenedor con todas las filas de 
            la tabla, un array 'object' donde metemos toda la info
            *2. Con un bucle recorremos todos los elementos de la columnas
            */
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for (int i=0; i<columnas; i++){
                    //tener en cuenta que los array empiezan en cero
                    //las consultas sql en 1
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.toString());
        }
    }

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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
