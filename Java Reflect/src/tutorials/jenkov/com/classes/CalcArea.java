/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorials.jenkov.com.classes;

/**
 *
 * @author Rownak
 */
public class CalcArea{
    
    private double length=0.0;
    private double breath=0.0;
    
    String hehe = "";

    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }
    
    public double getArea(){
        return length*breath;
    }
        
}
