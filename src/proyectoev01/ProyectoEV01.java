/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoev01;

/**
 *
 * @author s
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProyectoEV01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario="root";
        String password="2001";
        String url="jdbc:mysql://localhost:3306/miproyecto";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        
        
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProyectoEV01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion=DriverManager.getConnection(url, usuario, password);
            statement=conexion.createStatement();
            rs=statement.executeQuery("SELECT * FROM USUARIO");
            rs.next();
            do{
                System.out.println(rs.getInt("id_usuario")+";"+ rs.getString("nombres")+";"+ rs.getString("nomusu")+";"+ rs.getString("email")+";"+ rs.getString("direccion")+";"+ rs.getString("celular"));
                }while (rs.next());
            
            // Insertar
            
            statement.executeUpdate(" INSERT INTO USUARIO VALUES(4, 'Ernesto Arias', 'ernesto2', 'calle 36', '37693245', 'ernest55', 'ernesto@gmail.com')");
             System.out.println("");
            rs=statement.executeQuery("SELECT * FROM USUARIO");
            rs.next();
            do{
                System.out.println(rs.getInt("id_usuario")+";"+ rs.getString("nombres")+";"+ rs.getString("nomusu")+";"+ rs.getString("email")+";"+ rs.getString("direccion")+";"+ rs.getString("celular"));
                }while (rs.next());
            
            // Actualizar
            
            statement.executeUpdate(" UPDATE USUARIO SET nomusu='entrar1' WHERE id_usuario=1 ");
             System.out.println("");
            rs=statement.executeQuery("SELECT * FROM USUARIO");
            rs.next();
            do{
                System.out.println(rs.getInt("id_usuario")+";"+ rs.getString("nombres")+";"+ rs.getString("nomusu")+";"+ rs.getString("email")+";"+ rs.getString("direccion")+";"+ rs.getString("celular"));
                }while (rs.next());
            
            // Borrar
            
            statement.executeUpdate(" DELETE FROM USUARIO WHERE id_usuario=3 ");
             System.out.println("");
            rs=statement.executeQuery("SELECT * FROM USUARIO");
            rs.next();
            do{
                System.out.println(rs.getInt("id_usuario")+";"+ rs.getString("nombres")+";"+ rs.getString("nomusu")+";"+ rs.getString("email")+";"+ rs.getString("direccion")+";"+ rs.getString("celular"));
                }while (rs.next());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProyectoEV01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
