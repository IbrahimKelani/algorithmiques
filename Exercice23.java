package com.afpa.java.exos;

/**
 * <@Todo>       - Inverser les mots d'une phrase.
 * <@className> - Exercice23.java
 * <@author>    - ibrahimkelani
 * <@date>      - 7/30/17
 * <@time>      - 5:54 PM
 */

public class Exercice23 {
    public static void main(String args[]){
        String str[] = "He is the one".split(" ");
        String finalStr="";

        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
}
