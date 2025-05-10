package Day8;
import java.util.*;
public class PrimeFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its prime factors:");
        int n = sc.nextInt();
        System.out.print("Prime factors of " + n + " are: ");
        for (int i = 2; i <=n/2; i++) {
            if(n % i ==0 && isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    public static boolean isPrime(int i){
        for(int itr=2;itr<=i/2;itr++){
            if(i%itr==0){
                return false;
            }
        }
        return true;
    }
}
// package Day8;
// import java.util.*;

// public class PrimeFactors {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number to find its prime factors:");
//         int n = sc.nextInt();
//         System.out.print("Prime factors of " + n + " are: ");
        
//         for (int i = 2; i <= n; i++) { // Loop up to n
//             if (n % i == 0 && isPrime(i)) { // Check if i is a factor and prime
//                 System.out.print(i+" ");
//             }
//         }
        
//         sc.close(); // Close the scanner
//     }

//     public static boolean isPrime(int i) {
//         if (i <= 1) return false; // 0 and 1 are not prime numbers
//         for (int itr = 2; itr <= Math.sqrt(i); itr++) { // Check up to the square root of i
//             if (i % itr == 0) {
//                 return false; // Not a prime number
//             }
//         }
//         return true; // It is a prime number
//     }
// }

