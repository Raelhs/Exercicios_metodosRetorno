//Faça um método booleano que retorne true se o número passado como parâmetro seja par.
//Retorno false caso seja impar.
package metodos;

import java.util.Scanner;

public class Exer3 {

    public static boolean numeroParOuImpar(int numero) {
        return numero % 2 == 0;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        System.out.println(numeroParOuImpar(numero));

    }


}




