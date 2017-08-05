package com.afpa.java.exos;

/**
 * <@Todo>       - Inverser les éléments d'un tableau de 10 éléments (sans passer par un tableau intermédiaire).
 * <@className> - Exercice10.java
 *
 * <@author>    - ibrahimkelani
 * <@date>      - 7/27/17
 * <@time>      - 10:17 PM
 */

public class Exercice10 {
    public static void main(String[] args) {
        // declaration d'un tableau de 10 elements
        int[] tabEntiersPositifs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 13};
        int temp;

        // display array tabEntiersPositifs elements
        System.out.println("Le tableau de départ est: ");
        for (int value: tabEntiersPositifs) {
            System.out.print(value + "\t");
        }

        // Process to inverse the elements of tabEntiersPositifs
        for (int counter = 0; counter < tabEntiersPositifs.length / 2; counter++) {
            temp = tabEntiersPositifs[counter];
            tabEntiersPositifs[counter] = tabEntiersPositifs[tabEntiersPositifs.length - 1 - counter];
            tabEntiersPositifs[tabEntiersPositifs.length - 1 - counter] = temp;
        }

        // display array tabEntiersPositifs elements
        System.out.println("\nLe tableau inversé est: ");
        for (int value: tabEntiersPositifs) {
            System.out.print(value + "\t");
        }
    }
}
