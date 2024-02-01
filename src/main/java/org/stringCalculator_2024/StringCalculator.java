package org.stringCalculator_2024;

public class StringCalculator {
    public int add(String numbers) {
        int res = 0;

        if (numbers.isEmpty()) {
            res = 0;
        }else {
            try {
                res = Integer.parseInt(numbers);
            }catch (NumberFormatException e){
                System.out.println("Invalid Format");
            }
        }




        return res;
    }
}
