
package Find_The_Difference_Q389_Easy;
/*
First Im thinking both strings are almost same but t has one extra character
So my goal is to find that extra character

Im gonna store all elements of s in one array and all elements of t in another array
so its easier for me to compare them one by one

Then Im gonna go through each character in t
For every character, Im gonna check if it exists in s

While checking, if I find a match in s
Im gonna mark that character as used so duplicates dont confuse the result

If I go through all characters in s and still dont find a match
then that means this character is the extra one in t

Once I find that, I stop and return it
*/

class Solution {
    public char findTheDifference(String s, String t) {

        char missing = 'L';

        //Im gonna store all elements in s t in a seperate array
        char[] arr1 = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr1[i] = s.charAt(i);
        }

        char[] arr2 = new char[t.length()];

        for(int i = 0; i < t.length(); i++){
            arr2[i] = t.charAt(i);
        }

        //Next I'm gonna check all the elements that exist in the arrays

        for(int i = 0; i < t.length(); i++){

            boolean found = false; //this is to check if the character exists in s

            for(int j = 0; j < s.length(); j++){

                if(arr2[i] == arr1[j]){

                    arr1[j] = '#'; //Im marking this as used so it wont match again
                    found = true;
                    break; //once found no need to keep checking

                }

            }

            //if I didnt find the character in s, then this is the extra one
            if(!found){
                missing = arr2[i];
                break;
            }

        }

        return missing;

    }
}