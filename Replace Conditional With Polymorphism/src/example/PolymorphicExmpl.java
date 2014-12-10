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
public class PolymorphicExmpl {
    
   
    
    public static void main(String[] args) {
        
        String doggy = "Dog";
        String kitty = "Cat";
        makeSound(doggy);
        
        Animal dog = new Dog("wooh");
        Animal cat = new Cat("mew");
        System.out.println(cat.getSound());
    }

    private static void makeSound(String doggy) {
        
        switch(doggy){
            case "Dog" :
                System.out.println("wooh");
                break;
            case "Cat" :
                System.out.println("mew");
                break;
            default:
                throw new RuntimeException("Animal can't be recognized");
        }
    }
    
}

class Animal{
    private String sound = "";

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    
     Animal(String sound){
         
         super();
         setSound(sound);
     }
}
class Dog extends Animal{

    
    public Dog(String sound) {
        super(sound);
    }
    
}
class Cat extends Animal{

    public Cat(String sound) {
        super(sound);
    }
    
}
