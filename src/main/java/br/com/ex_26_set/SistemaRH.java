package br.com.ex_26_set;

import br.com.ex_26_set.domain.Desenvolvedor;
import br.com.ex_26_set.domain.Estagiario;
import br.com.ex_26_set.domain.Funcionario;
import br.com.ex_26_set.domain.Gerente;

public class SistemaRH {

    public static void main(String[]args){

        //Criando Funcionários - POLIMORFISMO
        Funcionario[] funcionario = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor (
                "Ana",
                "DEV001",
                5000,
                50,
                145.00);

        dev.regitrarHoraExtra(10);
        funcionario[0] = dev;

        Gerente gerente = new Gerente("Carlos", "GER001", 8000.0);
        gerente.setBonusPerformance(1000.0);
        gerente.setComissao(500.0);
        funcionario[1] = gerente;


        Estagiario estagiario = new Estagiario("Pedro", "EST001", 15.00);
        estagiario.registrarHoras(35);
        funcionario[2] = estagiario;

        // Processamento folha de pagamento
        System.out.println("=== FOLHA DE PAGAMENTO ===");
        double totalFolha = 0;

        for (Funcionario func : funcionario){
            func.exibirDados();
            totalFolha += func.calcularSalario();
            System.out.println("---");
        }

        System.out.println("TOTAL DA FOLHA: R$ " + totalFolha);

        System.out.println("\n=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        for (Funcionario func : funcionario){
            System.out.println(func.getNome() + " - Salário: R$ " + func.calcularSalario());
        }
    }
}

