/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {

    public void PrintTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }

    public void PrintAverageProductSales(double average) {
        System.out.println("AVERAGE PRODUCT SALES: " +
                           String.format("%.2f", average));
    }

    public void PrintMostPopularProduct(String product) {
        System.out.println("MOST POPULAR PRODUCT: " + product);
    }
}
        
    
    

