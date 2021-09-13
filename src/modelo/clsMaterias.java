/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsConexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel Suarez Huertas
 */
public class clsMaterias {
    //Declaración de atributos
    private int codMat;
    private String nomMat;
    private String graMat;
     public ResultSet datos;
    clsConexion objCon = new clsConexion();
    
    //Encapsulación

    /**
     * @return the codMat
     */
    public int getCodMat() {
        return codMat;
    }

    /**
     * @param codMat the codMat to set
     */
    public void setCodMat(int codMat) {
        this.codMat = codMat;
    }

    /**
     * @return the nomMat
     */
    public String getNomMat() {
        return nomMat;
    }

    /**
     * @param nomMat the nomMat to set
     */
    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    /**
     * @return the graMat
     */
    public String getGraMat() {
        return graMat;
    }

    /**
     * @param graMat the graMat to set
     */
    public void setGraMat(String graMat) {
        this.graMat = graMat;
    }
    public void guardar(){
        try{
            objCon.conectar();
            objCon.Sql = objCon.con.prepareStatement("INSERT INTO materias (nomMat,graMat) values(?,?)");
            objCon.Sql.setString(1, getNomMat());
            objCon.Sql.setString(2, getGraMat());
            objCon.Sql.executeUpdate();
            objCon.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado con éxito");        
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ");
        }
    }
}
