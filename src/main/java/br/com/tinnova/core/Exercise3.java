package br.com.tinnova.core;

import javax.swing.*;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("Exercise three factorial ");

        String input;
        do {
            input = JOptionPane.showInputDialog("Enter a non-negative integer value: ");
            if (input == null) System.exit(0);
        } while (Integer.parseInt(input) < 0);

        int inputValue = Integer.parseInt(input);
        System.out.println( "Result: " + factorial(inputValue));

    }
    private static int factorial (int n){
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
}
