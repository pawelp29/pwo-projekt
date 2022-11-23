/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.calculator;

import pwo.database.Product;

/**
 * Klasa przechowująca informacje o spożytym produkcie oraz jego ilości
 *
 * @author pawelp
 */
public class EatenProduct extends Product {

    /**
     * Ilość w gramach
     */
    public int amount;

    /**
     * Konstruktor klasy spożytego produktu
     *
     * @param productName nazwa produktu
     * @param productCarbs zawartość węglowodanów na 100 g produktu
     * @param productProtein zawartość białka na 100 g produktu
     * @param productFats zawartość tłuszczów na 100 g produktu
     * @param productCategory nazwa kategorii
     * @param amount ilość w gramach
     */
    public EatenProduct(String productName, float productCarbs, float productProtein,
            float productFats, String productCategory, int amount) {
        super(productName, productCarbs, productProtein, productFats, productCategory);
        this.amount = amount;
    }
}
