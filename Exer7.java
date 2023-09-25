//Faça um programa que descubra
//a) O maior elemento de um vetor.
//b) O menor elemento.
//c) A média dos valores


package metodos;

import java.util.Scanner;

public class Exer7 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);



            int[] vetor = {5,10,15,20,25,30};



            int maior = encontrarMaiorElemento(vetor);
            int menor = encontrarMenorElemento(vetor);
            double media = calcularMedia(vetor);

            System.out.println("O maior elemento é: " + maior);
            System.out.println("O menor elemento é: " + menor);
            System.out.println("A média dos valores é: " + media);

            scanner.close();
        }

        public static int encontrarMaiorElemento(int[] vetor) {
            int maior = vetor[0];
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
            return maior;
        }

        public static int encontrarMenorElemento(int[] vetor) {
            int menor = vetor[0];
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
            return menor;
        }

        public static double calcularMedia(int[] vetor) {
            double soma = 0;
            for (int valor : vetor) {
                soma += valor;
            }
            return soma / vetor.length;
        }
    }