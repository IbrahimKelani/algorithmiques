package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Todo         - Lire n nombres et en calculer la moyenne.
 * <@classname> - Exercice07.java
 * <@author>    - cdi310
 * <@date>      - 27/07/2017
 * <@time>      - 16:37
 */

public class Exercice07 {
    public static void main(String[] args) throws IOException {
        int nombre;
        double somme = 0.00;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Entrer le nombre de valeurs que vous desirez saisir: ");
        nombre = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= nombre; i++) {
            System.out.printf( "Saisissez l'entier %d: ", i);

            // lit l'entree utilisateur et l'ajoute à somme
            somme += Integer.valueOf(bufferedReader.readLine());
        }

        bufferedReader.close();
        inputStreamReader.close();

        // Display the result
        System.out.printf("La moyenne des entiers saisis est: %.2f",  somme / nombre);

    }
}
