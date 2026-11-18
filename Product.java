/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

 
    public class Product implements IProduct {

   
    private final String[] productNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

   
    private int[][] sales = new int[3][3];

    
    public Product(int[][] sales) {
        this.sales = sales;
    }

    
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int[] sale : sales) {
            for (int j = 0; j < sale.length; j++) {
                total += sale[j];
            }
        }

        return total;
    }

    
    @Override
    public double GetAverageProductsSold() {

        int total = GetTotalProductsSold();

        return (double) total / 9;
    }

  
    public String GetMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = i;
            }
        }

        return productNames[popularIndex] +
               " (" + highestSales + ")";
    }

    @Override
    public String GetMostPopularProducts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/**
 *
 * @author Student
 */

    
        
    
    

