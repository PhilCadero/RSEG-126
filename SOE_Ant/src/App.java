// Java App - Sieve of Erastostenes

import java.util.Arrays;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to MY Sieve of Erastosthenes.  Enter a maximum integer for the upper limit: ");

        // int max = input.nextInt();
        int max = 100;
        System.out.println("100");

        input.close();

        System.out.println("\nThe prime numbers less than or equal to the value of " + max + " are as follows: \n");
        sieveE(max);
        System.out.println("\n\nThank you for playing.");
    }
               
    static void sieveE(int max) {

        boolean sieve[] = new boolean[max+1];
        for(int i = 0; i < max; i++)
        sieve[i] = true;
        
        for(int x = 2; x*x <= max; x++) {
            if(sieve[x] == true) {
                for(int i = x*x; i <= max; i += x)
                sieve[i] = false;
            }
        }
        
        for(int i = 2; i <= max; i++) {
            if(sieve[i] == true)
            System.out.print(i + ", ");
        }
    }
}
