/* Que:- Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.   */


class Solution {
    public int[] plusOne(int[] digits) {
      int n = digits.length;
    for(int i=n-1; i>=0; i--)
    {
        if(digits[i]!=9)
        {
            digits[i]++;
            return digits;
        }
        else
            digits[i]=0;
    }
    
    int[] ni = new int[n+1];
    ni[0]=1;
    for(int i=1; i<n+1; i++)
        ni[i]=0;
    return ni;
        
    }
}
