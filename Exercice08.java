package com.afpa.java.exos;

import java.security.SecureRandom;

import static java.lang.Math.random;

/**
 * <Todo>       - Dans un tableau de 10 entiers, trouver les rangs du plus petit et du plus grand element,
 *              et afficher les rangs et leurs valeurs
 *
 * <@className> - Exercice08.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/27/17
 * <@time>      - 8:02 PM
 */

public class Exercice08 {
    public static void main(String[] args) {
        int tailleTableauEntiers = 10;
        int[] tableauEntiers = new int[tailleTableauEntiers];
        SecureRandom randomInteger = new SecureRandom();
        int indexMinimum = 0;
        int indexMaximum = 0;

        // Remplir le tableau avec des valeurs aléatoires
        for (int counter = 0; counter < tableauEntiers.length; counter++) {
            tableauEntiers[counter] = 1 + randomInteger.nextInt(100);
        }

        // loop for recuperer le rangMinimum et rangMaximum du tableau
        for (int i = 1; i < tableauEntiers.length; i++) {
            // Recupere le rang minimum
            if (tableauEntiers[indexMinimum] > tableauEntiers[i]) {
                indexMinimum = i;
            }

            // Recupere le rang maximal
            if (tableauEntiers[indexMaximum] < tableauEntiers[i]) {
                indexMaximum = i;
            }

        }

        // Affichage des rangs du plus petit et du plus grand element
        System.out.printf("Le plus grand element du tableau est [%d] et son rang est [%d]\n", tableauEntiers[indexMaximum], indexMaximum);
        System.out.printf("Le plus petit element du tableau est [%d] et son rang est [%d]\n", tableauEntiers[indexMinimum], indexMinimum);
    }
}
