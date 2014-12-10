package com.newthinktank.coderefactoring5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rownak
 */
public abstract class Customer2 {
    
    private String custRating;
    static final int PREMIER = 2;
    static final int VALUED = 1;
    static final int DEADBEAT = 0;

    public String getCustRating() {
        return custRating;
    }

    public void setCustRating(String custRating) {
        this.custRating = custRating;
    }
    
    public static void main(String[] args) {
        
        CustomerFactory customerFactory = new CustomerFactory();
        Customer2 goodCustomer = customerFactory.getCustomer("Premier");
        System.out.println("Customer Rating : " + goodCustomer.getCustRating());
    }
    
}

class Premier extends Customer2{
    
    Premier(){
        setCustRating("Premier Customer");
    }
}
class Valued extends Customer2{
    
    Valued(){
        setCustRating("Valued Customer");
    }
}
class Deadbeat extends Customer2{
    
    Deadbeat(){
        setCustRating("Deadbeat Customer");
    }
}

class CustomerFactory{
    
    public Customer2 getCustomer(String custType){
        
//        switch(custType){
//            
//            case 2:
//                return new Premier();
//            case 1:
//                return new Valued();
//            case 0:
//                return new Deadbeat();
//            default:
//                throw new IllegalArgumentException("Invalid Customer Type");
//        }
        try{
           return (Customer2) Class.forName(custType).newInstance();
        }catch(Exception e){
            System.out.println("Invalid Customer Type");
        }
        return null;
    }
}