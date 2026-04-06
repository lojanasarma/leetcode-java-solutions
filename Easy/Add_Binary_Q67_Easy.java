
package Add_Binary_Q67_Easy;
import java.util.Scanner;
import java.math.BigInteger;

/*
 * Initially, I attempted to perform binary addition manually.
 * I assumed that:
 * - 0 + 0 results in 0
 * - 1 + 0 results in 1
 * - 1 + 1 results in 1 coming forward while 1 remains in the same position
 * However, this understanding was incorrect according to the proper rules of binary addition.
 *
 * My initial idea was to simulate manual addition, but I realized it was flawed.
 *
 * Next, I tried converting the binary strings into integers, adding them,
 * and then converting the result back into a string. This approach was based
 * on type casting concepts I studied in my Introduction to Programming module
 * (Year 1, Semester 1). However, this method was also incorrect for handling
 * binary values properly.
 *
 * Finally, I used AI guidance to understand a better approach. I implemented
 * the correct solution by converting binary strings into integers using base 2,
 * performing the addition, and then converting the result back into a binary string.
 */

//1. Widening Casting (Implicit)
/*int a = 10;
  double b = a;*/

//2. Narrowing Casting (Explicit)
/*double a = 10.5;
  int b = (int) a;*/

//3. Upcasting (Object)
/*Dog d = new Dog();
Animal a = d;*/

//4. Downcasting (Object)
/*Animal a = new Dog();
  Dog d = (Dog) a; */

//5. Type Promotion
/*byte a = 10, b = 20;
  int c = a + b; */

//6. Autoboxing
/*int a = 10;
  Integer obj = a; */

//7. Unboxing
/*Integer obj = 20;
  int a = obj; */

//8. String → Primitive
/*int a = Integer.parseInt("100"); */

//9. Primitive → String
/*int a = 100;
  String s = String.valueOf(a); */

class Add_Binary_Q67_Easy {
    public String addBinary(String a, String b) {

        // Convert binary string → BigInteger
        BigInteger a_int = new BigInteger(a, 2);
        BigInteger b_int = new BigInteger(b, 2);

        // Add
        BigInteger result_in_int = a_int.add(b_int);

        // Convert back to binary string
        String result_in_Binary_string = result_in_int.toString(2);

        return result_in_Binary_string;
    }

    public static void main(String[] args) {

        //Creating scanner object to get User input
        Scanner sc = new Scanner(System.in);

        //Getting user input as String
        System.out.println("Enter 1st String a :");
        String a = sc.nextLine();

        //Getting user input as String
        System.out.println("Enter 2nd String b :");
        String b = sc.nextLine();

        //Creating Solution object
        Add_Binary_Q67_Easy solution = new Add_Binary_Q67_Easy();
        String output = solution.addBinary(a, b);

        //Output
        System.out.println(output);

    }

}