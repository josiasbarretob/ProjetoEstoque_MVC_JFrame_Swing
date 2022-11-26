/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOUsuario;
import model.ModelUsuario;

/**
 * Salvar um novo usuario no banco
 */
public class ControllerUsuario {
    
    DAOUsuario dAOUsuario = new DAOUsuario();

    public boolean salvarUsuarioController(ModelUsuario modelUsuario) {
        
        return this.dAOUsuario.salvarUsuarioDAO(modelUsuario);
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
