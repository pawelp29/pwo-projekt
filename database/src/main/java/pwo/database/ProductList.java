package pwo.database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author madej
 */
public class ProductList {
    public ArrayList<Product> list = new ArrayList<>(); 
    
    public ProductList() {
        
    }
    
    public void getListFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                list.add(new Product(values[0], Float.parseFloat(values[1]), Float.parseFloat(values[2]),
                                     Float.parseFloat(values[3]), values[4]));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void getProducts(String category) {
        for (Product product : list) {
            if(category == null || category.equals(product.category)) {
                System.out.println("(" + (list.indexOf(product)+1) + ") " + product.name);
            }
        }
    }
}
