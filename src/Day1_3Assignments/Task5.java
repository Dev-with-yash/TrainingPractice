package Day1_3Assignments;
/*
* a) Given an array of integers,
*  write a program that finds if there are two numbers that add up to a specific target.
*  You may assume that each input would have exactly one solution,
*  and you may not use the same element twice. Optimize the solution for time complexity.
* */


import java.util.HashSet;
public class Task5 {
    public static int[] hasTwoSum(int[] nums, int target) {

        HashSet<Integer> seenNumbers = new HashSet<>();
        int[] arr = new int[2];

        for (int num : nums) {
          
            int complement = target - num;

            if (seenNumbers.contains(complement)) {
                arr[0]= complement;
                arr[1] = target - complement;
            }
            seenNumbers.add(num);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 9, 15, 9};
        int target = 11;
        int arr[] = new int[2];
        arr = hasTwoSum(nums, target);
        for(int num : arr){
            System.out.println(num);
        }



//        if (result) {
//            System.out.println("There exist two numbers that add up to the target.");
//        } else {
//            System.out.println("There do not exist");
//        }
    }
}

