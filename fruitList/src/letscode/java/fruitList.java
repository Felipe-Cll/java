package letscode.java;

import java.util.Scanner;

public class fruitList {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        
        System.out.println("Insira a sua lista de compras: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        System.out.println("As frutas no seu carrinho são: ");
        for ( int i = 0 ; i < names.length ; i++ ) {
            System.out.print(names[i] + ", ");
        }

        input.close();
    }
}