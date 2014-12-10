/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author Rownak
 */
public class CalculateSalaryWithIfElse {
    public static void main(String[] args) {
        
        Employee salseman = new Employee(true, 10000);
        Employee secretary = new Employee(false, 15000);
        
        System.out.println("Salseman salary :" + salseman.getSalary());
        System.out.println("Secretary salary :" + secretary.getSalary());
        
        //Now if i want to add bonusAmount
        Employee salseman2 = new Employee(true, 10000, 0.20);
        System.out.println("Senior Salseman salary :" + salseman2.getSalary());

        
    }
}
class Employee{
    private boolean bonus = false ;
    private double salary = 0.0;
           //Now if i want to add bonusAmount
    private double bonusAmount = .15;
    
    Employee(boolean bonus, double salary){
        super();
        this.bonus = bonus;
        this.salary = salary;
    }
    Employee(boolean bonus, double salary, double bonusAmount){
        super();
        this.bonus = bonus;
        this.salary = salary;
        this.bonusAmount = bonusAmount;
    }
    public double getSalary() {
        
        if(bonus){
            return salary + (salary*bonusAmount);
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
} 