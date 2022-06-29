/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolencapsulationinheritance1;

/**
 *
 * @author Marce
 */
public class SchoolEncapsulationInheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Jaum");
        p2.setNome("Vitu");
        p3.setNome("Paloma");
        p4.setNome("Tamara");
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        
        System.out.println(p1.status());
        System.out.println(p2.status());
        System.out.println(p3.status());
        System.out.println(p4.status());
    }
    
}
