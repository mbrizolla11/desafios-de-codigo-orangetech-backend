package br.com.dio.desafiosbasicos.java;

import java.util.Scanner;

public class DesafioI {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();
        int mesada = 50;

        if(entrada >=1){
            mesada = 50 * entrada;
            System.out.println(mesada);
        }
    }
}
