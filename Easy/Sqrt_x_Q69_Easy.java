
package Sqrt_x__Q69_Easy;

/*
Intuition - Problem Understanding

At first, I carefully read the problem to understand what is required.

During the solution process, I realized that I need to use Math.sqrt()
to compute the square root of the given number.

Since the problem expects an integer result, I converted the sqrt output
to a floor integer using type casting (int).

After applying this approach and testing with examples,
I was able to complete the solution successfully.
*/
import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {

        if(x<0){

            return -99;//Imaginary

        }else{

            return (int) Math.floor(Math.sqrt(x));

        }

    }

    public static void main(String[] args){

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Getting user input
        System.out.println("Enter an Integer to find it's square root : ");
        int x = sc.nextInt();

        //Solution object
        Solution solution = new Solution();
        solution.mySqrt(x);

    }
}
