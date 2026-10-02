/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_prova_1;

/**
 *
 * @author Nathan
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private Departamento departamento;
    private Cargo cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, Departamento departamento, Cargo cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    public Funcionario() {
        this.nome = "indefinido";
        this.cpf = "000.000.000-00";
        this.departamento = null;
        this.cargo = null;
        this.salario = 0.0;
        this.ativo = false;
    }
    
    public void alterarDados(String nome, String cpf, Departamento departamento,Cargo cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }    
    public void aplicarReajuste(double percentual) {
        this.salario = this.salario * (percentual / 100.0);
    }
    
    public void demitir(){
        this.ativo = false;
    }

  @Override
public String toString() {
    String status = this.ativo ? "ATIVO" : "INATIVO";
    
    String nomeDepto = (this.departamento != null) ? this.departamento.getNome() : "Departamento nao Definido";
    
    String nomeCargo = (this.cargo != null) ? this.cargo.getNome() : "Cargo nao Definido";

    return "Nome: " + this.nome + "CPF: " + this.cpf + " Status: " + status + " Departamento: " + nomeDepto + " Cargo: " + nomeCargo + " Salario: R$ " + this.salario;
}
 }

