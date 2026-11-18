/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;


public class ProductSalesReport {

 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

     
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(
                    "Enter number of sales for month " +
                    (j + 1) + " for " + productNames[i] +
                    " mattress: "
                );

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

      
        Product product = new Product(sales);

       
        PrintProduct printer = new PrintProduct();

      
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***************************************");

        printer.PrintTotalProductSales(
            product.GetTotalProductsSold()
        );

        printer.PrintAverageProductSales(
            product.GetAverageProductsSold()
        );

        printer.PrintMostPopularProduct(
            product.GetMostPopularProduct()
        );

        input.close();
    }
}
    
}
