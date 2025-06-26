/*Problem Description

Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



Problem Constraints

1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format

First and only argument is an integer array A.



Output Format

Return 1 if any such integer p is present else, return -1.



Example Input

Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output

Output 1:

 1
Output 2:

 -1


Example Explanation

Explanation 1:

 For integer 2, there are 2 greater elements in the array..
Explanation 2:

 There exist no integer satisfying the required conditions */
public class Q2_DSA_Sorting_Basics {
    public int solve(int[] A) {
         /*
        //Brute force; O(N^2)

        int count_of_noble=0;
        int count_of_numbers_less_than_A_i=0;

        for(int i=0;i<A.length;i++)
        {
            count_of_numbers_less_than_A_i=0;
            for(int j=0;j<A.length;j++)
            {
                if(A[j]>A[i])
                    count_of_numbers_less_than_A_i++;
            }

            if(count_of_numbers_less_than_A_i==A[i])
                count_of_noble++;
        }

        if(count_of_noble==0)
            return -1;
        else
            return 1;

        */


            //

            int ans=0;
            int count_of_elements_greater_than_A_of_i=0;
            int temp=0;

            Arrays.sort(A);

            for(int i=A.length-2;i>=0;i--) 
            {
                

               if (A[i] == A[i + 1]) 
                continue;

            // Number of elements greater than A[i] = A.length - 1 - i
            if (A[i] == A.length - 1 - i) 
                {
                    return 1;
                }

            }

import java.util.Arrays;


            if (A[A.length - 1] == 0)
            return 1;

        return -1;
    }
}
