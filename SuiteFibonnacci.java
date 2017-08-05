package com.afpa.java.exos;

import java.util.Arrays;

/**
 * Todo         - Afficher les douzes premiers termes de la suite de Fibonnacci
 * <@classname> - SuiteFibonnacci.java
 * <@author>    - cdi310
 * <@date>      - 28/07/2017
 * <@time>      - 09:27
 */

public class SuiteFibonnacci {
    public static void main(String[] args) {
        int[] tableauSuiteFibonacci = new int[12];

        for (int i = 0; i < tableauSuiteFibonacci.length; i++) {
            if (i == 0) {
                tableauSuiteFibonacci[0] = 0;
            }
            else if (i == 1) {
                tableauSuiteFibonacci[1] = 1;
            }
            else {
                tableauSuiteFibonacci[i] = tableauSuiteFibonacci[i - 1] + tableauSuiteFibonacci[i - 2];
            }
        }

        System.out.println(Arrays.toString(tableauSuiteFibonacci));
    }
}
