 
package com.mycompany.healthyhearts;
import java.util.*;

public class HealthyHearts {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your age?");
        String input=sc.nextLine();
        int inputInt=Integer.parseInt(input);
        int maxHeartBeat=220-inputInt;
        System.out.println("Your maximum heart rate should be "+maxHeartBeat+" beats per minute");
        double lowerBound= maxHeartBeat*0.5;
        double higherBound=maxHeartBeat*0.85;
        int l=(int)Math.round(lowerBound);
        int h=(int)Math.round(higherBound);
        
        System.out.println("Your target HR Zone is "+l+" - "+h+" beats per minute");
         
    }
    
   
    
    
}
