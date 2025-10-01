package br.com.ex_26_set.domain;

public class Gerente extends Funcionario{

    private Double bonusPerformance;
    private Double comissao;

    public Gerente(String nome, String matricula, Double salarioBase) {
        super(nome, matricula, salarioBase);
        this.bonusPerformance = 0.0;
        this.comissao = 0.0;
    }


    public Double getBonusPerformance() {
        return bonusPerformance;
    }

    public void setBonusPerformance(Double bonusPerformance) {
        this.bonusPerformance = bonusPerformance;
    }

    public Double getComissao(){
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformance * comissao;
    }
}
