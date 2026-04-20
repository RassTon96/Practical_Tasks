package TasksOnAlgorithm;

import java.util.HashSet;

public class TasksOnAlgorithm {

    // Задача по алгоритмам №1
    public void divisionAlgorithm(int givenNum) {
        int stepsToZero = 0;
        int num = givenNum;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            stepsToZero++;
        }

        System.out.println("От числа " + givenNum + " до 0, минимальное количество шагов - " + stepsToZero);
    }

    // Задача по алгоритмам №2
    public int longestStreak(int[] nums) {
        int count = 0;
        int longestStreak = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
                if (longestStreak < count) {
                    longestStreak = count;
                }
            }
        }
        return longestStreak;
    }

    // Задача по алгоритмам №3
    public String shortenString(String string) {
        char current = string.charAt(0);
        int count = 0;
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (current == string.charAt(i)) {
                count++;
            } else {
                result += String.valueOf(current) + count;
                count = 1;
                current = string.charAt(i);
            }
        }
        result += String.valueOf(current) + count;
        return result;
    }

    // Задача по алгоритмам №4
    public boolean hasPairWithDiff(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
            if (set.contains(x - k) || set.contains(x + k)) {
                return true;
            }
        }
        return false;
    }
}