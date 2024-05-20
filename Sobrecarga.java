package br.unipar;

public class Sobrecarga {

        public int somar(int a, int b) {
            return a + b;
        }


        public int somar(int a, int b, int c) {
            return a + b + c;
        }


        public double somar(double a, double b) {
            return a + b;
        }
    }


// a gente diminui a criacao de novos metodos o que faz com que o codigo seja mais curto e assim evita o retrabalho,
// mas o lado ruim e que fica mas comfuso de entender o metodo pois o mesmo metado esta fazendo varias coisas ao mesmo tempo.
