package pwo.database;

/**
 * Klasa pojedynczego produktu zawierająca istotne informacje o nim.
 * 
 * @author madej
 */
public class Product {
    public String name,
                  category;
    public float protein,
                 fats,
                 carbs;
    
    public Product(String productName, float productProtein , float productFats,
                   float productCarbs, String productCategory) {
        name = productName;
        protein = productProtein;
        fats = productFats;
        carbs = productCarbs;
        category = productCategory;
    }
    
    /**
     * Funkcja wypisująca wszystkie dane konkretnego produktu,
     * pola są podpisane.
    */
    public void displayRawProductData() {
        System.out.println("Product: [name: " + name + ", protein: " +protein + ", fats: " + fats +
                           ", carbs: " + carbs + ", category: " + category + "]");
    }
}