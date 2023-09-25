//Faça um programa em que o usuário entra com um número de 1 a 4
//Com o número 1 sendo verão, 2 sendo outono...
//Dependendo de o que o usuário informa, retorne:
//
//É verão
//E o tempo está quente.
//
//Ou
//
//É inverno
//E está frio.
//
//Faça um método para cada estação do ano


package metodos;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.println("Digite um número de 1 a 4 para representar a estação do ano:");
                int numeroEstacao = scanner.nextInt();

                switch (numeroEstacao) {
                    case 1:
                        exibirMensagemVerao();
                        break;
                    case 2:
                        exibirMensagemOutono();
                        break;
                    case 3:
                        exibirMensagemInverno();
                        break;
                    case 4:
                        exibirMensagemPrimavera();
                        break;
                    default:
                        System.out.println("Número inválido. Por favor, digite um número de 1 a 4.");
                }

                scanner.close();
            }

            public static void exibirMensagemVerao() {
                System.out.println("É verão");
                System.out.println("E o tempo está quente.");
            }

            public static void exibirMensagemOutono() {
                System.out.println("É outono");
                System.out.println("E o tempo está ameno.");
            }

            public static void exibirMensagemInverno() {
                System.out.println("É inverno");
                System.out.println("E está frio.");
            }

            public static void exibirMensagemPrimavera() {
                System.out.println("É primavera");
                System.out.println("E o tempo está agradável.");
            }
        }