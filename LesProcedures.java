package com.afpa.java.exos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sibylle
 */
public class LesProcedures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //REMPLIR UN TABLEAU DE 10 ENTIERS
        //PAR DES SAISIES UTILISATEURS
        //VARIABLES PERMETTANT LA SAISIE AU CLAVIER
        InputStreamReader entreeInfo = new InputStreamReader(System.in);
        BufferedReader monBuffer = new BufferedReader(entreeInfo);

        //VARIABLE DE TYPE TABLEAU ENTIERS
        Integer leTableau[] = new Integer[5];

        System.out.println("DANS LE MAIN");

        System.out.println("hash code avant : "+leTableau.hashCode());
        //APPEL DE LA PROCEDURE DE REMPLISSAGE
        //A LAQUELLE ON ENVOIE LE TABLEAU ET LE BUFFER
        remplirTableau(leTableau, monBuffer);

        //APPEL DE LA PROCEDURE D AFFICHAGE
        //A LAQUELLE ON ENOIE LE TABLELAU REMPLI
        afficherTableau(leTableau);

        System.out.println("DE RETOUR DANS LE MAIN");
       System.out.println("hash code APRES : "+leTableau.hashCode());
 
        monBuffer.close();
        entreeInfo.close();

    }

    public static void remplirTableau(Integer[] tableau, BufferedReader buffer) throws IOException {

        System.out.println("DANS LA PROCEDURE REMPLIR TABLEAU");
        //REMPLISSAGE DU TABLEAU
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Renter le nombre numero " + (i + 1));
            tableau[i] = Integer.valueOf(buffer.readLine());
        }
    }

    public static void afficherTableau(Integer[] tableau) {

        System.out.println("DANS LA PROCEDURE AFFICHAGE DU TABLEAU");
        //AFFICHAGE DU TABLEAU
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " * ");
        }

    }

}
