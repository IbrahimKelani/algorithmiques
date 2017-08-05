package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Todo         - Dire si une valeur existe dans un tableau trié (séquentiel)
 * <@classname> - Exercice13_1.java
 * <@author>    - cdi310
 * <@date>      - 28/07/2017
 * <@time>      - 09:10
 */


public class Exercice13_1 {
    public static void main(String[] args) throws IOException {
        int tailleTab = 10;
        int[] tabEntiers = new int[tailleTab];
        SecureRandom randomInteger = new SecureRandom();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Remplir les tableaux avec des valeurs aléatoires
        for (int counter = 0; counter < tabEntiers.length; counter++) {
            tabEntiers[counter] = 1 + randomInteger.nextInt(100);
        }

        // Affichage des elements du tableau
        System.out.printf("%s%s\n", "Tableau: ", Arrays.toString(tabEntiers));

        // Display to the user to enter the value key to be searched
        System.out.print("Entrer l'entier à rechercher dans le tableau: ");
        Integer nombre = Integer.parseInt(bufferedReader.readLine());

        // Liberation des ressources
        bufferedReader.close();
        inputStreamReader.close();

        // recherche de l'existence du nombre entré par l'utilisateur
        int index = rechercheLineaire(tabEntiers, nombre);

        if (index != -1) {
            System.out.printf("%d existe dans le tableau à l'index %d", nombre, index + 1);
        } else {
            System.out.printf("%d n'existe pas dans le tableau", nombre);
        }
    }

    private static int rechercheLineaire(int[] donnees, int recherche) {
        // loop a travers le tableau donnees
        for (int index = 0; index < donnees.length; index++) {

            if (recherche == donnees[index]) {
                return index; // retour index de
            }
        }
        return -1 ;
    } // end method rechercheLineaire
}
