package br.com.ex_26_set.domain;


public class Estagiario extends Funcionario{


    private int horasTrabalhadas;
    private Double valoresHorasTrabalhadas;


    public Estagiario(String nome, String matricula, Double valoresHorasTrabalhadas) {
        super(nome, matricula, 0.0);
        this.horasTrabalhadas = 0;
        this.valoresHorasTrabalhadas = valoresHorasTrabalhadas;
    }


    public void registrarHoras(int horasTrabalhadas){
        this.horasTrabalhadas += horasTrabalhadas;
    }


    @Override
    public double calcularSalario() {
        return 0;
    }
}
