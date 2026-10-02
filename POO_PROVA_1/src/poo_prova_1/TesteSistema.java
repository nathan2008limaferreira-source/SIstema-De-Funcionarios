/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_prova_1;

/**
 *
 * @author Nathan
 */
public class TesteSistema {
    public static void main(String[] args) {
        
        Departamento d1 = new Departamento("Compras");
        Departamento d2 = new Departamento("Vendas");
        
        Cargo c1 = new Cargo("Comprador");
        Cargo c2 = new Cargo("Vendedor");
        
        Funcionario f1 = new Funcionario("Joao ", "111.222.333-44 ",d1,c1, 2000.0);
        Funcionario f2 = new Funcionario("Maria ", "555.666.777-88 ", d2,c2, 3500.0);
        Funcionario f3 = new Funcionario();
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        
        f3.alterarDados("Nathan ", "150.816.616.19 ", d2, c2, 10000.0);
        System.out.println(f3.toString());
        
        f3.demitir();
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
    
}
