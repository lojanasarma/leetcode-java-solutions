
package Is_Power_Of_Four_Q342;

/*
This question looked similar to "Power of Two" (Q231) which I did earlier.
Then here they are asking power of 4.
I used the same approach as power of two.
*/
class Solution {
    public boolean isPowerOfFour(int n) {

        boolean isPower = false;

        for(int i=0;i<31;i++){

            long result = (long) Math.pow(4,i);

            if(result == n){

                isPower = true;
                break;//Stop once found
            }
        }

        return isPower;

    }
}
