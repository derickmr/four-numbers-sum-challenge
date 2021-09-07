package com.taller.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Program {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        final Map<Integer, List<Pair>> pairsSums = new HashMap<>();
        final List<Integer[]> quadruplets = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                int sum = array[i] + array[j];
                int diff = targetSum - sum;

                if (pairsSums.containsKey(diff)) {
                    for (Pair pair : pairsSums.get(diff)) {
                        addToQuadruplets(pair, new Pair(array[i], array[j]), quadruplets);
                    }
                }
            }

            for (int j = 0; j < i; j++) {

                int sum = array[i] + array[j];
                final Pair pair = new Pair(array[i], array[j]);

                if (!pairsSums.containsKey(sum)) {
                    addPairSum(pairsSums, sum, pair);
                } else {
                    pairsSums.get(sum).add(pair);
                }
            }

        }
        return quadruplets;
    }

    private static void addPairSum(Map<Integer, List<Pair>> pairsSums, int sum, Pair pair) {
        final List<Pair> pairList = new ArrayList<>();
        pairList.add(pair);
        pairsSums.put(sum, pairList);
    }

    private static void addToQuadruplets(Pair firstPair, Pair secondPair, List<Integer[]> quadruplets) {
        final Integer[] quadruplet = new Integer[]{firstPair.getFirstNumber(), firstPair.getSecondNumber(), secondPair.getFirstNumber(), secondPair.getSecondNumber()};
        quadruplets.add(quadruplet);
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