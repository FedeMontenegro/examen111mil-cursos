/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen111mil.cursos;

import java.util.List;

/**
 *
 * @author visita
 */
public class Alumno extends Persona{
    
    private int anioDeIngreso;
    private List <Curso> cursadas;

    public Alumno(String nombre, String apellido, int dni, int anioDeIngreso) {
        super(nombre, apellido, dni);
        this.anioDeIngreso = anioDeIngreso;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }
    
    public void addCurso (Curso curso){
        cursadas.add(curso);
    }
    
    
}
