/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolencapsulationinheritance1;

/**
 *
 * @author Marce
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;

    public String status() {
        return "Pessoa " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + 
                ", idade= " + this.getIdade()+" ||| Professor " + "especialidade=" + especialidade + ", salario=" + salario;
    }
    
    public void receberAument(float s){
        this.setSalario(this.getSalario()+s);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
