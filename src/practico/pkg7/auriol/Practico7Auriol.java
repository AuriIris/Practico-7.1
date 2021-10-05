/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg7.auriol;

/**
 *
 * @author PC-Romina
 */
public class Practico7Auriol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Materia m1=new Materia(1,"Ingles 1", 1);
       Materia m2=new Materia(2,"Matemáticas", 1);
       Materia m3=new Materia(3,"Laboratorio 1", 1);
       frmMenu.getMaterias().add(m1);
       frmMenu.getMaterias().add(m2);
       frmMenu.getMaterias().add(m3);
       Alumno a1=new Alumno(1001,"Lopez", "Martin");
       Alumno a2=new Alumno(1002,"Martinez", "Brenda");
       frmMenu.getAlumnos().add(a2);
       frmMenu.getAlumnos().add(a1);
       a1.agregarMateria(m1, a1);
       a1.agregarMateria(m2, a1);
       a1.agregarMateria(m3, a1);
       a2.agregarMateria(m1, a2);
       a2.agregarMateria(m2, a2);
       a2.agregarMateria(m3, a2);
       a2.agregarMateria(m3, a2);
           
       
    }
    
}
