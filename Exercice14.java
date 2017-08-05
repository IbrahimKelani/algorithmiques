package com.afpa.java.exos;

import org.apache.commons.lang3.StringUtils;

/**
 * <@Todo>      - Créer une chaîne de caractères de 50 '-'
 * <@className> - Exercice14.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/28/17
 * <@time>      - 12:06 AM
 */

public class Exercice14 {
    public static void main(String[] args) {
        char charactere = '-';

        String chaineCaracteres;
/*
        for (int counter = 0; counter < 50 ; counter++) {
            chaineCaracteres += charactere;
        }
  */
        chaineCaracteres = StringUtils.repeat(charactere, 50);
        System.out.println(chaineCaracteres);

        // Using Stringbuilder's methods to process strings
        StringBuilder etoile = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            etoile.append('*');
            System.out.println(etoile);
            System.out.println(etoile.hashCode());
        }

        System.out.println(etoile);
        System.out.println(etoile.hashCode());

        StringBuilder message2 = new StringBuilder();
        message2.append("Salut Messieurs");

        message2.replace(6, 15, "Mesdames");
        System.out.println(message2);
    }
}
