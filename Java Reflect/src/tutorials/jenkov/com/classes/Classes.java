/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tutorials.jenkov.com.classes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rownak
 */

public class Classes {
    
    public static void main(String[] args) {
        
        //If you know the name of the class at compile time you can obtain a Class object like this:
        Class myClass1 = CalcArea.class ;
        String className1 = myClass1.getName();
        System.out.println("Class Name with package :" +className1);
        
        //if you don't know the name at compile time, but have the class name as a string at runtime, you can do like this:
        String className = "tutorials.jenkov.com.classes.CalcArea";
        try {
            //obtain class name as string at runtime
            Class myclass2 = Class.forName(className);
            String className2 = myClass1.getSimpleName();
            System.out.println("Class Name :" +className2);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Classes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*The class modifiers are the keywords "public", "private", "static" etc. 
        You obtain the class modifiers like this:*/
        int modifiers = myClass1.getModifiers();
        System.out.println("Private present ? " + Modifier.isPrivate(modifiers));
        
        Package mypackage = myClass1.getPackage();
        System.out.println("Package name: "+ mypackage.getName());
        
        Class superclass = myClass1.getSuperclass();
        System.out.println("Super Class name:" + superclass.getName());
        
        Method[] methods = myClass1.getMethods();
        System.out.println("Method Names :");
        for(Method method : methods){
            System.out.println("        " +method.getName());
        }
        
        Field[] fields = myClass1.getFields();
        System.out.println("Field Names :");
        for(Field field : fields){
            System.out.println("        " +field.getName());
        }
        
    }
    
}

