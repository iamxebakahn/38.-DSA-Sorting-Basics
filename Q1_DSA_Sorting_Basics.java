/*Problem Description

Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.



Problem Constraints

0 <= N <= 1000
1 <= A[i] <= 103



Input Format

First and only argument is an integer array A.



Output Format

Return an integer denoting the total cost of removing all elements from the array.



Example Input

Input 1:

 A = [2, 1]
Input 2:

 A = [5]


Example Output

Output 1:

 4
Output 2:

 5


Example Explanation

Explanation 1:

 Given array A = [2, 1]
 Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 Remove 1 from the array => []. Cost of this operation is (1) = 1.
 So, total cost is = 3 + 1 = 4.
Explanation 2:

 There is only one element in the array. So, cost of removing is 5. */

public class Q1_DSA_Sorting_Basics {
    public int solve(int[] A) {
         /*
        //O(N^2)
        Arrays.sort(A);
        int total_cost=0;
        
        for(int i=A.length-1;i>=0;i--)
        {
            int cost=0;
            for(int j=i;j>=0;j--)
            {
                cost+=A[j];
            }

            total_cost+=cost;
        }

        return total_cost;
        */

        /*

        //O(NlogN) but with contribution technique
        Arrays.sort(A);
        int total_cost=0;
        for(int i=A.length-1;i>=0;i--)
            total_cost=total_cost+((A.length-i)*A[i]);

        return total_cost;

        */

        //O(NlogN) but with prefix array technique
        Arrays.sort(A); 
        int[] pref=new int[A.length];
        pref[0]=A[0];
        for(int i=1;i<A.length;i++)
            pref[i]=pref[i-1]+A[i];

        int total_cost=0;
        for(int i=A.length-1;i>=0;i--)
            total_cost=total_cost+pref[i];

        

        return total_cost;
    }
}
