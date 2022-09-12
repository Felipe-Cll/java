package letscode.java;

import java.util.Arrays;
import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String[] frutas = {"banana", "maçã", "abacaxi", "melão", "mamão"};
        
        System.out.println("Bem vindo ao supermercado, hoje temos as seguintes frutas em promoção: " + Arrays.toString(frutas));
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Qual fruta você deseja comprar hoje?");
        String produto = input.nextLine();

        if(Arrays.asList(frutas).contains(produto)) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Boa escolha! Volte sempre.");
        }

        input.close();
    }
}