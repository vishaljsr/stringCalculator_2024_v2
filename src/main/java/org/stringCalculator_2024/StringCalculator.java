package org.stringCalculator_2024;

public class StringCalculator {
    public int add(String numbers) {
        int res = 0;

        if (numbers.isEmpty()) {
            res = 0;
        }
        else {
           // split the number individually ,add them and return the sum
           String[] nums = numbers.split(",");
           int sum = 0;
           for (String num : nums){
               sum += Integer.parseInt(num.trim());
               // trim is being used in case of spaces befor or after commas.
               res = sum;
           }
        }




        return res;
    }
}
