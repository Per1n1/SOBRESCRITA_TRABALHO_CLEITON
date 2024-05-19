package br.unipar;

    public class Main {
        public static void main(String[] args) {
            Sobrecarga calc = new Sobrecarga();


            int resultado1 = calc.somar(5, 10);
            int resultado2 = calc.somar(5, 10, 15);
            double resultado3 = calc.somar(3.5, 2.7);

            System.out.println("Resultado 1: " + resultado1);
            System.out.println("Resultado 2: " + resultado2);
            System.out.println("Resultado 3: " + resultado3);
        }
    }

