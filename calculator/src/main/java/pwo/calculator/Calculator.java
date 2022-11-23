/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pwo.calculator;
import java.util.ArrayList;

/**
 *
 * @author pawelp
 */
public class Calculator {

//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
    private static final String INFO = "Kalkulator wartości odżywczej";
    private static final int CARBOHYDRATES = 4;
    private static final int PROTEINS = 4;
    private static final int FATS = 9;

    public static String getInfo() {
        return INFO;
    }
    
    public static double calculate(ArrayList<EatenProduct> productList) {
        double result = 0;
        for (EatenProduct p: productList) {
            result += (CARBOHYDRATES * p.carbs
                    + PROTEINS * p.protein
                    + FATS * p.fats) * p.amount;
        }
        return result;
    }
}
