package com.company;

import java.util.*;

public class BrothersInBar {

    public static int brothersInTheBar(int[] glasses) {
        List<Integer> intList = new LinkedList<>();
        // converting array into linked list
        for (int i : glasses) {
            intList.add(i);
        }

        int currentNum = Integer.MIN_VALUE; // current number
        int len = 0; // length of consecutive numbers
        int shots = 0; // number of shots drank
        int numOfIterations = 1; // number of iterations performed
        for (int j = 0; j < numOfIterations; j++) { // first loop where j is less than numOfIterations(1)

            for (int i = 0; i < intList.size(); i++) { // second loop that goes through the list
                int numAtI = intList.get(i); // current num
                if (currentNum != numAtI) { // checking if a the new number is different from the previous, thus resetting the counting
                    currentNum = numAtI;
                    len = 1;
                } else { // in the other case incrementing the length
                    len++;
                }
                if (len == 3) { // checking every time if length has become 3
                    // if yes removing the current and previous two elements
                    intList.remove(i);
                    intList.remove(i - 1);
                    intList.remove(i - 2);
                    i = 0; // resetting i
                    len = 0; // resetting len
                    numOfIterations++; // increasing the number of iterations to be done on the list
                    shots++; // incrementing shots drank
                }
            }
            len = 0; // resetting len again, because the previous iteration could finish with len at 2
                     // and then if the first element of the array is the same as the last one
                     // we could get and index out of bounds ex
        }
        return shots;
    }

    public static void main(String[] args) {
        // write your code here
        int[] glasses = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 10, 3, 3, 3, 120000, 120000, 120000, -100000, -100000, -100000, -100000};
        System.out.println(brothersInTheBar(glasses));
    }

}