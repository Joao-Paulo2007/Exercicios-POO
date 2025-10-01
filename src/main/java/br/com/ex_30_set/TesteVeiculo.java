package br.com.ex_30_set;

import br.com.ex_30_set.domain.Carro;
import br.com.ex_30_set.domain.Moto;
import br.com.ex_30_set.domain.Veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true)
        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(70);
            if (veiculo instanceof Moto) {
                ((Moto) veiculo).empinar();
            }
            if (veiculo instanceof Carro) {
                ((Carro) veiculo).abrirPortaMalas();
            }
            System.out.println("---");
        }
    }
}