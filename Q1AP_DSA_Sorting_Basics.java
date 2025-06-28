/*Problem Description

Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.



Problem Constraints

2 <= N <= 105

-109 <= A[i] <= 109



Input Format

The first and only argument is an integer array A of size N.



Output Format

Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.



Example Input

Input 1:

 A = [3, 5, 1]
Input 2:

 A = [2, 4, 1]


Example Output

Output 1:

 1
Output 2:

 0 */

public class Q1AP_DSA_Sorting_Basics {
    public int solve(int[] A) {
        
        Arrays.sort(A);
        int diff=A[1]-A[0];
        int temp=0;
        for(int i=1;i<A.length-1;i++)
        {
            temp=A[i+1]-A[i];

            if(temp!=diff)
                return 0;
        }

        return 1;

    }
}
