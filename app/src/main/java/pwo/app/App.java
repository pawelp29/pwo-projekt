/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pwo.app;

import pwo.database.ProductList;
import java.util.Scanner;

/**
 *
 * @author weronika
 */
public class App {

    public static void main(String[] args) {
        ProductList list = new ProductList();
        list.getListFromFile("./products.csv");
        int nrkat = -1;
        int ilekat = list.categories.size();
        int ilosc = 0;
        // System.out.println(cositem.list.get(0).name + " " + cositem.list.get(0).carbs + " " + cositem.list.get(0).category);
        while (nrkat != 0) {
            System.out.println("KATEGORIE PRODUKTÓW:");
            for (int i = 0; i < list.categories.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + list.categories.get(i));
            }
            System.out.println("(0) ZAKOŃCZ");
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
                    System.out.println("DOSTĘPNE PRODUKTY:");
                    list.getProducts(list.categories.get(nrkat - 1));
                    System.out.println("(0) ZAKOŃCZ");
                    System.out.println("Podaj wybrany numer:");
                    Scanner prod = new Scanner(System.in);
                    nrprod = prod.nextInt();
                    while (nrprod < 0) {
                        System.out.println("Numer produktu nie może być mniejszy od 0. "
                                + "Podaj poprawną wartość");
                        nrprod = prod.nextInt();
                    }
                    if (nrprod != 0) {
                        System.out.println("Wybrałeś produkt numer " + nrprod);
                        System.out.println("Podaj ilość produktu w gramach:");
                        Scanner ileprod = new Scanner(System.in);
                        ilosc = ileprod.nextInt();
                        while(ilosc<0){
                            System.out.println("Ilość produktu nie może być ujemna. "
                                    + "Podaj prawidłową wartość.");
                            ilosc = ileprod.nextInt(); 
                        }
                    } else {
                        System.out.println("Wróciłeś do wyboru kategorii.");
                    }
                }
            } else {
                System.out.println("Zakończono działanie programu");
            }

        }

    }
}
