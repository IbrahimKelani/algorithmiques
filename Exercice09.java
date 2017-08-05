package com.afpa.java.exos;

import java.security.SecureRandom;

/**
 * <@Todo>       - Dans un tableau de 10 entiers, afficher :
 *                   - le plus grand et sa position,
 *                   - la moyenne des entiers,
 *                   - les nombres inférieurs à la moyenne
 *
 * <@className> - Exercice09.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/27/17
 * <@time>      - 9:16 PM
 */

public class Exercice09 {
    public static void main(String[] args) {
        int tailleTableauEntiers = 10;
        int[] tableauEntiers = new int[tailleTableauEntiers];
        SecureRandom randomInteger = new SecureRandom();
        int indexMinimum = 0;
        int indexMaximum = 0;
        double somme = 0;

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

            // Recupere le rang minimum
            if (tableauEntiers[indexMaximum] < tableauEntiers[i]) {
                indexMaximum = i;
            }

            somme += tableauEntiers[i];
        }

        double moyenne = somme / tableauEntiers.length;

        // Affichage des rangs du plus petit et du plus grand element
        System.out.printf("Le plus grand element du tableau est [%d] et son rang est [%d]\n", tableauEntiers[indexMaximum], indexMaximum);
        System.out.printf("Le plus petit element du tableau est [%d] et son rang est [%d]\n", tableauEntiers[indexMinimum], indexMinimum);
        System.out.printf("La moyenne des elements du tableau est [%.2f]\n", moyenne);

        System.out.print("Les éléments du tableau inférieurs à la moyenne sont: ");
        for (int entier : tableauEntiers) {
            if (entier < moyenne) {
                System.out.print(entier + " ");
            }
        }
    }
}

