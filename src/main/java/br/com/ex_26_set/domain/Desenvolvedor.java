package br.com.ex_26_set.domain;

public class Desenvolvedor extends Funcionario {

    private int horasExtras;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int horasExtras, Double valorHoraExtra){
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;

    }
    public void regitrarHoraExtra(int horas){
        this.horasExtras = horas + horasExtras;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + (valorHoraExtra * horasExtras);
    }
}
