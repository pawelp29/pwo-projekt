/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.calculator;

import pwo.database.Product;

/**
 *
 * @author pawelp
 */
public class EatenProduct extends Product {
    
    public int amount;
    
    public EatenProduct(String productName, float productCarbs, float productProtein,
                   float productFats, String productCategory, int amount) {
        super(productName, productCarbs, productProtein, productFats, productCategory);
        this.amount = amount;
    }
}
