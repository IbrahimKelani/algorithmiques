package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Todo         - Lire 10 nombres et trouver le plus petit et son rang.
 * <@classname> - Exercice06.java
 * <@author>    - cdi310
 * <@date>      - 27/07/2017
 * <@time>      - 16:25
 */


public class Exercice06 {
    public static void main(String[] args) throws IOException {
        int[] nombres = new int[10];
        int indexValeurMinimale = 0;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < nombres.length; i++) {
            int nombre = nombres[i];
            System.out.print("Entrez une valeur: ");
            nombres[i] = Integer.parseInt(bufferedReader.readLine());
        }

        bufferedReader.close();
        inputStreamReader.close();

        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i] < nombres[indexValeurMinimale]) {
                indexValeurMinimale = i;
            }
        }
        System.out.println("La valeur minimale du tableau est: " + nombres[indexValeurMinimale]);
        System.out.println("Son rang est: " + indexValeurMinimale + 1);
    }

    // method getMinimalValueIndex returns index of the lowest value in an array
    private static int getMinimalValueIndex(int[] nombres) {
        int indexValeurMinimale = 0;

        for (int i = 1; i < nombres.length; i++) {
            if (nombres[i] < nombres[indexValeurMinimale]) {
                indexValeurMinimale = i;
            }
        }
        return indexValeurMinimale;
    } // end method getMinimalValueIndex
}

