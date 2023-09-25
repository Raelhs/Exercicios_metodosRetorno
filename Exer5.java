//Faça um método que calcule o perímetro e outro que calcule a área de um retângulo.
//Retornar os valores calculados

package metodos;

import java.util.Scanner;

public class Exer5 {

    public static double calculaArea(double valorBase, double valorAltura) {
        double calculoArea = valorBase * valorAltura;

        return calculoArea;
    }

    public static double calculaPerimetro(double valorA, double valorB) {
        double calculoPerimetro = (valorA * 2) + (valorB * 2);

        return calculoPerimetro;

    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor da base: ");
        double valorBase = entrada.nextDouble();
        System.out.println("Insira o valor da altura: ");
        double valorAltura = entrada.nextDouble();


        System.out.println("O cálculo da área é: " + calculaArea(valorBase, valorAltura));
        System.out.println("O cálculo do perímetro é: " + calculaPerimetro(valorBase, valorAltura));

    }


}
