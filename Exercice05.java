package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Todo         - Lire 10 nombres et trouver le plus grand.
 * <@classname> - Exercice05.java
 * <@author>    - cdi310
 * <@date>      - 27/07/2017
 * <@time>      - 15:55
 */


public class Exercice05 {
    public static void main(String[] args) throws IOException {
        int nombreUtilisateur;
        int maximum;
        int nombreEntiers = 10;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.print("Entrez votre 1ere valeur: ");
        maximum = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i < nombreEntiers; i++) {
            System.out.printf("Entrez votre %deme valeur: ", i + 1);

            nombreUtilisateur = Integer.parseInt(bufferedReader.readLine());

            // recupere le maximum sur les iterations successives
            if (nombreUtilisateur > maximum) {
                maximum = nombreUtilisateur;
            }
        }

        bufferedReader.close();
        inputStreamReader.close();

        // Affichage du plus grand nombre
        System.out.println("La valeur maximale du tableau est: " + maximum);
    }

    // fontion de lecture de
}
