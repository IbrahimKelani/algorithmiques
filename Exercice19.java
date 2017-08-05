package com.afpa.java.exos;

/**
 * <@Todo>      - Afficher la présence d'une lettre dans une chaîne (si oui, en afficher le nombre
 *                (quantité, si non, afficher "absent").
 * <@className> - Exercice19.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/29/17
 * <@time>      - 11:34 PM
 */
public class Exercice19 {
    public static void main(String[] args) {

        String string = "Je vous salue Marie!";
        char lettreRecherchee = 'a';

        // display original string
        System.out.printf("Chaine de caracteres de départ: \"%s\"", string);

        // Using method occurenceReplacement
        int occurence = presenceLettre(string, lettreRecherchee);

        // display the final string with occurence of a letter counted
         System.out.print(
                 (occurence != 0) ?
                 ("\nLa lettre '" + lettreRecherchee + "' existe " + occurence + " fois dans la chaine: \"" + string + "\"") :
                 ("\nLa lettre '" + lettreRecherchee + "' n'existe pas dans la chaine: \"" + string + "\"")
         );
        
    }

    // method presenceLettre checks whether a letter exists in a string. If it does, then returns its occurence
    private static int presenceLettre(String string, char lettreRecherchee) {
        int occurence = 0;

        if (string == null) {
            return -1;
        }

        // Boucle pour parcourir la chaine à la recherche d'un caractere précis
        for (int counter = 0; counter < string.length(); counter++) {

            if (string.charAt(counter) == lettreRecherchee) {
                ++occurence;
            }

        }
        return occurence;
    }
} // end class Exercice19
