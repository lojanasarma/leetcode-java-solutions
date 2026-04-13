
package is_Power_Of_Two_231;

/*
Thinking Process:

Initially, I implemented the solution using a for loop that runs 'n' times based on the input size.

```
for (int i = 0; i < n; i++) {
    // logic
}
```

However, during submission, the program either took too long to execute or resulted in an error (likely due to large input size and time limit constraints).

After re-reading the problem statement carefully, I noticed that the number of iterations required is actually limited (maximum of 31 as mentioned in the instructions).

So, instead of looping 'n' times, I modified the loop to run only 31 times:

```
for (int i = 0; i < 31; i++) {
    // logic
}
```

This significantly improved performance and avoided timeout issues.

Key Learning:
Always pay close attention to problem constraints. Using input size directly in loops can lead to inefficiencies if the constraints are large. Optimizing based on given limits helps in writing efficient and acceptable solutions.
*/


class Solution {
    public boolean isPowerOfTwo(int n) {

        boolean isPower = false;

        for (int i = 0; i < 31; i++) {

            long result = (long) Math.pow(2, i);

            if (result == n) {

                isPower = true;
                break;//Stop once found

            } else {

                isPower = false;

            }

        }

        return isPower;

    }
}
