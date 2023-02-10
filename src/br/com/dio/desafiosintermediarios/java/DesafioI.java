package br.com.dio.desafiosintermediarios.java;

import java.util.Scanner;

public class DesafioI {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        String arquivoDoPc1 = ".mp3";

        if(arquivoDoPc.contains(arquivoDoPc1)){
            System.out.println("Salvar");
        }else{
            System.out.println("Deletar");
        }

    }
}
