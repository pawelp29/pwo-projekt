/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Klasa testująca obliczanie wartości odżywczej
 *
 * @author pawelp
 */
public class CalculatorTest {

    @Test
    void calculatorTest() {
        System.out.println("Wartość odżywcza:");
        EatenProduct product1 = new EatenProduct("kiełbasa", 10, 25, 15, "mięso", 3);
        EatenProduct product2 = new EatenProduct("chleb", 20, 2, 2, "zbożowe", 2);
        ArrayList<EatenProduct> list = new ArrayList();
        list.add(product1);
        list.add(product2);
        BigDecimal expResult = BigDecimal.valueOf(1037.0);
        BigDecimal result = BigDecimal.valueOf(Calculator.calculate(list));
        assertEquals(expResult, result);
    }

}
