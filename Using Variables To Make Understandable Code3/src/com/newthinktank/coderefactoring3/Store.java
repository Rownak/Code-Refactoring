/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.newthinktank.coderefactoring3;

import java.util.ArrayList;

/**
 *
 * @author Rownak
 */
public class Store {
    
    public ArrayList<Product> theProducts = new ArrayList<Product>();
    
    public void addProduct(Product newProduct){
        theProducts.add(newProduct);
    }
    
    public void getCostOfProducts(){
        
        for(Product product : theProducts){
            
            final String prodName = product.getName();
            final int prodAmount = product.getQuantity();
            final double cost = product.getTotalCost();
            
            final double costWithDiscount = product.getTotalCost() / product.getQuantity();
            
            final double costWithOutDiscount = product.getPrice() + product.getShippingCost();
            
            System.out.println("Total cost for " + prodAmount + " " + prodName + " is $" + cost);
            
            System.out.println("Cost per product " + costWithDiscount);
            
            System.out.println("Savings per product " + (costWithOutDiscount - costWithDiscount));
            
            //-----------------------------Bad Coding------------------------
            /*System.out.println("Total cost for " + product.getQuantity() + " " + product.getName() + " is $" + product.getTotalCost());
            
            System.out.println("Cost per product " + product.getTotalCost() / product.getQuantity());
            
            System.out.println("Savings per product " + (((product.getPrice()) + product.getShippingCost())-(product.getTotalCost()/product.getQuantity())));*/
            
            System.out.println("");
        } 
        
    }
    
    public static void main(String[] args) {
        
        Store cornerStore = new Store();
        
        cornerStore.addProduct(new Product("Pizza", 10.00, 1.00, 52));
        cornerStore.addProduct(new Product("Pizza", 10.00, 1.00, 26));
        cornerStore.addProduct(new Product("Pizza", 10.00, 1.00, 10));    
        
        cornerStore.getCostOfProducts();
    }
}