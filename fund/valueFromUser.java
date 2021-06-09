/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package traffic;
import static java.lang.Math.*;
public class valueFromUser{

     public static void main(String []args){
         int valueFromUser =5;
         
         if (valueFromUser%3==0 && valueFromUser%5==0){
              System.out.println("fizzBuzz");
              
         }
         
       else if (valueFromUser %3==0 ){
            System.out.println("fizz");
        } else if (valueFromUser %5 == 0 ){
             System.out.println("Buzz");
        }
     }
}
/* This code is contributed by Rajat Mishra */
