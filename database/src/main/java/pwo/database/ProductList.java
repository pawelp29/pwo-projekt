package pwo.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Klasa listy produktów, zawierająca metody do pobierania danych
 * produktów z pliku oraz wyświetlania informacji o nich.
 * 
 * @author madej
 */
public class ProductList {
    public ArrayList<Product> list = new ArrayList<>();
    public ArrayList<String> categories = new ArrayList<>(); 
    
    public ProductList() {
        
    }
    
    /**
     * Metoda pobierająca dane produktów z pliku o podanej nazwie
     * jako strukturę danych w parametrze klasy.
     * 
     * @param fileName
     */
    public void getListFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                list.add(new Product(values[0], Float.parseFloat(values[1]), Float.parseFloat(values[2]),
                                     Float.parseFloat(values[3]), values[4]));
                if(!categories.contains(values[4])) {
                    categories.add(values[4]);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Metoda wyświetlająca w konsoli id oraz nazwy produktów z listy.
     * 
     * @param category 
     */
    public void displayProductsByCategory(String category) {
        for (Product product : list) {
            if(category == null || category.equals(product.category)) {
                System.out.println("(" + (list.indexOf(product)+1) + ") " + product.name);
            }
        }
    }
    
    /**
     * Metoda zwracająca dane wszystkich produktów z podanej kategorii.
     * 
     * @param category
     * @return 
     */
    public ArrayList<Product> getProducts(String category) {
        ArrayList<Product> productsByCategory = new ArrayList<>();
        for (Product product : list) {
            if(category.equals(product.category)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }
}
