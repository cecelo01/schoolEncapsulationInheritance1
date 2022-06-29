/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolencapsulationinheritance1;

/**
 *
 * @author Marce
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    private boolean trabalhando;

    public String status() {
        return "Pessoa " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + 
                ", idade= " + this.getIdade() +" ||| Funcionario " + "setor= " + setor + ", trabalhando= " + trabalhando;
    }
    
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
    
}
