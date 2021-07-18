package Luxcity;

import java.util.Arrays;

public class A012_FourLetters {

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

        public static int solution(int[] A) {
            // write your code in Java SE 8
            Arrays.sort(A);
            int[] sorted = Arrays.stream(A).filter(x -> x > 0).distinct().toArray();

            for (int i = 1; i <= sorted.length ; i++) {
                if (i != sorted[i -1]){
                    return i;
                }
            }
            return sorted.length + 1;

        }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, -3}));
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));

    }
}


/*

Example test:   [1, 3, 6, 4, 1, 2]
WRONG ANSWER (got 0 expected 5)

Example test:   [1, 2, 3]
WRONG ANSWER (got 0 expected 4)

Example test:   [-1, -3]
WRONG ANSWER (got 0 expected 1)

 */
 /*
    This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

*/