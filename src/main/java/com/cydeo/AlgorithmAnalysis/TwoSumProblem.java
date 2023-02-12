package com.cydeo.AlgorithmAnalysis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    /**
     * need to ask first
     * Is array sorted?
     * Do I have duplicates values
     *
     * after that we can create pseudo code
     */
    public static void main(String[] args) {
        int[] arr = {3,3,5,1,7};
        int target = 6;
        System.out.println(Arrays.toString(sumOfTwo(arr,target)));
        System.out.println(Arrays.toString(sumOfTwoSolutionWithMap(arr,target)));

    }
    private static int[] sumOfTwo (int[] array , int target){
/**
 * its O(n2) time complexity
 */

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target){

                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    private static int[] sumOfTwoSolutionWithMap (int[] array, int target){
        /**
         * this is O(n) time complexity
         */
        Map<Integer,Integer> map = new HashMap<>();
        //Create Map where Key is element of array and Value is index of element
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            //Create int value with name complement where our target minus element i.
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
                //if our map contains complement we return int array with value of complement and out i(index)
            }
            map.put(array[i],i);
            //if our map doent contains our complement we add our element to the map as a key and index of that element as a value
        }
        return new int[0];
        //if our array doesnt have answer return just empty array
    }

}
/*
    •Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
    • You may assume that each input would have exactly one solution, and you
may not use the same element twice.
    • You can return the answer in any order.
    • No solution will return empty array.

    Example:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation:
    Because nums[0] + nums[1] == 9, we return [0, 1].
 */
