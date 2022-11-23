package pwo.database;

/**
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
    
    public void displayRawProductData() {
        System.out.println("Product: [name: " + name + ", carbs: " + carbs + ", protein: " +protein +
                           ", fats: " + fats + ", category: " + category + "]");
    }
}