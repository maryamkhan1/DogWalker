/*
 *  
 * Write the DogWalker program inside the main method
 * according to the assignment description.
 * 
 * To compile:
 *        javac DogWalker.java
 * To execute:
 *        java DogWalker 5
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 *
 */
public class DogWalker {

    public static void main(String[] args) {

       double randomnum= 0;
       int x = 0;
       int y = 0;
       int n = Integer.parseInt(args[0]);
       int count = 0;
       System.out.println("(0,0)");
        while (count < n){
            randomnum = Math.random();
            if(randomnum <= 0.25){
                y ++;
                System.out.println("("+ x + "," + y + ")");
            }
            else if(randomnum <= 0.5){
                x = x + 1;
                System.out.println("(" + x + "," + y + ")");
            }
            else if(randomnum <= 0.75){
                y = y - 1;
                System.out.println("(" + x + "," + y + ")");
            }
            else{
                x = x-1;
                System.out.println("(" + x + "," + y + ")");
            }
            count = count + 1;
        }
        double square = (x * x) + (y * y);
        System.out.println("Square distance = " + square);

    }

			   
    }
