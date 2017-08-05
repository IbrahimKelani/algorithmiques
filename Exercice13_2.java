package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Todo         - Dire si une valeur existe dans un tableau trié (dichotomique)
 * <@classname> - Exercice13_2.java
 * <@author>    - cdi310
 * <@date>      - 28/07/2017
 * <@time>      - 09:15
 */


public class Exercice13_2 {
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

        // Attention: une recherche binaire ou dichotmique se fait toujours sur un tableau trié
        // Trier tabEntiers
        Arrays.sort(tabEntiers);

        // Affichage des elements du tableau
        System.out.printf("%s%s\n", "Tableau: ", Arrays.toString(tabEntiers));

        // Display to the user to enter the value key to be searched
        System.out.print("Entrer l'entier à rechercher dans le tableau: ");
        Integer nombre = Integer.parseInt(bufferedReader.readLine());

        // Liberation des ressources
        bufferedReader.close();
        inputStreamReader.close();

        // recherche de l'existence du nombre entré par l'utilisateur
        int index = rechercheDichotomique(tabEntiers, nombre);

        if (index != -1) {
            System.out.printf("%d existe dans le tableau à l'index %d\n", nombre, index + 1);
        } else {
            System.out.printf("%d n'existe pas dans le tableau", nombre);
        }
    }

    private static int rechercheDichotomique(int[] donnees, int valeurRecherchee) {
        int borneInferieure = 0;
        int borneSuperieure = donnees.length;
        int milieu = (borneInferieure + borneSuperieure) / 2;
        int indexEntierTrouve = -1;

        do { // loop pour rechercher le nombre
            // Si l'element recherché est trouvé au milieu
            if (valeurRecherchee == donnees[milieu]){
                indexEntierTrouve = milieu;
            } else if (valeurRecherchee > donnees[milieu]) {
                borneInferieure = milieu + 1; // On elimine la moitie basse du tableau
            } else {
                borneSuperieure = milieu - 1; // On elimine la moitie haute du tableau
            }
            milieu = (borneInferieure + borneSuperieure) / 2;
        } while ((borneInferieure < borneSuperieure) && (indexEntierTrouve == -1) );

        return indexEntierTrouve;
    } // end method rechercheLineaire
}
