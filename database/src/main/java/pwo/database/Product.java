package pwo.database;

/**
 * Klasa pojedynczego produktu zawierająca istotne informacje o nim.
 * 
 * @author madej
 */
public class Product {
    public String name,
                  category;
    public float carbs,
                 protein,
                 fats;
    
    public Product(String productName, float productCarbs, float productProtein,
                   float productFats, String productCategory) {
        name = productName;
        carbs = productCarbs;
        protein = productProtein;
        fats = productFats;
        category = productCategory;
    }
    
    /**
     * Funkcja wypisująca wszystkie dane konkretnego produktu,
     * pola są podpisane.
    */
    public void displayRawProductData() {
        System.out.println("Product: [name: " + name + ", carbs: " + carbs + ", protein: " +protein +
                           ", fats: " + fats + ", category: " + category + "]");
    }
}