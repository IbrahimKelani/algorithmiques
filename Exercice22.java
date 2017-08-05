package com.afpa.java.exos;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <@Todo>      - Découper une chaîne de caractères en mots avec l'espace comme séparateur et les compter.
 *
 * <@className> - Exercice22.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/30/17
 * <@time>      - 12:14 PM
 */

public class Exercice22 {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String string = "Découper une chaîne de caractères en mots avec l'espace comme séparateur et les compter.";

        // Display to the user to enter the first integer
        System.out.println("Saisissez une phrase: ");
        string = bufferedReader.readLine();

        // deallocate ressource by closing bufferReader and inputStreamReader
        bufferedReader.close();
        inputStreamReader.close();

        int nombreDeMots = getNumberOfWords(string);

        char mots[][] = new char[nombreDeMots + 1][];

        mots = getWordsFromString(string);

        System.out.println("Le nombre total de mots dans la chaine est " + nombreDeMots);

        for (int i = 0; i < nombreDeMots; i++) {
            System.out.println(" ");
            for (int j = 0; j < mots[i].length ; j++) {
                System.out.print(mots[i][j]); // print out each char one by one
            }
        }
    }

    // getNumberOfWords returns the number of words in a string
    private static int getNumberOfWords(String phrase) {
        int compteurMots = 0;

        for (int counter = 0; counter < phrase.length(); counter++) {
            if (phrase.charAt(counter) == ' ') {
                compteurMots++;
            }
        }
        return compteurMots + 1;
    }

    // Method getSubString returns substring, replacement of String.substring()
    private static char[] getSubString(String phrase, int debut, int fin) {

        int counter = 0;

        char tabCaracteresARetourner[] = new char[fin - debut];

        for (int i = debut; i < fin; i++) {
            tabCaracteresARetourner[counter++] = phrase.charAt(i);
        }
        return tabCaracteresARetourner;
    }

    // Method getWordsFromString returns words from a sentence
    private static char[][] getWordsFromString(String phrase) {
        int compteurMots = 0;
        int indexEspace = 0;
        int longueurPhrase = phrase.length();

        char [][] tableauDeMots = new char[getNumberOfWords(phrase)][];

        // loop to fill tableauDeMots
        for (int i = 0; i < longueurPhrase; i++) {

            if ((phrase.charAt(i) == ' ') || (i + 1 == longueurPhrase)) {
                // get each word as substring
                tableauDeMots[compteurMots++] = getSubString(phrase, indexEspace, i + 1);

                // incremente indexEspace
                indexEspace = i + 1;
            }
        }

        return tableauDeMots; // return the 2 dimensional char array
    }
}
