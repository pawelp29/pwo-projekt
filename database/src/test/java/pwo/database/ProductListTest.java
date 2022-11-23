package pwo.database;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author madej
 */
public class ProductListTest {
    @Test
    public void testGetListFromFile() {

        System.out.println("Test metody pobierającej dane produktów z pliku .csv");
        ProductList instance = new ProductList();
        instance.getListFromFile("./products.csv");

        String expectedFirstProductName = "Bagietki francuskie";
        assertEquals(expectedFirstProductName, instance.list.get(0).name);
        int expectedProductListSize = 179;
        assertEquals(expectedProductListSize, instance.list.size());
        String expectedExampleCategory = "nabiał";
        assertEquals(true, instance.categories.contains(expectedExampleCategory));
    }
}
