package org.stringCalculator_2024;

public class StringCalculator {
    public int add(String numbers) {
        int res = 0;

        if (numbers.isEmpty()) {
            res = 0;
        }else {
            //Split the string, collect all the numbers individually
            String[] nums = numbers.split(",");
            //if only 1 number, then return the same
            if(nums.length==1){
                res = Integer.parseInt(nums[0]);
            }
            // if 2 number, return the sum
            else if (nums.length == 2) {
                res = Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
            }
        }




        return res;
    }
}
