//Faça um programa que receba um número, esse será o número "base"
//Depois faça o usuário entrar com mais dois números
//Retorne qual dos dois últimos números está mais perto do primeiro número "base"

package metodos;

import java.util.Scanner;

public class Exer10 {


    public static int numeroMaisPerto(int base, int num1, int num2) {
        if (base - num1 > base - num2 || base - num2 > base - num1)
            return num1;

        else return num2;

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o valor da base");
        int valorBase = entrada.nextInt();
        System.out.println("Insira o primeiro valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Insira o segundo valor: ");
        int valor2 = entrada.nextInt();


        int valorPerto = numeroMaisPerto(valorBase, valor1, valor2);
        System.out.println("O valor mais próximo da base é: " + valorPerto);

    }
}
