package org.stringCalculator_2024;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        int res = 0;

        if (numbers.isEmpty()) {
            res = 0;
        }
        else {
            // Check for custom delimiter
            String delimiter = ",";
            if(numbers.startsWith("//")){

                // Collecting index of \n
                int slashNIndex = numbers.indexOf("\n");

                // Collecting ; as a delimiter
                delimiter = numbers.substring(2,slashNIndex);

                // Number will actually starts from here
                numbers = numbers.substring(slashNIndex+1);
            }

            String[] nums = numbers.split("[" + delimiter+ "\n]");
            int sum = 0;
            // For collecting Negative Integer
            List<Integer> negativeNumbers = new ArrayList<>();
            for(String num : nums){
                int allNum = Integer.parseInt(num.trim());
                if(allNum < 0){
                    negativeNumbers.add(allNum);
                }else if (allNum<=1000){
                    sum+=allNum;
                }

                res = sum;
            }
            if(!negativeNumbers.isEmpty()){
                throw new IllegalArgumentException("Negatives Numbers are not allowed: " + negativeNumbers);
            }
        }

        return res;
    }
}
