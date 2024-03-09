//Sieve of Erastostenes Java App

package RSEG_126.SieveOfErastosthenes;


import java.util.Arrays;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nWelcome to MY UPDATED Sieve of Erastosthenes...\n");
        
        System.out.print("Enter a number for the upper limit: ");

        int n = 100;
        // int n = input.nextInt();
        input.close();

        System.out.print("\nThe prime numbers that are less than or equal to the value of ");
        System.out.println(n + " are as follows:\n ");
        sieveE(n);
        System.out.println("\n\n");
    }
               
    static void sieveE(int n) {

        boolean sievePrime[] = new boolean[n+1];
        for(int i = 0; i < n; i++)
        sievePrime[i] = true;
        
        for(int x = 2; x*x <= n; x++) {
            if(sievePrime[x] == true) {
                for(int i = x*x; i <= n; i += x)
                sievePrime[i] = false;
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if(sievePrime[i] == true)
            System.out.print(i + ", ");
        }
    }
}
