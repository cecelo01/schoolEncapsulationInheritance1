/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolencapsulationinheritance1;

/**
 *
 * @author Marce
 */
public class Pessoa {
    
    private String nome, sexo;
    private int idade;

    public String status() {
        return "Pessoa " + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade;
    }
    
    public void facerAniv(){
        this.setIdade(this.getIdade()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
