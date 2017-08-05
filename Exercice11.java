package com.afpa.java.exos;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * <@Todo>       - Trier un tableau de 10 éléments par ordre croissant.
 * <@className> - Exercice11.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/27/17
 * <@time>      - 10:21 PM
 */

public class Exercice11 {
    public static void main(String[] args) {
        int tailleTableauEntiers = 10;
        int[] tableauEntiers = new int[tailleTableauEntiers];
        SecureRandom randomInteger = new SecureRandom();
        int indexEntierMinimal;

        int temp;

        // Remplir le tableau avec des valeurs aléatoires
        for (int counter = 0; counter < tableauEntiers.length; counter++) {
            tableauEntiers[counter] = 1 + randomInteger.nextInt(100);
        }

        System.out.println("Le tableau d'origine:");
        System.out.println(Arrays.toString(tableauEntiers));

        // Tri des elements du tableau dans un ordre croissant
        for (int compteurtabEntiers = 0; compteurtabEntiers < tableauEntiers.length; compteurtabEntiers++) {

            indexEntierMinimal = compteurtabEntiers;

            // loop pour rechercher l'index du plus petit element
            for (int index = compteurtabEntiers + 1; index < tableauEntiers.length; index++) {
                if (tableauEntiers[index] < tableauEntiers[indexEntierMinimal]) {
                    indexEntierMinimal = index;
                }
            }

            // permutation des elements adjacents
            temp = tableauEntiers[compteurtabEntiers];
            tableauEntiers[compteurtabEntiers] = tableauEntiers[indexEntierMinimal];
            tableauEntiers[indexEntierMinimal] = temp;

        }

        // sort tableauEntiers in ascending order
        // Arrays.sort(tableauEntiers);

        System.out.println("Les éléments du tableau triés par ordre croissant sont:");
        System.out.println(Arrays.toString(tableauEntiers));

    }
}
