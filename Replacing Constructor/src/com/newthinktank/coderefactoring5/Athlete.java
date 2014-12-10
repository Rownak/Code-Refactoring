/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.newthinktank.coderefactoring5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rownak
 */
public class Athlete {
    
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static Athlete getInstance(){
        return null;
    }
}

class GoldWinner extends Athlete{
    
    private static GoldWinner goldAthlete = null;
    
    private GoldWinner(String athleteName){
        setName(athleteName);
    }
    
    public GoldWinner getInstance(String athleteName){
        if(goldAthlete == null){
            goldAthlete = new GoldWinner(athleteName);
        }
        return goldAthlete;
    }
    
}
class SilverWinner extends Athlete{
    
    private static SilverWinner silverWinner = null;
    
    private SilverWinner(String athleteName){
        setName(athleteName);
    }
    
    public SilverWinner getInstance(String athleteName){
        if(silverWinner == null){
            silverWinner = new SilverWinner(athleteName);
        }
        return silverWinner;
    }
    
}
class BronzeWinner extends Athlete{
    
    private static BronzeWinner bronzeWinner = null;
    
    private BronzeWinner(String athleteName){
        setName(athleteName);
    }
    
    public BronzeWinner getInstance(String athleteName){
        if(bronzeWinner == null){
            bronzeWinner = new BronzeWinner(athleteName);
        }
        return bronzeWinner;
    }
    
}
class MedalFactory{
    
    public Athlete getMedal(String medalType, String athleteName) {
        
        
            
        try {
            Class[] athleteNameParameter = new Class[] {String.class};
        
            Method getInstanceMethod = Class.forName(medalType).getMethod("getInstance", athleteNameParameter);

            Object[] params = new Object[] {new String(athleteName)};
        
            return (Athlete)getInstanceMethod.invoke(null, params);
            
        } catch (Exception ex) {
            throw new IllegalArgumentException("Invalid Medal Type");
        } 
        
            
      
        
    }
}

class TestAthlete{
    
    public static void main(String[] args) {
        
        MedalFactory medalFactory = new MedalFactory();
        
        Athlete goldWinnerAthlete = medalFactory.getMedal("com.newthinktank.coderefactoring5.GoldWinner", "Ahnaf");
        Athlete silverWinnerAthlete = medalFactory.getMedal("com.newthinktank.coderefactoring5.SilverWinner", "Farhan");
        Athlete bronzeWinnerAthlete = medalFactory.getMedal("com.newthinktank.coderefactoring5.BronzeWinner", "Rownak");
        
        Athlete goldWinnerAthleteNew = medalFactory.getMedal("com.newthinktank.coderefactoring5.GoldWinner", "New Winner");
        
        System.out.println("GoldWinner Name :" +goldWinnerAthlete.getName());
        System.out.println("GoldWinner Name :" +silverWinnerAthlete.getName());
        System.out.println("GoldWinner Name :" +bronzeWinnerAthlete.getName());
        
    }
}