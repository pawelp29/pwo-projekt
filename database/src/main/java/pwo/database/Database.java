/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pwo.database;

/**
 *
 * @author pawelp
 */
public class Database {

    public static void main(String[] args) {
        ProductList cositem = new ProductList();
        cositem.getListFromFile("/home/madej/Pulpit/products.csv");
        // System.out.println(cositem.list.get(0).name + " " + cositem.list.get(0).carbs + " " + cositem.list.get(0).category);
        cositem.getProducts(null);
    }
}
