package br.com.dio.desafiosintermediarios.java;

import java.util.Scanner;

public class DesafioII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        multas = velocidade > 80 ? ++multas : multas;

        if(multas >= 3) System.out.println(multas + " multas. Levou pontos na carteira");
        else System.out.println(multas + " multas. Nao levou pontos na carteira");

    }
}
