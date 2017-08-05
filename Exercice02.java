package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Todo         - Afficher la somme des nombres de 1 à 10.
 * <@classname> - Exercice02.java
 * <@author>    - cdi310
 * <@date>      - 27/07/2017
 * <@time>      - 14:52
 */


public class Exercice02 {
    public static void main(String[] args) throws IOException {
        int dix = 10;
        int somme = 0;

        for (int nombre = 0; nombre <= 10 ; nombre++) {
            somme += nombre;
        }

        System.out.printf( "La somme des nombres de 1 à 10 est: %d", somme);

        // en utilisant la fonction sommeDesNombres
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Display to the user to enter the first integer
        System.out.printf("%n%nEntrer un entier comme borne inférieure: ");
        Integer nombre1 = Integer.parseInt(bufferedReader.readLine());

        System.out.print("Entrer un entier comme borne superieure: ");
        Integer nombre2 = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();
        inputStreamReader.close();

        // Affichage de la somme de nombres compris entre deux entiers entrés par l'utilisateur
        System.out.printf( "La somme des nombres de %d à %d est: %.2f", nombre1, nombre2, sommeDesNombres(nombre1, nombre2));
    }

    private static double sommeDesNombres(int borneInferieure, int borneSuperieure) {
        double somme = 0;
        for (int nombre = borneInferieure; nombre <= borneSuperieure; nombre++) {
             somme += nombre;
        }
        return somme;
    }
}
