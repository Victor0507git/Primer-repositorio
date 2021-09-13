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
public class clsProfesor {

    //Declaracion de atributos
    private String docPro;
    private String nomPro;
    private String apePro;
    private String dirPro;
    private String telPro;
    private String emaPro;
    private String titPro;
    clsConexion objCon = new clsConexion();
    //Encapsulación

    /**
     * @return the docPro
     */
    public String getDocPro() {
        return docPro;
    }

    /**
     * @param docPro the docPro to set
     */
    public void setDocPro(String docPro) {
        this.docPro = docPro;
    }

    /**
     * @return the nomPro
     */
    public String getNomPro() {
        return nomPro;
    }

    /**
     * @param nomPro the nomPro to set
     */
    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    /**
     * @return the apePro
     */
    public String getApePro() {
        return apePro;
    }

    /**
     * @param apePro the apePro to set
     */
    public void setApePro(String apePro) {
        this.apePro = apePro;
    }

    /**
     * @return the dirPro
     */
    public String getDirPro() {
        return dirPro;
    }

    /**
     * @param dirPro the dirPro to set
     */
    public void setDirPro(String dirPro) {
        this.dirPro = dirPro;
    }

    /**
     * @return the telPro
     */
    public String getTelPro() {
        return telPro;
    }

    /**
     * @param telPro the telPro to set
     */
    public void setTelPro(String telPro) {
        this.telPro = telPro;
    }

    /**
     * @return the emaPro
     */
    public String getEmaPro() {
        return emaPro;
    }

    /**
     * @param emaPro the emaPro to set
     */
    public void setEmaPro(String emaPro) {
        this.emaPro = emaPro;
    }

    /**
     * @return the titPro
     */
    public String getTitPro() {
        return titPro;
    }

    /**
     * @param titPro the titPro to set
     */
    public void setTitPro(String titPro) {
        this.titPro = titPro;
    }
    //Metodos
    public void guardar(){
        try{
            objCon.conectar();
            objCon.Sql = objCon.con.prepareStatement("INSERT INTO profesor (docPro,nomPro,apePro,dirPro,telPro,emaPro,titPro) values(?,?,?,?,?,?,?)");
            objCon.Sql.setString(1, getDocPro());
            objCon.Sql.setString(2, getNomPro());
            objCon.Sql.setString(3, getApePro());
            objCon.Sql.setString(4, getDirPro());
            objCon.Sql.setString(5, getTelPro());
            objCon.Sql.setString(6, getEmaPro());
            objCon.Sql.setString(7, getTitPro());
            objCon.Sql.executeUpdate();
            objCon.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado con éxito");        
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ");
        }
    }
}
