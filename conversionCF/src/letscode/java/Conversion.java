package letscode.java;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) throws Exception {

        float grau;

        Scanner input = new Scanner (System.in);
        System.out.println("Digite uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
        grau = input.nextFloat();
        input.close();

        System.out.println("O equivalente a " + (int) grau + " C é "  + (( grau * 9 / 5 ) + 32 ) + " F.");
    }
}