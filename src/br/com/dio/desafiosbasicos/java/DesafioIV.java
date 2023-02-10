package br.com.dio.desafiosbasicos.java;

import java.util.Scanner;

public class DesafioIV {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int real = leitor.nextInt();

        if(real >= 1){
            int doces;
            doces = real*2;
            System.out.println(" O cliente obteve " + doces + " doces");
        }
    }
}
