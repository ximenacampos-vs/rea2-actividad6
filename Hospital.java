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
public class Hospital {
    
    private String nombre;
    private String direccion;
    private String tipo;

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, String tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String definirTipoCentro(int tipo){        
        String tipoCentro="";

        do {            
           switch(tipo){
            case 1:
                tipoCentro="Clinica";
                break;
            case 2:
                tipoCentro="Hospital";
                break;
            case 3:
                tipoCentro="Centro de Salud";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido");
                break;
            } 
        } while (tipo<1 || tipo>3);

        return tipoCentro;
    }

    public Hospital ingresarDatosHospital(){
        Hospital nuevoCentroServicio = new Hospital();
        Persona leerDato = new Persona();

        String nombre="";
        String direccion="";
        String tipo="";

        nombre=leerDato.leerDatoTipoCadena("Ingrese el nombre del hospital:");
        direccion=leerDato.leerDatoTipoCadena("Ingrese la direccion del centro de servicio: ");
        tipo=definirTipoCentro(leerDato.leerDatoTipoEntero("Ingrese el numero correspondiente:"+"\n"+"Que tipo de centro de servicio es?:"+"\n"+"1. Clinica"+"\n"+"2. Hospital"+"\n"+"3. Centro de salud"));

        nuevoCentroServicio.setNombre(nombre);
        nuevoCentroServicio.setDireccion(direccion);
        nuevoCentroServicio.setTipo(tipo);

        return(nuevoCentroServicio);
    }

    public void imprimirDatosCentro(){
        String datosCentro="";
        datosCentro="Nombre: "+nombre+"\n"+"Direccion: "+direccion+"\n"+"Tipo: "+tipo;
        JOptionPane.showMessageDialog(null, "Centro de Servicio:"+"\n"+datosCentro);
    }

    void imprimirDatosHospital() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}


