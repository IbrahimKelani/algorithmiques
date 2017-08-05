package com.afpa.java.exos;

/**
 * <@Todo>       - Remplacer les double-espace (ou +) dans une chaîne de caractères par un espace.
 * <@className> - Exercice21.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/30/17
 * <@time>      - 6:25 PM
 */

public class Exercice21 {
    public static void main(String[] args) {
        String string = "Je   suis  a l'AFPA    pour apprendre   la    Programmation     orientée    Objet.";

        char[] charArray = string.toCharArray();
        char previous = string.charAt(0);

        for (char current : charArray) {

            if (!(current == ' ' && previous == ' ')) {
                System.out.print(current);
            }

            previous = current;
        }
    }
}
