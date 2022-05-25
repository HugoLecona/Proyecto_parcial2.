/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDAO;

import DTO.Datos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.Datos_Bueno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lecona
 */
public class Conexion_Bueno {
     Connection conexion_bueno;
    List<Datos_Bueno> listaDatos_Bueno = new ArrayList<Datos_Bueno>();
    
     public void Abrir(){
       String user="root";
       String password="root";
       String url="jdbc:mysql://localhost:3306/g4s21_p?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion_bueno = DriverManager.getConnection(url, user ,password);
       } catch (ClassNotFoundException | SQLException ex){
           ex.printStackTrace();
       }
       
    }
    
    public void cerrar(){
        try {
            conexion_bueno.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insertar(Datos_Bueno datos_bueno){
        boolean estado = true;
        
        try{
            Abrir();
            PreparedStatement ps = conexion_bueno.prepareStatement("insert into Datos(nombre, telefono, celular, direccion) values(?,?,?,?)");
            ps.setString(1, datos_bueno.getNombre());
            ps.setInt(2, datos_bueno.getTelefono());
            ps.setInt(3, datos_bueno.getCelular());
            ps.setString(4, datos_bueno.getDireccion());
            ps.execute();
            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        
        return estado;
        
    }
    
    
    public boolean actualizar(Datos_Bueno datos_bueno){
         boolean estado = true;
        
        try{
            Abrir();
            PreparedStatement ps = conexion_bueno.prepareCall("update Datos set nombre = ?, telefono = ?, celular = ?, direccion = ? where id = ?");
            ps.setString(1, datos_bueno.getNombre());
            ps.setInt(2, datos_bueno.getTelefono());
            ps.setInt(3, datos_bueno.getCelular());
            ps.setString(4, datos_bueno.getDireccion());
            ps.setInt(5, datos_bueno.getId());
            ps.executeUpdate();
            
            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        
        return estado;
    }
    
    public boolean consultartodos(){
        boolean estado = true;
        
        try{
            Abrir();
            PreparedStatement ps = conexion_bueno.prepareCall("select * from Datos");
            ResultSet rs = ps.executeQuery();
            Datos_Bueno datos_bueno;
            
            while(rs.next()){
                //datos = new Datos(rs.getNString("nombre"), rs.getInt("edad"), rs.getNString("correo")); 
                datos_bueno = new Datos_Bueno();
                datos_bueno.setId(rs.getInt("id"));
                datos_bueno.setNombre(rs.getNString("nombre")); //se puede de esta forma o de la de arriba
                datos_bueno.setTelefono(rs.getInt("telefono"));
                datos_bueno.setCelular(rs.getInt("celular"));
                datos_bueno.setDireccion(rs.getNString("direccion"));
                listaDatos_Bueno.add(datos_bueno);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        
        return estado;
    }
    
    public List<Datos_Bueno> getListDatos_Bueno(){
        return listaDatos_Bueno;
    }
    
    public boolean borrar(int id){
        boolean estado = true;
        try{
            Abrir();
            PreparedStatement ps = conexion_bueno.prepareStatement("delete from Datos where id = ?");
            ps.setInt(1, id);
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
            estado = false;
        }finally{
            cerrar();
        }
        return estado;
    }
}
