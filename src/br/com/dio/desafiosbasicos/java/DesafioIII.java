package br.com.dio.desafiosbasicos.java;

import java.util.Scanner;

public class DesafioIII {
    public class Program {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            int paginas = leitor.nextInt();
            int paginasLidas = 3;

            if (paginas != 0) {
                int diasLeitura;
                diasLeitura = paginas / 3;
                System.out.println(diasLeitura + " dias ");
            }
        }
    }
}
