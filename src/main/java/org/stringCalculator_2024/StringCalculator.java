package org.stringCalculator_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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

                // Picking up the starting point example [***] = '['
                int delimiterStart = numbers.indexOf("//") + 2;

                //Picking up the end point example [***]\n = ']'
                int delimiterEnd = numbers.indexOf("\n");

                String delimiterLine = numbers.substring(delimiterStart, delimiterEnd);

                // Extract all delimiters enclosed in square brackets
                String[] customDelimiters = delimiterLine.split("\\[|\\]");

                StringBuilder custmDelRex = new StringBuilder();
                for(String custom : customDelimiters){
                    if(!custom.isEmpty()){
                        if(custmDelRex.length()>0){
                            custmDelRex.append("|");
                        }
                        // Creating regular expression pattern separating with "|"
                        custmDelRex.append(Pattern.quote(custom));
                    }
                }
                delimiter=custmDelRex.toString();
                numbers=numbers.substring(delimiterEnd+1);

            }

            String[] nums = numbers.split("[" + delimiter+ "\n]");
            int sum = 0;
            // For collecting Negative Integer
            List<Integer> negativeNumbers = new ArrayList<>();
            for(String num : nums){
                if (!num.isEmpty()) {
                    int allNum = Integer.parseInt(num.trim());
                    if (allNum < 0) {
                        negativeNumbers.add(allNum);
                    } else if (allNum <= 1000) {
                        sum += allNum;
                    }
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
