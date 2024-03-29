package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
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
import backend.Edit;



public class App_view extends javax.swing.JFrame {

    public App_view(String nombre)  {
        
        frame = this;
        // Configuración básica de la ventana
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setTitle("Ver Eventos");
        
        try
        {

           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "12345678");       
           String selectQuery = "SELECT id FROM usuarios WHERE users = " + "'" + nombre + "'";
           Statement statement = connection.createStatement();
           
        // Creación del panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Creación del JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Creación del panel contenedor de los paneles individuales
        JPanel panelContainer = new JPanel();
        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        
              int id = 0;

             
             ResultSet resultSet = statement.executeQuery(selectQuery);
             
                if (resultSet.next())
               {
                  id = resultSet.getInt("id");
                  
               } 

              String event = "SELECT nombre_evento, descripcion_evento, categoria_evento, fechainicio, fechafin FROM eventos WHERE id_usuario = " + "'" + id + "'";;  
              ResultSet resultEvent = statement.executeQuery(event);

               while (resultEvent.next()) {
                  String nombreEvento = resultEvent.getString("nombre_evento");
                  String descripcionEvento = resultEvent.getString("descripcion_evento");
                  String categoriaEvento = resultEvent.getString("categoria_evento");
                  Date evFechaini = resultEvent.getDate("fechainicio");
                  Date evFechafin = resultEvent.getDate("fechafin");
               
                  JPanel panel = new JPanel();

                  panel.setPreferredSize(new Dimension(610, 50));
                  panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                  JLabel titleLabel = new JLabel("Evento: " + (nombreEvento));
                  JLabel descriptionLabel = new JLabel("Descripción: " + (descripcionEvento));
                  JLabel categoriaLabel = new JLabel("Categoria: " + (categoriaEvento));
                  JLabel fecha1Label = new JLabel("Fecha inicio: " + (evFechaini));
                  JLabel fecha2Label = new JLabel("Fecha fin: " + (evFechafin));
                  
                  titleLabel.setFont(new java.awt.Font("Impact", 0, 12));
                  descriptionLabel.setFont(new java.awt.Font("Impact", 0, 12));
                  categoriaLabel.setFont(new java.awt.Font("Impact", 0, 12));
                  fecha1Label.setFont(new java.awt.Font("Impact", 0, 12));
                  fecha2Label.setFont(new java.awt.Font("Impact", 0, 12));
                  
                   titleLabel.setForeground(Color.WHITE);
                  descriptionLabel.setForeground(Color.WHITE);
                  categoriaLabel.setForeground(Color.WHITE);
                  fecha1Label.setForeground(Color.WHITE);
                  fecha2Label.setForeground(Color.WHITE);
                  
                  switch(categoriaEvento)
                  {
                      case "Boda" -> panel.setBackground(new java.awt.Color(27, 188, 156));
                      
                      case "Cumpleaños" -> { panel.setBackground(new java.awt.Color(243, 156, 18));
                }
                      case "Aniversario" -> { panel.setBackground(new java.awt.Color(155, 89, 182));
                }
                      case "Bautizo" -> { panel.setBackground(new java.awt.Color(46, 204, 113));
                }
                      case "Comunion" -> { panel.setBackground(new java.awt.Color(231, 76, 60));
                }
                      case "Reunión Familiar" -> { panel.setBackground(new java.awt.Color(52, 73, 94));
                }
                      case "Reunión Empresarial" -> { panel.setBackground(new java.awt.Color(233, 30, 99));
                }
                      case "Graduacion" -> { panel.setBackground(new java.awt.Color(241, 196, 15));
                }
                      default -> { panel.setBackground(Color.BLACK);
                }
                  }
                  
                  panel.add(titleLabel);
                  panel.add(descriptionLabel);
                  panel.add(categoriaLabel);
                  panel.add(fecha1Label);
                  panel.add(fecha2Label);
                  
                  panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                  Edit ed = new Edit(nombreEvento);
                  
                  panel.addMouseListener(ed);
                  
                  panelContainer.add(panel);
               } 

                       // Agregar el panel contenedor al JScrollPane
        scrollPane.setViewportView(panelContainer);

        // Agregar el panel principal a la ventana
        getContentPane().add(mainPanel);

        // Ajustar el tamaño de la ventana
        pack();
                resultSet.close();
                connection.close();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(App_view.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App_view.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    public String nombre;
    public static JFrame frame;
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
