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
public class clsEstudiante {

    //Declaración de atributos
    private String docEst;
    private String nomEst;
    private String apeEst;
    private String dirEst;
    private String telEst;
    clsConexion objCon =  new clsConexion();

    //Encapsulación

    /**
     * @return the docEst
     */
    public String getDocEst() {
        return docEst;
    }

    /**
     * @param docEst the docEst to set
     */
    public void setDocEst(String docEst) {
        this.docEst = docEst;
    }

    /**
     * @return the nomEst
     */
    public String getNomEst() {
        return nomEst;
    }

    /**
     * @param nomEst the nomEst to set
     */
    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    /**
     * @return the apeEst
     */
    public String getApeEst() {
        return apeEst;
    }

    /**
     * @param apeEst the apeEst to set
     */
    public void setApeEst(String apeEst) {
        this.apeEst = apeEst;
    }

    /**
     * @return the dirEst
     */
    public String getDirEst() {
        return dirEst;
    }

    /**
     * @param dirEst the dirEst to set
     */
    public void setDirEst(String dirEst) {
        this.dirEst = dirEst;
    }

    /**
     * @return the telEst
     */
    public String getTelEst() {
        return telEst;
    }

    /**
     * @param telEst the telEst to set
     */
    public void setTelEst(String telEst) {
        this.telEst = telEst;
    }
    //Metodos
    public void guardar(){
        try{
            objCon.conectar();
            objCon.Sql = objCon.con.prepareStatement("insert into estudiante (docEst,nomEst,apeEst,dirEst,telEst) values(?,?,?,?,?)");
            objCon.Sql.setString(1, getDocEst());
            objCon.Sql.setString(2, getNomEst());
            objCon.Sql.setString(3, getApeEst());
            objCon.Sql.setString(4, getDirEst());
            objCon.Sql.setString(5, getTelEst());
            objCon.Sql.executeUpdate();
            objCon.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado con éxito");        
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ");
        }
    }
}
