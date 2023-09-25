//Faça um programa que calcule o quadrado de um número caso esse número seja par
//E calcule o dobro desse número caso esse número seja ímpar.
//
//
//Retorne o resultado


package metodos;

import java.util.Scanner;

public class Exer4 {

    public static int calculaNumero(int numero) {
        int resultado = 0;
        if (numero % 2 == 0) {
            resultado = numero * numero;
        }

        if (numero % 2 == 1)
            resultado = numero * 2;

        return resultado;

    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        System.out.println(calculaNumero(numero));


    }
}
