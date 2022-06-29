/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolencapsulationinheritance1;

/**
 *
 * @author Marce
 */
public class Aluno extends Pessoa{
    
    private String materia, curso;

    public void cancelarMateria(){
        this.setMateria("Cancelada");
    }


    public String status() {
        return "Pessoa " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + 
                ", idade= " + this.getIdade() +" ||| Aluno " + "materia= " + materia + ", curso= " + curso;
    }
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}
