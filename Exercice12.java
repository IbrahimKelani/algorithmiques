package com.afpa.java.exos;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * <@Todo>      - Fusionner deux tableaux déjà triés par ordre croissant.
 * <@className> - Exercice12.java
 * <p>
 * <@author>    - ibrahimkelani
 * <@date>      - 7/27/17
 * <@time>      - 10:27 PM
 */

public class Exercice12 {
    public static void main(String[] args) {
        int tailleTab1 = 5;
        int tailleTab2 = 7;

        int[] tab1Entiers = new int[tailleTab1];
        int[] tab2Entiers = new int[tailleTab2];
        int[] tabFusionne = new int[tailleTab1 + tailleTab2];
        SecureRandom randomInteger = new SecureRandom();

        int indexTab1 = 0;
        int indexTab2 = 0;
        int indexTabFusionne = 0;

        // Remplir les tableaux avec des valeurs aléatoires
        for (int counter = 0; counter < tab1Entiers.length; counter++) {
            tab1Entiers[counter] = 1 + randomInteger.nextInt(100);
        }

        for (int counter = 0; counter < tab2Entiers.length; counter++) {
            tab2Entiers[counter] = 1 + randomInteger.nextInt(100);
        }

        // Sort both arrays
        Arrays.sort(tab1Entiers);
        Arrays.sort(tab2Entiers);

        while (indexTab1 < tab1Entiers.length && indexTab2 < tab2Entiers.length) {
            if (tab1Entiers[indexTab1] < tab2Entiers[indexTab2]) {
                tabFusionne[indexTabFusionne] = tab1Entiers[indexTab1];
                indexTab1++;
            } else {
                tabFusionne[indexTabFusionne] = tab2Entiers[indexTab2];
                indexTab2++;
            }

            indexTabFusionne++;
        } // end while

        while (indexTab1 < tab1Entiers.length) {
            tabFusionne[indexTabFusionne++] = tab1Entiers[indexTab1++];
        }

        while (indexTab2 < tab2Entiers.length) {
            tabFusionne[indexTabFusionne++] = tab2Entiers[indexTab2++];
        }

        for (int entier : tabFusionne) {
            System.out.print(entier + " ");
        }
    }
}
