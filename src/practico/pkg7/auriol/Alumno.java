/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg7.auriol;

import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista de materias en las
que está inscripto; para ello tiene un método agregarMateria que permite inscribir al Alumno en
una materia determinada (implementar de manera tal que no deje inscribir un alumno en dos
materias iguales.) y otro método cantidadMaterias que devuelve la cantidad de materias a las
que está inscripto el alumno.
 * @author PC-Romina
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }
        @Override
    public boolean equals (Object obj){
    if (obj==null||!(obj instanceof Alumno))
        return false;
    
        else{
         Alumno viene =(Alumno)obj;
         return legajo==viene.getLegajo();
    }
    }        

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.legajo;
        return hash;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }

    public Alumno() {
    }
    public String agregarAlumno(Alumno alumno){
        
         if (frmMenu.getAlumnos().add(alumno)==true){
            frmMenu.getAlumnos().add(alumno);
            return "El alumno se inscribio correctamente: "+alumno.toString();
         }
         else{
             return "El alumno ya se encuentra inscripto";
         }
    }
    public void agregarMateria(Materia mat ,Alumno alu ){
        
         //
         HashSet <Materia> mi =new HashSet<>();
        if(alu.getMaterias()!=null)
         {
             mi.addAll(alu.getMaterias());
             if (alu.getMaterias().add(mat)==true)
             alu.setMaterias(mi);
             
         }
         else 
             alu.setMaterias(mi);
        
         if(alu!=null){
             if (alu.materias.add(mat)==true){
                JOptionPane.showMessageDialog(null,"Se ingreso con exito");
                alu.materias.add(mat);}
         
             else
                 JOptionPane.showMessageDialog(null,"El Alumnoya se encuentra inscripto ");
         }
         
//         if (materias.add(m)==true){
//            materias.add(m);
//            JOptionPane.showMessageDialog(null, "El alumno se inscribio correctamente");
//         
//         }
//         else{
//             JOptionPane.showMessageDialog(null,"El alumno ya se encuentra inscripto");
//         }
    }
    public int cantidadMaterias(int legajo){
        int cont=0;
        Iterator <Materia> m=materias.iterator();
            while (m.hasNext())
            {
                cont++;
            }    
            return cont;
    }

  

}

