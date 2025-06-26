/*Problem Description

Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.



Problem Constraints

1 <= |A| <= 100000

1 <= B <= min(|A|, 500)

1 <= A[i] <= 109



Input Format

The first argument is an integer array A.

The second argument is integer B.



Output Format

Return the Bth smallest element in given array.



Example Input

Input 1:

A = [2, 1, 4, 3, 2]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output

Output 1:

 2
Output 2:

 2


Example Explanation

Explanation 1:

 3rd element after sorting is 2.
Explanation 2:

 2nd element after sorting is 2. */
public class Q3_DSA_Sorting_Basics {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
         /*
        Arrays.sort(A);
        int ans=A[B-1];
        return ans;

        */

        //Selection sort (N^2)

       for (int i = 0; i < B; i++) {
            // finding the minimum element from the remaining array
            int minn = Integer.MAX_VALUE, idx = 0;
            for (int j = i; j < A.length; j++) {
                if (A[j] < minn) {
                    minn = A[j];
                    idx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[idx];
            A[idx] = tmp;
        }
        return A[B - 1];
    }
}