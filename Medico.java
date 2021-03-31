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
public class Medico extends Persona{
    
    private String tipoMedico;
    
   
    public Medico() {
    }

    public Medico(String tipoMedico, String codigo, String nombre, String apellido, String sexo, String lugarConsulta) {
        super(codigo, nombre, apellido, sexo, lugarConsulta, codigo, lugarConsulta, sexo);
        this.tipoMedico = tipoMedico;
    }

    public String getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(String tipoMedico) {
        this.tipoMedico = tipoMedico;
    }

        

    public Medico ingresarDatosMedico(){
        Medico nuevoMedico = new Medico();

        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String codigo="";
        String nombres="";
        String apellidos="";
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String tipoMedico="";
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String lugarConsulta="";
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        String sexo="";

        codigo=leerDatoTipoCadena("Ingrese el codigo del medico:");
        nombres=leerDatoTipoCadena("Ingrese los nombres del medico:");
        apellidos=leerDatoTipoCadena("Ingrese los apellidos del medico:");        
        tipoMedico=leerDatoTipoCadena("Ingrese el tipo del medico:");
        lugarConsulta=leerDatoTipoCadena("Ingrese el lugar de la consulta del medico:");
        sexo=leerDatoTipoCadena("Ingrese el sexo del medico:");

        nuevoMedico.setCodigo(codigo);
        nuevoMedico.setNombre(nombres);
        nuevoMedico.setApellido(apellidos);
        nuevoMedico.setTipoMedico(tipoMedico);
        nuevoMedico.setTipoMedico(tipoMedico);
        nuevoMedico.setSexo(sexo);

        return(nuevoMedico);
    }

    public void imprimirDatosMedico(){
        String datosMedico="";
        datosMedico="Codigo: "+codigo+"\n"+"Nombres: "+nombre+"\n"+"Apellidos: "+apellido+"\n"+"Especialidad: "+tipoMedico+"\n"+"Sexo: "+sexo+"\n"+"";
        JOptionPane.showMessageDialog(null, "Datos del medico:"+"\n"+datosMedico);
    } 
    
}
