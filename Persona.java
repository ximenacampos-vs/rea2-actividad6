/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

import javax.swing.JOptionPane;
/**
 *
 * @author ximena
 */
public class Persona {
    
    String nombre;
    String apellido;
    String sexo;
    String lugarConsulta;
    private String medicoTratante;
    private String direccionResidencia;
    private String fecha;
    String codigo;
    
    public Persona(){
        
        this.nombre = null;
        this.apellido = null;
        this.sexo = null;
        this.lugarConsulta = null;
        this.medicoTratante = null;
        this.direccionResidencia = null;
        this.fecha = null;
        this.codigo = null;
    }
    
    public Persona (String codigo ,String nombre,String apellido, String sexo, String lugarConsulta, String medicoTratante, String direccionResidencia, String fecha ){
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.lugarConsulta = lugarConsulta;
        this.medicoTratante = medicoTratante;
        this.direccionResidencia = direccionResidencia;
        this.fecha = fecha;
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugarConsulta() {
        return lugarConsulta;
    }

    public void setLugarConsulta(String lugarConsulta) {
        this.lugarConsulta = lugarConsulta;
    }


    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
     public void imprimirDatosPersona(){
        String datosPersona="";
        datosPersona="Codigo: "+codigo+"\n"+"Nombres: "+nombre+"\n"+"Apellidos: "+apellido+"\n"+"Sexo: "+sexo;
        JOptionPane.showMessageDialog(null, datosPersona);
    }

    public String leerDatoTipoCadena (String mensaje){
        String valor = "";
        valor = JOptionPane.showInputDialog(null,mensaje);
        return (valor);
    }

    public int leerDatoTipoEntero (String mensaje){
        int valor = 0;
        try{
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
            return (valor);
        }
        catch (Exception errorIngreso){
            errorIngreso.printStackTrace();
            return (0);
        }
    }
    
}
