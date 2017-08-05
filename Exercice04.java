package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Todo         - Afficher la somme des nombres pairs de n à m.
 * <@classname> - Exercice04.java
 * <@author>    - cdi310
 * <@date>      - 27/07/2017
 * <@time>      - 15:40
 */

public class Exercice04 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Display to the user to enter the first integer
        System.out.print("Entrer un entier comme borne inférieure: ");
        Integer nombre1 = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Entrer un entier comme borne superieure: ");
        Integer nombre2 = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();
        inputStreamReader.close();

        int somme = 0;
        int temp;

        if (nombre1 > nombre2) {
            temp = nombre1;
            nombre1 = nombre2;
            nombre2 = temp;
        }

        // computes the sum of even number between nombre1 et nombre2
        for (int nombre = (nombre1 % 2 == 0 ? nombre1 : nombre1 + 1); nombre <= nombre2; nombre += 2) {
            somme += nombre;
        }

        // display the results
        System.out.printf("La somme des nombres pairs de %d à %d est: %d", nombre1, nombre2, somme);

        // En utilisant la fonction sommeDesNombresPairs
        System.out.printf("%n%nEn utilisant la fonction sommeDesNombrePairs%nLa somme des nombres pairs de %d à %d est: %.2f",
                nombre1,
                nombre2,
                sommeDesNombresPairs(nombre1, nombre2));

    }

    // fonction sommeDesNombresPairs calcule les nombres pairs de n à m
    private static double sommeDesNombresPairs(int borneInferieure, int borneSuperieure) {

        double somme = 0;

        // test de parité de la borne inferieure
        if (borneInferieure % 2 != 0) {
            borneInferieure++;
        }

        // calcul des nombre pairs de n à m
        for (int nombre = borneInferieure; nombre <= borneSuperieure; nombre += 2) {
            somme += nombre;
        }
        return somme;
    }
}
