/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.toedter.calendar.JDateChooser;
import frontend.App_view;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author xcamb
 */
public class Edit implements MouseListener {
    
    public Edit(String evento)
    {
        nombreEvento = evento;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        String opc[] = {"EDITAR", "BORRAR"};
        int answer = JOptionPane.showOptionDialog(null, "Que desea?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc, opc[0]);
        switch(answer)
        {
            case 0:
                try
                {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "12345678");
                  String newName = JOptionPane.showInputDialog(null, "Indica nuevo nombre para el evento");
                  String newDesc = JOptionPane.showInputDialog(null, "Indica una nueva descripcion para el evento");
                  String opc2[] = {"Boda", "Cumpleaños", "Aniversario", "Bautizo", "Comunion", "Reunión Familiar", "Reunión Empresarial", "Graduacion"};
                  int answer2 = JOptionPane.showOptionDialog(null, "Que desea?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc2, opc2[0]);
                  String result = opc2[answer2];
                  String newFechai = JOptionPane.showInputDialog(null, "Indica la nueva fecha inicial en formato YYYY-MM-dd");
                  String newFechaf = JOptionPane.showInputDialog(null, "Indica la nueva fecha final en formato YYYY-MM-dd");
                  String updateQuery = "UPDATE eventos SET nombre_evento =" +"'"+newName+"'"+", descripcion_evento="+"'"+newDesc+"'"+", categoria_evento="+"'"+result+"'"+ ", fechainicio=" + "'"+newFechai+"'"+", fechafin=" + "'"+newFechaf+"'"+ " WHERE nombre_evento = "+"'"+nombreEvento+"'";
                  Statement statement = connection.createStatement();
                  statement.executeUpdate(updateQuery);
                  JOptionPane.showMessageDialog(null, "Editado correctamente.");
                  
                  statement.close();
                  connection.close();
                  
                  App_view.frame.dispose();
                          
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;


            case 1:
                try
                {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/usersdb", "root", "12345678");
                  String deleteQuery = "DELETE FROM eventos WHERE nombre_evento="+"'"+nombreEvento+"'";
                 Statement statement = connection.createStatement();
                  statement.executeUpdate(deleteQuery);
                  JOptionPane.showMessageDialog(null, "Eliminado correctamente.");
                  
                  statement.close();
                  connection.close();
                  
                  App_view.frame.dispose();
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
            }
                break;


        }
        }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    
    String nombreEvento;
    
}
