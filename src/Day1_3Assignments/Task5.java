package Day1_3Assignments;
/*
* a) Given an array of integers,
*  write a program that finds if there are two numbers that add up to a specific target.
*  You may assume that each input would have exactly one solution,
*  and you may not use the same element twice. Optimize the solution for time complexity.
* */


import java.util.HashSet;
public class Task5 {
    public static boolean hasTwoSum(int[] nums, int target) {

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
          
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                return true;
            }
            seenNumbers.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        boolean result = hasTwoSum(nums, target);

        if (result) {
            System.out.println("There exist two numbers that add up to the target.");
        } else {
            System.out.println("There do not exist");
        }
    }
}

