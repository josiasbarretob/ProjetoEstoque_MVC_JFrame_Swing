package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelUsuario;
import util.ConexaoSQLite;

/**
 *
 * @author josborges
 */
public class DAOUsuario extends ConexaoSQLite{ 

   public boolean salvarUsuarioDAO(ModelUsuario pModelUsuario){
   
      conectar();
      //Executar sql
      String sql = "INSERT INTO tbl_usuario ("
              + "username,  "
              + "user_login,  "
              + "user_password)  "
              + "VALUES (?,?,?)";
      PreparedStatement preparedStatement = criarPreparedStatement(sql,Statement.RETURN_GENERATED_KEYS);
       try {
           preparedStatement.setString(1, pModelUsuario.getUsername());
           preparedStatement.setString(2, pModelUsuario.getUser_login());
           preparedStatement.setString(3, pModelUsuario.getUser_password());
           
           preparedStatement.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
           
           return false;
           
       }
      desconectar();
      
       return true;
   
   }
    
    
//public boolean salvarUsuarioDAO(ModelUsuario pModelUsuario){
    
//        conectar();
//        //Executar sql
//        String sql = "INSERT INTO tbl_usuario(username, user_login, user_password) VALUES(?,?,?)";
//       
//        PreparedStatement preparedStatement;
//        preparedStatement = criarPreparedStatement (sql, Statement.RETURN_GENERATED_KEYS);
//        
//        preparedStatement.setString(1, pModelUsuario.getUsername());
//        preparedStatement.setString(2, pModelUsuario.getUser_login());
//        preparedStatement.setString(3, pModelUsuario.getUser_password());
//        preparedStatement.executeUpdate();
//        return false;
//        
//        desconectar();
//        return true;
    /* @Override
    public boolean conectar(){
    return super.conectar();
    */

}
