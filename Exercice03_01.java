package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Todo         - Afficher les nombres de n à m.
 *              Dans le cas où n est supérieur à m,
 *                  b) Permuter n et m, puis continuer.
 * <p>
 * <@classname> - Exercice03_00.java
 * <@author>    - cdi310
 * <@date>      - 27/07/2017
 * <@time>      - 14:55
 */

public class Exercice03_01 {
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

        if (nombre1 > nombre2) {
            // b)  Permuter n et m, puis continuer.
            int temp = nombre1;
            nombre1 = nombre2;
            nombre2 = temp;

        } // end else

        // Display the numbers between nombre1 et nombre2
        System.out.printf("Les nombres entre %d et %d sont:\n ", nombre1, nombre2);
        for (int nombre = nombre1; nombre <= nombre2; nombre++) {
            System.out.printf("%d\t", nombre);

        }
    }
}
