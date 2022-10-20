/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3.B2;

/**
 *
 * @author magni
 */
public class DiceApp
{
 public static void main(String[] args)
 {
 int roll;
 String msg = "Here are 100 random rolls of the dice:";
 System.out.println(msg);
 for (int i=0; i<100; i++) 
 {
 roll = randomInt(1, 6); 
 System.out.print(roll + " "); 
 }
 System.out.println();
 }
 public static int randomInt(int low, int high) 
 {
 int result = (int)(Math.random()
 * (high - low + 1)) + low;
 return result; 
 }
}

public class RoundingApp
{
 public static void main(String[] args)
 {
 double x = 29.4;
 double y = 93.5;
 double z = -19.3;
 System.out.println("round(x) = " + Math.round(x));
 System.out.println("round(y) = " + Math.round(y));
 System.out.println("round(z) = " + Math.round(z));
 System.out.println();
 System.out.println("ceil(x) = " + Math.ceil(x));
 System.out.println("ceil(y) = " + Math.ceil(y));
 System.out.println("ceil(z) = " + Math.ceil(z));
 System.out.println();
 System.out.println("floor(x) = " + Math.floor(x));
 System.out.println("floor(y) = " + Math.floor(y));
 System.out.println("floor(z) = " + Math.floor(z));
 System.out.println();
 System.out.println("rint(x) = " + Math.rint(x));
 System.out.println("rint(y) = " + Math.rint(y));
 System.out.println("rint(z) = " + Math.rint(z));
 }
}