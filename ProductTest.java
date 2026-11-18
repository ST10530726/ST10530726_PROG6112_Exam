/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author Student
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import productsalesreport.Product;

public class ProductTest {
    
    public ProductTest() {
    }


    int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };


    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(sales);

        assertEquals(153, product.GetTotalProductsSold());
    }


    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(sales);

        assertEquals(17.0,
                     product.GetAverageProductsSold(),
                     0.01);
    }
}
    /**
     *
     * @throws Exception
     */
   
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

