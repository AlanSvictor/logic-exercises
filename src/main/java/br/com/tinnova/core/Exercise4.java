package br.com.tinnova.core;

import javax.swing.*;
import java.util.stream.IntStream;

public class Exercise4 {
    public static void main(String[] args) {

        System.out.println("Exercise four sum of multiples of 3 and 5 ");

        String input;
        do {
            input = JOptionPane.showInputDialog("Enter a non-negative integer value: ");
            if (input == null) System.exit(0);
        } while (Integer.parseInt(input) < 0);

        final int sum = IntStream.range(1, Integer.parseInt(input))
                .filter(i -> (i % 3 == 0) || (i % 5 == 0))
                .sum();

        System.out.println("Result: " + sum);
    }
}
