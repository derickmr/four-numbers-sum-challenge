package com.taller.challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramTest {

    /**
     * Test Case 1
     * <p>
     * Input:
     * {
     * "array": [7, 6, 4, -1, 1, 2],
     * "targetSum": 16
     * }
     * <p>
     * Output:
     * [
     * [7, 6, 4, -1],
     * [7, 6, 1, 2]
     * ]
     */
    @Test
    public void testFirstCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{7, 6, 4, -1});
        quadruplets.add(new Integer[]{7, 6, 1, 2});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 2
     * <p>
     * Input:
     * {
     * "array": [1, 2, 3, 4, 5, 6, 7],
     * "targetSum": 10
     * }
     * <p>
     * Output:
     * [
     * [1, 2, 3, 4]
     * ]
     */
    @Test
    public void testSecondCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{1, 2, 3, 4});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 3
     * <p>
     * Input:
     * {
     * "array": [5, -5, -2, 2, 3, -3],
     * "targetSum": 0
     * }
     * <p>
     * Output:
     * [
     * [5, -5, -2, 2],
     * [5, -5, 3, -3],
     * [-2, 2, 3, -3]
     * ]
     */
    @Test
    public void testThirdCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{5, -5, -2, 2, 3, -3}, 0);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{5, -5, -2, 2});
        quadruplets.add(new Integer[]{5, -5, 3, -3});
        quadruplets.add(new Integer[]{-2, 2, 3, -3});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 4
     * <p>
     * Input:
     * {
     * "array": [-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9],
     * "targetSum": 4
     * }
     * <p>
     * Output:
     * [
     * [-2, -1, 1, 6],
     * [-2, 1, 2, 3],
     * [-2, -1, 2, 5],
     * [-2, -1, 3, 4]
     * ]
     */
    @Test
    public void testFourthCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{-2, -1, 1, 6});
        quadruplets.add(new Integer[]{-2, 1, 2, 3});
        quadruplets.add(new Integer[]{-2, -1, 2, 5});
        quadruplets.add(new Integer[]{-2, -1, 3, 4});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 5
     * <p>
     * Input:
     * {
     * "array": [-1, 22, 18, 4, 7, 11, 2, -5, -3],
     * "targetSum": 30
     * }
     * <p>
     * Output:
     * [
     * [-1, 22, 7, 2],
     * [22, 4, 7, -3],
     * [-1, 18, 11, 2],
     * [18, 4, 11, -3],
     * [22, 11, 2, -5]
     * ]
     */
    @Test
    public void testFifthCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3}, 30);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{-1, 22, 7, 2});
        quadruplets.add(new Integer[]{22, 4, 7, -3});
        quadruplets.add(new Integer[]{-1, 18, 11, 2});
        quadruplets.add(new Integer[]{18, 4, 11, -3});
        quadruplets.add(new Integer[]{22, 11, 2, -5});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 6
     * <p>
     * Input:
     * {
     * "array": [-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5],
     * "targetSum": 20
     * }
     * <p>
     * Output:
     * [
     * [-5, 2, 15, 8],
     * [-3, 2, -7, 28],
     * [-10, -3, 28, 5],
     * [-10, 28, -6, 8],
     * [-7, 28, -6, 5],
     * [-5, 2, 12, 11],
     * [-5, 12, 8, 5]
     * ]
     */
    @Test
    public void testSixthCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, 20);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{-5, 2, 15, 8});
        quadruplets.add(new Integer[]{-3, 2, -7, 28});
        quadruplets.add(new Integer[]{-10, -3, 28, 5});
        quadruplets.add(new Integer[]{-10, 28, -6, 8});
        quadruplets.add(new Integer[]{-7, 28, -6, 5});
        quadruplets.add(new Integer[]{-5, 2, 12, 11});
        quadruplets.add(new Integer[]{-5, 12, 8, 5});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 7
     * <p>
     * Input:
     * {
     * "array": [1, 2, 3, 4, 5],
     * "targetSum": 100
     * }
     * <p>
     * Output:
     * []
     */
    @Test
    public void testSeventhCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5}, 100);
        List<Integer[]> quadruplets = new ArrayList<>();

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    /**
     * Test Case 8
     * <p>
     * Input:
     * {
     * "array": [1, 2, 3, 4, 5, -5, 6, -6],
     * "targetSum": 5
     * }
     * <p>
     * Output:
     * [
     * [2, 3, 5, -5],
     * [1, 4, 5, -5],
     * [2, 4, 5, -6],
     * [1, 3, -5, 6],
     * [2, 3, 6, -6],
     * [1, 4, 6, -6]
     * ]
     */
    @Test
    public void testEighthCase() {
        List<Integer[]> output = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, 5);
        List<Integer[]> quadruplets = new ArrayList<>();
        quadruplets.add(new Integer[]{2, 3, 5, -5});
        quadruplets.add(new Integer[]{1, 4, 5, -5});
        quadruplets.add(new Integer[]{2, 4, 5, -6});
        quadruplets.add(new Integer[]{1, 3, -5, 6});
        quadruplets.add(new Integer[]{2, 3, 6, -6});
        quadruplets.add(new Integer[]{1, 4, 6, -6});

        assertTrue(isMatchingQuadruplets(quadruplets, output));
    }

    private boolean isMatchingQuadruplets(List<Integer[]> quadruplets, List<Integer[]> output) {
        return quadruplets.size() == output.size() && areEquals(quadruplets, output);
    }

    private boolean areEquals(List<Integer[]> quadruplets, List<Integer[]> output) {
        sortQuadruplet(output);
        sortQuadruplet(quadruplets);

        for (int i = 0; i < quadruplets.size(); i++) {
            if (!Arrays.equals(quadruplets.get(i), output.get(i))) {
                return false;
            }
        }

        return true;
    }

    private void sortQuadruplet(List<Integer[]> quadruplets) {
        for (Integer[] quadruplet : quadruplets) {
            Arrays.sort(quadruplet);
        }
    }

}