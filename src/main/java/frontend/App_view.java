package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class App_view extends javax.swing.JFrame {

    public App_view(String nombre)  {
        
        
        // Configuración básica de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Ver Eventos");
        
        try
        {
              int id = 0;
             Class.forName("com.mysql.jdbc.Driver");
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "12345678");       
             String selectQuery = "SELECT id FROM usuarios WHERE users = " + "'" + nombre + "'";
             Statement statement = connection.createStatement();
             
             ResultSet resultSet = statement.executeQuery(selectQuery);
             
             
                if (resultSet.next())
               {
                  id = resultSet.getInt("id");
                  
               } 
              
              String event = "SELECT nombre_evento, descripcion_evento, categoria_evento, fechainicio, fechafin FROM eventos WHERE id_usuario = " + "'" + id + "'";;  
              ResultSet resultEvent = statement.executeQuery(event);
              
               while (resultEvent.next()) {
                  String nombreEvento = resultEvent.getString("nombre_evento");
                  System.out.println("Evento encontrado: " + nombreEvento);
                } 
                
        // Creación del panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Creación del JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Creación del panel contenedor de los paneles individuales
        JPanel panelContainer = new JPanel();
        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        for (int i = 0; i <= 1; i++) 
        {
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(610, 50));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel titleLabel = new JLabel("Título del Panel " + (i + 1));
            JLabel descriptionLabel = new JLabel("Descripción del Panel " + (i + 1));
            panel.setBackground(Color.red);
            panel.add(titleLabel);
            panel.add(descriptionLabel);

            panelContainer.add(panel);
        }
       
        // Agregar el panel contenedor al JScrollPane
        scrollPane.setViewportView(panelContainer);

        // Agregar el panel principal a la ventana
        getContentPane().add(mainPanel);

        // Ajustar el tamaño de la ventana
        pack();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(App_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App_view.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    public String nombre;
    private int ide;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
