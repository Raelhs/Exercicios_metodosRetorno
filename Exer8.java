//Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário
//
//Por exemplo:
//
//Usuário inseriu o limite máximo como 100.
//Usuário inseriu o limite mínimo como 70.
//
//Depois ele inseriu o número 80.
//O retorno deve ser: 80 está nos limites impostos.

package metodos;

import java.util.Scanner;

public class Exer8 {


    public static int descobreDentro(int limiteMinimo, int limiteMaximo, int numero) {
        int numeroDentro = 0;

        if (numero >= limiteMinimo && numero <= limiteMaximo)
            numeroDentro += numero;
        return numeroDentro;
    }

    public static int descobreFora(int limiteMinimo, int limiteMaximo, int numero) {
        int numeroFora = 0;

        if (numero < limiteMinimo || numero > limiteMaximo)
            numeroFora += numero;

        return numeroFora;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o limite mínimo: ");
        int limiteMinimo = entrada.nextInt();
        System.out.println("Insira o limite máximo: ");
        int limiteMaximo = entrada.nextInt();
        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();


        System.out.println("O número " + descobreDentro(limiteMinimo, limiteMaximo, numero) + " está nos limites");

        System.out.println("O número " + descobreFora(limiteMinimo, limiteMaximo, numero) + " está fora dos limites");

    }
}
