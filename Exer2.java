//Faça um método que receba 4 números como parâmetros, some os 4 números.
//
//Retorne a soma

package metodos;

import java.util.Scanner;

public class Exer2 {


            public static int somaQuatroNumeros(int num1, int num2, int num3, int num4) {
                int soma = num1 + num2 + num3 + num4;
                return soma;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.println("Digite o segundo número: ");
                int num2 = scanner.nextInt();

                System.out.println("Digite o terceiro número: ");
                int num3 = scanner.nextInt();

                System.out.println("Digite o quarto número: ");
                int num4 = scanner.nextInt();

                int resultado = somaQuatroNumeros(num1, num2, num3, num4);
                System.out.println("A soma dos quatro números é: " + resultado);

                scanner.close();
            }
        }