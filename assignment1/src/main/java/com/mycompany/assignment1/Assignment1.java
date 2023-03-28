package com.mycompany.assignment1;
import java.util.*;

enum Birds{
    Peacock(1), 
    Parrots(2), 
    Owl(3), 
    Finches(4), 
    Dog(5);
      
    int number;
    
    Birds(int number){
        this.number=number;
    }
}

public class Assignment1 {
    public static void main(String[] args) {
         System.out.println("Demonstration of Enumerations using Birds!");
        Birds birds = Birds.Owl;
        Birds notbirds = Birds.Dog;
        System.out.println("\nDemo of valueof method");
        Birds valuemethod = Birds.valueOf("Owl");
        System.out.println(valuemethod);
        
        System.out.println("\nDemo of ordinal method");
        for(Birds p:Birds.values()){
            System.out.println(p+":"+p.ordinal()+" ");
        }
        System.out.println("\nDemo of values method");
        Birds p[]=Birds.values();
        for(int i=0;i<=5;i++){
            System.out.println(p[i]);
        }
        
        Birdcomparison(birds, notbirds);
        birdornot(birds);
    }
        static void Birdcomparison(Birds birds,Birds notbirds){
     int answer;
     System.out.println("\nUsing compareTo method");
        answer = birds.compareTo(notbirds);
        if(answer==1){
            System.out.println("birds");
        }
        else{
            System.out.println("not a bird");
        }
         System.out.println("\nUsing equals method");
        if(birds.equals(notbirds)==true){
            System.out.println("birds and other living things are same!");
            
        }
        else
        {
            System.out.println("birds and other living things are not same!");
        }
       
    }
        static void birdornot(Birds birds){
        switch(birds){
            case Owl:
                System.out.println("This is a bird!");
                System.out.println("This bird number"+birds.number);
                break;
            case Dog:
                System.out.println("This is not a bird.");
                System.out.println("This bird number"+birds.number);
            default:
                System.out.println("system cant verify!");
                System.out.println("This bird number"+birds.number);
        }
        
    }
}
        

        
    

