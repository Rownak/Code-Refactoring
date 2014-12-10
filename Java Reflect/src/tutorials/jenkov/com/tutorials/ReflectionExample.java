/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials.jenkov.com.tutorials;

import java.lang.reflect.Method;

/**
 *
 * @author Rownak
 */
public class ReflectionExample {

    public static void main(String[] args) {

        Method[] methods = Temp.class.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method.getName());
        }
    }
}

class Temp {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
