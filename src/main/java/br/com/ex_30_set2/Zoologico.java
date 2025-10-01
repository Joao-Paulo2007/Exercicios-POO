package br.com.ex_30_set2;

import br.com.ex_30_set2.domain.Animal;
import br.com.ex_30_set2.domain.Cachorro;
import br.com.ex_30_set2.domain.Gato;
import br.com.ex_30_set2.domain.Passaro;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Rex", 3, "Labrador"),
                new Gato("Mimi", 2, true),
                new Passaro("Piu", 1, 15.5)
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMACOES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();

            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
            }
            System.out.println("---");
        }
    }
}