package br.unipar;

public class Sobrescrita {


        public void fazerSom() {
            System.out.println("Som generico de um animal");
        }
    }

class Gato extends Sobrescrita {
        @Override
        public void fazerSom() {
            System.out.println("Miau!");
        }
    }

    class Vaca extends Sobrescrita {
        @Override
        public void fazerSom() {
            System.out.println("Muu!");
        }
    }


// a sobrescrita herda da clase pai os metados que serao utilizados na clase filho,
//exemplo temos varios animais mas so muda o som.
