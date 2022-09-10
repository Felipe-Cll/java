package letscode.java;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        
        int number;
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número: ");
        number = input.nextInt();
        input.close();

        System.out.printf("\n--- Tabuada do número %d ---\n", number);

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
        
        System.out.printf("\n----------- Fim -----------\n");
    }
}