package frontend;

//Imports

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        userrg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pwrg = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        backgroundrg = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(554, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userrg.setBackground(new java.awt.Color(69, 73, 73));
        userrg.setForeground(new java.awt.Color(255, 255, 255));
        userrg.setCaretColor(new java.awt.Color(255, 255, 255));
        userrg.setSelectionColor(new java.awt.Color(102, 102, 102));
        userrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userrgActionPerformed(evt);
            }
        });
        jPanel1.add(userrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 158, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Indica nombre de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        pwrg.setBackground(new java.awt.Color(69, 73, 73));
        pwrg.setForeground(new java.awt.Color(255, 255, 255));
        pwrg.setCaretColor(new java.awt.Color(255, 255, 255));
        pwrg.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPanel1.add(pwrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 158, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Indique su contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        registrar.setBackground(new java.awt.Color(102, 102, 102));
        registrar.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.setAutoscrolls(true);
        registrar.setBorder(null);
        registrar.setBorderPainted(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setFocusPainted(false);
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarMouseExited(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 80, 30));

        volver.setBackground(new java.awt.Color(102, 102, 102));
        volver.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(null);
        volver.setBorderPainted(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 30));

        backgroundrg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bgrg.jpg"))); // NOI18N
        jPanel1.add(backgroundrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 590, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userrgActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        lg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed
//hover
    private void registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseEntered
        registrar.setBackground(new java.awt.Color(138, 136, 136));
    }//GEN-LAST:event_registrarMouseEntered

    private void registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseExited
        registrar.setBackground(new java.awt.Color(102, 102, 102));  
    }//GEN-LAST:event_registrarMouseExited

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setBackground(new java.awt.Color(138, 136, 136));        
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setBackground(new java.awt.Color(102, 102, 102));         
    }//GEN-LAST:event_volverMouseExited

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
            String User = userrg.getText();
            char[] Passwordchar = pwrg.getPassword();
            String Password = new String(Passwordchar);
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "12345678");
                    // Verificar si el usuario ya existe
                String checkUserQuery = "SELECT COUNT(*) FROM usuarios WHERE users = ?";
                PreparedStatement checkUserStatement = connection.prepareStatement(checkUserQuery);
                checkUserStatement.setString(1, User);
                ResultSet userExistsResult = checkUserStatement.executeQuery();
                userExistsResult.next();
                int userCount = userExistsResult.getInt(1);
                if (Password.length()>7){
                if (userCount>0)
                {
                    JOptionPane.showMessageDialog(null, "El usuario ya se encuentra registrado");
                } else
                {
                    String insertQuery = "INSERT INTO usuarios (users, password) VALUES (?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
               
                    preparedStatement.setString(1, User);
                    preparedStatement.setString(2, Password);
                    preparedStatement.executeUpdate();
                
                    preparedStatement.close();
        
                    JOptionPane.showMessageDialog(null, "Registrado correctamente");
                }
                } else
                {
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres");
                }
                //cerramos conexion
                checkUserStatement.close();
                 connection.close();

                
            } catch(SQLException e)
                    {
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField pwrg;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField userrg;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
