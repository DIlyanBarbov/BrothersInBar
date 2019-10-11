package com.company;

import java.util.*;

public class BrothersInBar {

    public static int brothersInTheBar(int[] glasses) {
        List<Integer> intList = new LinkedList<>();
        for (int i : glasses) {
            intList.add(i);
        }
        int num = Integer.MIN_VALUE;
        int len = 0;
        int shots = 0;
        int numOfIterations = 1;
        for (int j = 0; j < numOfIterations; j++) {
            for (int i = 0; i < intList.size(); i++) {
                int numAtI = intList.get(i);
                if (num != numAtI) {
                    num = numAtI;
                    len = 1;
                } else {
                    len++;
                }
                if (len == 3) {
                    intList.remove(i);
                    intList.remove(i - 1);
                    intList.remove(i - 2);
                    i = 0;
                    len = 0;
                    numOfIterations++;
                    shots++;
                }
            }
            len = 0;
        }
        return shots;
    }

    public static void main(String[] args) {
        // write your code here
        int[] glasses = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 10, 3, 3, 3, 120000, 120000, 120000, -100000, -100000, -100000, -100000};
        System.out.println(brothersInTheBar(glasses));
    }

}
/*
{1, 1, 2, 3, 3, 3, 2, 2, 1, 1}
{1, 1, 2, 1, 2, 2, 1, 1}
{1, 1, 2, 1, 2, 2, 1, 1, 1, 3, 3, 3, 2, 4, 5, 5, 5}
{5, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 3, 3, 3, 2, 4, 5, 5, 5, 5, 5}
{10, 3, 3, 3, 120000, 120000, 120000, -100000, -100000, -100000, -100000}
{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 10, 3, 3, 3, 120000, 120000, 120000, -100000, -100000, -100000, -100000}
 */