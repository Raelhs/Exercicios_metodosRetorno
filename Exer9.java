//Faça um programa que receba 2 números do usuário.
//Faça um método que descubra qual dos números é maior e retorne esse valor.
//Se os dois números forem iguais, retorne: número iguais.

package metodos;

import java.util.Scanner;

public class Exer9 {


    public static int descobrirNumeros(int num1, int num2) {
        int descobreMaior = 0;
        String iguais = "Os valores são iguais";
        if (num1 > num2)
            descobreMaior = num1;
        else if (num2 > num1)
            descobreMaior = num2;
        else if (num1 == num2) {
            System.out.println(iguais);
        }
        return descobreMaior;
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Insira o primeiro valor: ");
        int numero1 = entrada.nextInt();
        System.out.println("Insira o segundo valor: ");
        int numero2 = entrada.nextInt();

        System.out.println("O maior número é: " + descobrirNumeros(numero1, numero2));


    }


}
