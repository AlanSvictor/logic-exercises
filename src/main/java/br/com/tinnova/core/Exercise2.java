package br.com.tinnova.core;

import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        int []v = {5, 3, 2, 4, 7, 1, 0, 6};
        System.out.println("Exercise two Bubble sort " + System.lineSeparator() + "Initial Vector " + Arrays.toString(v));

        bubbleSort(v);
        System.out.println("ascending order: " + Arrays.toString(v));

        bubbleSort(v, false);
        System.out.println("descending order: " + Arrays.toString(v));

    }

    private static void bubbleSort(int[] v) {
        bubbleSort(v, true);
    }

    private static void bubbleSort(int[] v, boolean asc) {
        for (int last = v.length - 1; last > 0; last--){
            for (int i = 0; i < last ; i++) {
                if (asc) {
                    if (v[i] > v[i+1] )
                        change(v, i, i+1);
                } else {
                    if (v[i] < v[i+1] )
                        change(v, i, i+1);
                }
            }
        }
    }

    private static void change(int[] v, int i, int ii) {
        int aux = v[i];
        v[i] = v[ii];
        v[ii] = aux;
    }
}
