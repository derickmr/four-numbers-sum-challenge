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
        final Map<Integer, List<Pair>> pairsSum = new HashMap<>();
        final List<Integer[]> quadruplets = new ArrayList<>();

        for (int i = 1; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                int diffToTargetSum = targetSum - currentSum;

                final List<Integer[]> quadrupletsForCurrentPair = getQuadrupletsForPair(new Pair(array[i], array[j]), pairsSum, diffToTargetSum);

                if (quadrupletsForCurrentPair != null) {
                    quadruplets.addAll(quadrupletsForCurrentPair);
                }
            }

            //Only adding pairs that are 'back' from current number to avoid duplicated quadruplets in the final result
            for (int j = 0; j < i; j++) {
                addPairToPairsSum(new Pair(array[i], array[j]), pairsSum);
            }
        }

        return quadruplets;
    }

    private static List<Integer[]> getQuadrupletsForPair(Pair pair, Map<Integer, List<Pair>> pairsSum, int diffToTargetSum) {
        if (!pairsSum.containsKey(diffToTargetSum)) {
            return null;
        }

        final List<Integer[]> quadruplets = new ArrayList<>();

        for (Pair matchingPair : pairsSum.get(diffToTargetSum)) {
            final Integer[] quadruplet = new Integer[]{matchingPair.getFirstNumber(), matchingPair.getSecondNumber(),
                    pair.getFirstNumber(), pair.getSecondNumber()};

            quadruplets.add(quadruplet);
        }

        return quadruplets;
    }

    private static void addPairToPairsSum(Pair pair, Map<Integer, List<Pair>> pairsSum) {
        int currentSum = pair.getFirstNumber() + pair.getSecondNumber();

        if (!pairsSum.containsKey(currentSum)) {
            final List<Pair> pairList = new ArrayList<>();
            pairList.add(pair);
            pairsSum.put(currentSum, pairList);
        } else {
            pairsSum.get(currentSum).add(pair);
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