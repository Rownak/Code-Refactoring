/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.newthinktank.coderefactoring3;

/**
 *
 * @author Rownak
 */
public class Product {
    
    private String name = "";
    private double price = 0.0;
    private double shippingCost = 0.0;
    private int quantity = 0;

    public String getName() { return name; }

    public double getPrice() { return price; }

    public double getShippingCost() { return shippingCost; }

    public int getQuantity() { return quantity; }

    public Product(String name, double price, double shippingCost, int quantity) {
        this.name = name;
        this.price = price;
        this.shippingCost = shippingCost;
        this.quantity = quantity;
        
    }
    
    public double getTotalCost(){
        double quantityDiscount = 0.0;
        
        final boolean over50Products = (quantity > 50) || ((quantity * price) > 500 );
        final boolean over20Products = (quantity > 20) || ((quantity * price) > 100 );
        final boolean over10Products = (quantity > 10) || ((quantity * price) > 50 );
        
         if(over50Products){
            
            quantityDiscount = 0.10;
            
        }else if(over20Products){
            
            quantityDiscount = 0.07;
            
        }else if (over10Products){
            quantityDiscount = 0.05;
        }
        double discount = ((quantity - 1) * quantityDiscount) * price; 
        
        
        //--------------Bad Coading-------------
        
        /*if((quantity > 50) || ((quantity * price) > 500 )){
            
            quantityDiscount = 0.10;
            
        }else if((quantity > 20) || ((quantity * price) > 100 )){
            
            quantityDiscount = 0.07;
            
        }else if ((quantity >= 10) || ((quantity * price) > 50)){
            quantityDiscount = 0.05;
        }
        double discount = ((quantity - 1) * quantityDiscount) * price; */
        
        final double priceAndShippingCost = price + shippingCost;
        
        final double totalCostWithoutDiscount = priceAndShippingCost * quantity;
        
        return totalCostWithoutDiscount - discount;
    }

    
    
    
    
    
}
