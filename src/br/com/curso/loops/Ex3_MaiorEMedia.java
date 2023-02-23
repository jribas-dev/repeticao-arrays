package br.com.curso.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count++;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + Double.valueOf(soma / 5.00));

    }
}
