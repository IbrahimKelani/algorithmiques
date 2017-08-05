package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Excercices10Fonction {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("10. Inverser les éléments d'un tableau de 10 éléments (sans passer par un tableau");
        System.out.print(" Saisir la longeur du tableau : ");
        float tableau1[];
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String longeur = br.readLine();
        int longeurtab = Integer.valueOf(longeur);
        tableau1 = new float[longeurtab];

        ////////// procedures  /////////////////////////////////////////
        remplirTableau(tableau1, br);
        System.out.println(Arrays.toString(tableau1));

        // afficherTableau(tab);
        br.close();
        isr.close();

        permuterTableau(tableau1);
        System.out.println(Arrays.toString(tableau1));
        // afficherTableau(tab);

        trierTableau(tableau1);
        //triEnBulle(tab);
        System.out.println(Arrays.toString(tableau1));
        // afficherTableau(tab);

        ///////////////////////////////////////////////////////////////
    }

    /////////////// procedure remplissage  tableau ////////////////////////////////////
    private static void remplirTableau(float[] tableau, BufferedReader br) throws IOException {
        
        System.out.println("DANS LA PROCEDURE REMPLIR TABLEAU");
        //REMPLISSAGE DU TABLEAU
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Renter le nombre numero " + (i + 1));
            tableau[i] = Integer.valueOf(br.readLine());
        }
        
    }
/////////////// procedure affichage ////////////////////////////////////////

    private static void afficherTableau(float[] tab) {
        System.out.println("DANS LA PROCEDURE AFFICHAGE DU TABLEAU");
        //AFFICHAGE DU TABLEAU
        for (float decimal : tab) {
            System.out.print(decimal + " * ");
        }
    }

///// procedurte permuter les valeur d'un tableau ////////// 
    private static void permuterTableau(float[] tab) {
        float y;

        System.out.printf("\npermuter les valeur d'un tableau ------------------------------\n");

        for (int i = 0; i < tab.length / 2; i = i + 1) {

            y = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = y;
        }
    }

    ////////////// procedure trier un tableau  
    private static void trierTableau(float[] tab) {
        System.out.printf("\ntri par selection  -----------------\n");
        int pmin;
        float temp;

        for (int i = 0; i < tab.length; i = i + 1) {
             pmin = i;
            
            for (int j = i + 1; j < tab.length; j = j + 1) {
                if (tab[j] < tab[pmin]) {
                    pmin = j;
                }
            }

            temp = tab[i];
            tab[i] = tab[pmin];
            tab[pmin] = temp;
        }
    }

    private static void triEnBulle(float tab[]){
        
             System.out.println("------------  tri en bulles ----------------------");
            for (int i = tab.length - 1; i >= 0; --i) {
                for (int j = 1; j <= i; ++j) {
                    if (tab[j - 1] > tab[j]) {

                        float z = tab[j - 1];
                        tab[j - 1] = tab[j];
                        tab[j] = z;
                    }
                }
            }

        }
}
