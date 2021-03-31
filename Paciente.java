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
public class Paciente extends Persona{
    
    private String direccion;    
    private String motivoConsulta; 
    private String medicoTratante;
    private String fechaConsulta;

    public Paciente() {
    }

    public Paciente(String direccion, String motivoConsulta, String medicoTratante, String fechaConsulta, String codigo, String nombre, String apellido, String sexo, String lugarConsulta) {
        super(codigo, nombre, apellido, sexo, lugarConsulta, medicoTratante, direccion, sexo);
        this.direccion = direccion;
        this.motivoConsulta = motivoConsulta;
        this.medicoTratante = medicoTratante;
        this.fechaConsulta = fechaConsulta;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }    
    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }
    
    public String getFechaConsulta() {
        return fechaConsulta;
    }
    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Paciente ingresarDatosPaciente(){
        Paciente nuevoPaciente = new Paciente();

        String codigo="";
        String nombres="";
        String apellidos="";
        String sexo="";
        String lugarConsulta="";
        String direccion="";    
        String motivoConsulta=""; 
        String medicoEncargado="";
        String fechaConsulta="";

        codigo=leerDatoTipoCadena("Ingrese el codigo del paciente:");
        nombres=leerDatoTipoCadena("Ingrese el nombre del paciente:");
        apellidos=leerDatoTipoCadena("Ingrese el apellido del paciente:");
        sexo=leerDatoTipoCadena("Ingrese el sexo del paciente:");
        lugarConsulta=leerDatoTipoCadena("Ingrese el lugar de la consulta del paciente:");
        direccion=leerDatoTipoCadena("Ingrese la direccion del paciente:");
        motivoConsulta=leerDatoTipoCadena("Ingrese el motivo de la consulta del paciente:");
        medicoEncargado=leerDatoTipoCadena("Ingrese el medico engargado del paciente:");
        fechaConsulta=leerDatoTipoCadena("Ingrese la fecha de la consulta:");

        nuevoPaciente.setCodigo(codigo);
        nuevoPaciente.setNombre(nombres);
        nuevoPaciente.setApellido(apellidos);
        nuevoPaciente.setSexo(sexo);
        nuevoPaciente.setLugarConsulta(lugarConsulta);
        nuevoPaciente.setDireccion(direccion);
        nuevoPaciente.setMotivoConsulta(motivoConsulta);
        nuevoPaciente.setMedicoTratante(medicoEncargado);
        nuevoPaciente.setFechaConsulta(fechaConsulta);

        return(nuevoPaciente);                
    }

    public void imprimirDatosPaciente(){        
        imprimirDatosPersona();

        String datosPaciente1;
        datosPaciente1="Lugar de la consulta: "+lugarConsulta+"\n"+"Direccion: "+direccion+"\n"+"Motivo de consulta: "+motivoConsulta+"\n"+"Fecha de la consulta: "+fechaConsulta+"\n"+"Medico encargado: "+medicoTratante;
        JOptionPane.showMessageDialog(null, "Datos del paciente:"+"\n"+datosPaciente1);               
    }

   

    
}
