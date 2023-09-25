//Faça um programa que receba 3 notas do usuário e informe a média dessas notas.
//
//Retorne a média

package metodos;

import java.util.Scanner;

public class Exer6 {


    public static double calculaMediaNotas(double nota1, double nota2, double nota3) {
        double resultadoMedia = (nota1 + nota2 + nota3) / 3;

        return resultadoMedia;
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = entrada.nextInt();
        System.out.println("Insira a segunda nota: ");
        double nota2 = entrada.nextInt();
        System.out.println("Insira a terceira nota: ");
        double nota3 = entrada.nextInt();


        System.out.println("O resultado da média é: " + calculaMediaNotas(nota1, nota2, nota3));

    }


}
