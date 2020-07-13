
/* Question :- Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/
//Solution in java 

class Solution {
    public int[] sortedSquares(int[] A) {
        int l=A.length;
        int sq;
        int[] squares = new int[l];
        int temp;
        for(int i=0;i<l;i++)
        {
           sq=A[i]*A[i];
            squares[i]=sq;
        }
        Arrays.sort(squares);
        return squares;
    }
}