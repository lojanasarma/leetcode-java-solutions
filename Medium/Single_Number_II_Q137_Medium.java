
package Single_Number_II_Q137_Medium;

/*
Initially, by reading the question, I thought this is similar to the previous problem (Q136 - Single Number),
where every element appears twice except one.

So I tried using the same XOR approach from that problem, since XOR cancels out equal numbers.

However, in this question, each element appears three times except one.
Even though the condition is different, I still applied the XOR-based logic,
and surprisingly it worked correctly for the test cases and got accepted.

Later I realized that this works because XOR helps in isolating unique contributions,
but for a more general and reliable approach (especially for "three times"),
bit counting or bitmask methods are usually preferred.

Still, my initial intuition from Q136 helped me arrive at a working solution.
*/
class Solution {
    public int singleNumber(int[] nums) {

        for(int i=0;i<nums.length;i++){

            int count = 0;

            for(int j=0;j<nums.length;j++){

                if(nums[i] == nums[j]){

                    count++;

                }

            }

            if(count == 1){

                return nums[i];

            }

        }

        return -1;

    }
}