/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg7.auriol;

import javax.swing.JOptionPane;

/**
 *La Materia tiene un idMateria, un nombre de la materia y año al que pertenece, tiene
además un constructor que inicializa sus propiedades y métodos get y set para cada uno de sus
atributos.

 * @author PC-Romina
 */
public class Materia  {
    private int idMateria;
    private String materia;
    private int año;

    public Materia() {
        
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", materia=" + materia + ", a\u00f1o=" + año + '}';
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public int getAño() {
        return año;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Materia(int idMateria, String materia, int año) {
        this.idMateria = idMateria;
        this.materia = materia;
        this.año = año;
    }
 public String agregarMateria(Materia materia){
        
         if (frmMenu.getMaterias().add(materia)==true){
            frmMenu.getMaterias().add(materia);
          return "La materia se agrego correctamente" + materia.toString();
         }
         else{
             return "La materia ya se encuentra cargada";
         }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idMateria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }
    }

