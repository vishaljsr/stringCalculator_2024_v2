package org.stringCalculator_2024;

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
            for(String num : nums){
                sum+= Integer.parseInt(num.trim());
                res = sum;
            }
        }

        return res;
    }
}
