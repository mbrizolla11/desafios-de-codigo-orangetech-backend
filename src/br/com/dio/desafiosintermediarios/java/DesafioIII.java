package br.com.dio.desafiosintermediarios.java;

import java.util.Scanner;

public class DesafioIII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String frase = leitor.next();
        String array[] = new String[3];

        String[] informacoes = frase.split("/");
        System.out.println("Imovel: " + informacoes[0] + " R$" +  informacoes[1] + " " + informacoes[2]);
    }
}
