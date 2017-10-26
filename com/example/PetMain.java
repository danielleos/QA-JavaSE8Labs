package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        System.out.println();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();
        
        System.out.println();
        
        //test a fish with a fish reference
        Fish f = new Fish();
        f.eat();
        f.walk();
        f.play();
        System.out.println();
        //test a fish with an animal reference
        a = new Fish();
        a.eat();
        a.walk();
        
        System.out.println();
        
        //test a cat with a cat reference
        Cat c = new Cat();
        c.eat();
        c.walk();
        c.play();
        System.out.println();
        //test a cat with an animal reference
        a = new Cat();
        a.eat();
        a.walk();
        
        System.out.println();
        
        playWithAnimal(s);
        playWithAnimal(f);
        playWithAnimal(c);
        
    }
    
    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
        	((Pet) a).play(); 
        } else {
        	System.out.println("Danger! Wild Animal");
        }
    }
    
}