/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import java.util.ArrayList;
import java.util.Scanner;
import pwo.calculator.Calculator;
import pwo.calculator.EatenProduct;
import pwo.database.Product;
import pwo.database.ProductList;

/**
 *
 * @author wercia
 */
public class Console {
    public ArrayList<EatenProduct>itemki = new ArrayList<>();
    private int selectProduct(int nrprod, int nrkat, ProductList list){
        int ilosc;
        System.out.println("DOSTĘPNE PRODUKTY:");
                list.displayProductsByCategory(list.categories.get(nrkat - 1));
                System.out.println("(0) ZAKOŃCZ");
                System.out.println("Podaj wybrany numer:");
                Scanner prod = new Scanner(System.in);
                nrprod = prod.nextInt();

                while ((nrprod > 0 && !list.list.get(nrprod - 1).category.equals(list.categories.get(nrkat - 1))) || (nrprod < 0)) {
                    System.out.println("Niepoprawny numer produktu. "
                            + "Podaj poprawną wartość");
                    nrprod = prod.nextInt();
                }
                if (nrprod != 0) {
                    System.out.println("Wybrałeś produkt numer " + nrprod);
                    System.out.println("Podaj ilość produktu w gramach:");
                    Scanner ileprod = new Scanner(System.in);
                    ilosc = ileprod.nextInt();
                    while (ilosc < 0) {
                        System.out.println("Ilość produktu nie może być ujemna. "
                                + "Podaj prawidłową wartość.");
                        ilosc = ileprod.nextInt();
                    }
                    Product product = list.list.get(nrprod - 1);
                    EatenProduct doDodania = new EatenProduct(product.name, product.protein, product.fats, product.carbs, product.category, ilosc);
                    itemki.add(doDodania);
                } else {
                    System.out.println("Wróciłeś do wyboru kategorii.");
                }
                return nrprod;
    }
    private int selectCategory(int nrkat, ProductList list) {
        int ilekat = list.categories.size();
        System.out.println("KATEGORIE PRODUKTÓW:");
        for (int i = 0; i < list.categories.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + list.categories.get(i));
        }
        System.out.println("(0) Pokaż wynik i ZAKOŃCZ");
        System.out.println("Podaj wybrany numer:");
        Scanner kat = new Scanner(System.in);
        nrkat = kat.nextInt();
        while ((nrkat < 0) || (nrkat > ilekat)) {
            System.out.println("Numer kategorii nie może być mniejszy od 0, "
                    + "ani większy niż ilość dostępnych kategorii. "
                    + "Podaj poprawną wartość");
            nrkat = kat.nextInt();
        }
        if (nrkat != 0) {
            System.out.println("Wybrałeś kategorię numer " + nrkat + ".");
            int nrprod = -1;
            while (nrprod != 0) {
                nrprod = selectProduct(nrprod, nrkat, list);
            }
        } else {
            double wynik = Calculator.calculate(itemki);
            System.out.println("Wartość odżywcza wybranych produktów:");
            System.out.println(wynik + " kcal");
            System.out.println("Zakończono działanie programu");
        }
        return nrkat;
    }

    public void execute() {
        ProductList list = new ProductList();
        list.getListFromFile("./products.csv");
        int nrkat = -1;
        // System.out.println(cositem.list.get(0).name + " " + cositem.list.get(0).carbs + " " + cositem.list.get(0).category);
        while (nrkat != 0) {
            nrkat = selectCategory(nrkat, list);
        }
    }
}
