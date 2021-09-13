/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsConexion;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel Suarez Huertas
 */
public class clsAcudiente {

    //Declaración de atributos
    private String docAcu;
    private String nomAcu;
    private String apeAcu;
    private String dirAcu;
    private String telAcu;
    private String emaAcu;
    clsConexion objCon = new clsConexion();
    
    //Encapsulación

    /**
     * @return the docAcu
     */
    public String getDocAcu() {
        return docAcu;
    }

    /**
     * @param docAcu the docAcu to set
     */
    public void setDocAcu(String docAcu) {
        this.docAcu = docAcu;
    }

    /**
     * @return the nomAcu
     */
    public String getNomAcu() {
        return nomAcu;
    }

    /**
     * @param nomAcu the nomAcu to set
     */
    public void setNomAcu(String nomAcu) {
        this.nomAcu = nomAcu;
    }

    /**
     * @return the apeAcu
     */
    public String getApeAcu() {
        return apeAcu;
    }

    /**
     * @param apeAcu the apeAcu to set
     */
    public void setApeAcu(String apeAcu) {
        this.apeAcu = apeAcu;
    }

    /**
     * @return the dirAcu
     */
    public String getDirAcu() {
        return dirAcu;
    }

    /**
     * @param dirAcu the dirAcu to set
     */
    public void setDirAcu(String dirAcu) {
        this.dirAcu = dirAcu;
    }

    /**
     * @return the telAcu
     */
    public String getTelAcu() {
        return telAcu;
    }

    /**
     * @param telAcu the telAcu to set
     */
    public void setTelAcu(String telAcu) {
        this.telAcu = telAcu;
    }

    /**
     * @return the emaAcu
     */
    public String getEmaAcu() {
        return emaAcu;
    }

    /**
     * @param emaAcu the emaAcu to set
     */
    public void setEmaAcu(String emaAcu) {
        this.emaAcu = emaAcu;
    }
    //Metodos
    public void guardar(){
        try{
            objCon.conectar();
            objCon.Sql = objCon.con.prepareStatement("insert into acudiente (docAcu,nomAcu,apeAcu,dirAcu,telAcu,emaAcu) values(?,?,?,?,?,?)");
            objCon.Sql.setString(1, getDocAcu());
            objCon.Sql.setString(2, getNomAcu());
            objCon.Sql.setString(3, getApeAcu());
            objCon.Sql.setString(4, getDirAcu());
            objCon.Sql.setString(5, getTelAcu());
            objCon.Sql.setString(6, getEmaAcu());
            objCon.Sql.executeUpdate();
            objCon.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado con éxito");        
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ");
        }
    }
}
