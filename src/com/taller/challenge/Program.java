package com.taller.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This solution has a O(n^2) time and space complexity.
 */

class Program {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        final Map<Integer, List<Pair>> pairsSums = new HashMap<>();
        final List<Integer[]> quadruplets = new ArrayList<>();

        for (int i = 1; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                int diffToTargetSum = targetSum - currentSum;

                addToQuadruplets(pairsSums, quadruplets, new Pair(array[i], array[j]), diffToTargetSum);
            }

            //Only adding pairs that are 'back' from current number to avoid duplicated quadruplets in the final result
            for (int j = 0; j < i; j++) {
                int currentSum = array[i] + array[j];

                addToPairsSums(pairsSums, currentSum, new Pair(array[i], array[j]));
            }
        }

        return quadruplets;
    }

    private static void addToQuadruplets(Map<Integer, List<Pair>> pairsSums, List<Integer[]> quadruplets, Pair newPair, int diffToTargetSum) {
        if (!pairsSums.containsKey(diffToTargetSum)) {
            return;
        }

        for (Pair pair : pairsSums.get(diffToTargetSum)) {
            final Integer[] quadruplet = new Integer[]{pair.getFirstNumber(), pair.getSecondNumber(),
                    newPair.getFirstNumber(), newPair.getSecondNumber()};

            quadruplets.add(quadruplet);
        }
    }

    private static void addToPairsSums(Map<Integer, List<Pair>> pairsSums, int sum, Pair pair) {
        if (!pairsSums.containsKey(sum)) {
            final List<Pair> pairList = new ArrayList<>();
            pairList.add(pair);
            pairsSums.put(sum, pairList);
        } else {
            pairsSums.get(sum).add(pair);
        }
    }

    public static class Pair {

        private Integer firstNumber;
        private Integer secondNumber;

        public Pair(Integer firstNumber, Integer secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        public Integer getFirstNumber() {
            return firstNumber;
        }

        public Integer getSecondNumber() {
            return secondNumber;
        }
    }
}