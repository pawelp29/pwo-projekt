/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pwo.calculator;

import java.util.ArrayList;

/**
 * Klasa służąca do obliczania wartości odżywczej listy produktów
 *
 * @author pawelp
 */
public class Calculator {

    private static final String INFO = "Kalkulator wartości odżywczej";
    private static final int CARBOHYDRATES = 4;
    private static final int PROTEINS = 4;
    private static final int FATS = 9;

    /**
     * Metoda wypisująca informacje o klasie
     *
     * @return
     */
    public static String getInfo() {
        return INFO;
    }

    /**
     * Metoda obliczająca wartość odżywczą listy produktów
     *
     * @param productList lista produktów
     * @return
     */
    public static double calculate(ArrayList<EatenProduct> productList) {
        double result = 0;
        for (EatenProduct p : productList) {
            result += ((CARBOHYDRATES * p.carbs
                    + PROTEINS * p.protein
                    + FATS * p.fats) * p.amount) / 100;
        }
        return result;
    }
}
