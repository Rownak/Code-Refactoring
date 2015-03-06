/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.newthinktank.coderefactoring7;

/**
 *
 * @author Rownak
 */
public class ReplaceConditionalWithStrategy {
    
    public static void main(String[] args) {
        
        Employee salesman = new Salesman(15000);
        Employee secretary = new Secretary(25000);
        
        System.out.println("Salseman salary :" + salesman.getPay());
        System.out.println("Secretary salary :" + secretary.getPay());
        
        salesman.setBonusOption(new GetsBonus());
        System.out.println("Salseman salary :" + salesman.getPay());
        Employee salesTrainee = new Salesman(15000, new NoBonus());
        System.out.println("Salseman Trainee :" + salesTrainee.getPay());
        
        secretary.setBonusOption(new GetsBonus());
        System.out.println("Secretary salary :" + secretary.getPay());


    }
    
}
class Employee{
    private double salary = 0.0;
    private Pay payType = new NoBonus();
    
    Employee(double salary){
        this.salary = salary;
    }
    Employee(double salary, Pay payType){
        this.salary = salary;
        this.payType = payType;
    }
    public void setBonusOption(Pay newPayType ){
        this.payType = newPayType;
    }
    public double getPay(){
        return payType.getPay(this.salary);
    }
}
interface Pay{
    public double getPay(double salary);
}
class NoBonus implements Pay{

    @Override
    public double getPay(double salary) {
        return salary;
    }
    
}
class GetsBonus implements Pay{

    @Override
    public double getPay(double salary) {
        return salary + salary*0.15;
    }
    
}
class Bonus20Per implements Pay{

    @Override
    public double getPay(double salary) {
        return salary + salary*0.20;
    }
    
}
class Salesman extends Employee{

    public Salesman(double salary) {
        super(salary);
    }

    
    public Salesman(double salary, Pay payType) {
        super(salary);
        setBonusOption(payType);
    }
    
}
class Secretary extends Employee{

    public Secretary(double salary) {
        super(salary);
    }
    
    
    public Secretary(double salary, Pay payType) {
        super(salary);
        setBonusOption(payType);
    }
    
}