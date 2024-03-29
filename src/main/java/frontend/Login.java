package frontend;

//imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pw = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pw.setBackground(new java.awt.Color(69, 73, 73));
        pw.setForeground(new java.awt.Color(255, 255, 255));
        pw.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pw.setToolTipText("");
        pw.setCaretColor(new java.awt.Color(255, 255, 255));
        pw.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        pw.setName(""); // NOI18N
        pw.setSelectionColor(new java.awt.Color(102, 102, 102));
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 189, 158, -1));

        user.setBackground(new java.awt.Color(69, 73, 73));
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setCaretColor(new java.awt.Color(255, 255, 255));
        user.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        user.setSelectionColor(new java.awt.Color(102, 102, 102));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 136, 158, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 114, -1, -1));

        login.setBackground(new java.awt.Color(102, 102, 102));
        login.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setToolTipText("");
        login.setBorder(null);
        login.setBorderPainted(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.setMinimumSize(new java.awt.Dimension(50, 16));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 90, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 163, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("¿No tienes cuenta? Registrate");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 223, -1, -1));

        register.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        register.setForeground(new java.awt.Color(204, 204, 255));
        register.setText("Aquí");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 222, 30, 20));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bglog.jpg"))); // NOI18N
        jPanel1.add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        Register rg = new Register();
        rg.setVisible(true);
        rg.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_registerMouseClicked
   
    public String getUser()
    { 
        return user.getText();
    }

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(new java.awt.Color(138, 136, 136));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_loginMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
       register.setForeground(new java.awt.Color(179, 179, 227));
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setForeground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_registerMouseExited
    //LOGEAR
    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
            String User = user.getText();
            String valorDelCampo = getUser();
            
            char[] Passwordchar = pw.getPassword();
            String Password = new String(Passwordchar);

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "12345678");
            String sql = "SELECT * FROM usuarios WHERE users = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, User);
            statement.setString(2, Password);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next())
            {
                App app = new App();
                app.setNombre(valorDelCampo);
                app.setVisible(true);
                app.setLocationRelativeTo(null);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Bienvenido a su agenda electronica! "+User.toUpperCase());
            } else 
            {
                JOptionPane.showMessageDialog(null, "Nombre o contraseña incorrectas. Ingrese nuevamente.");
            }
            resultSet.close();
            connection.close();
        } catch(SQLException e){
            
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
                        
    }//GEN-LAST:event_loginMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pw;
    private javax.swing.JLabel register;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables


}
