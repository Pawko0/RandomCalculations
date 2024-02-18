package org.example.service;

public class SmithNumberService implements SmithNumberInterface {

    @Override
    public boolean isSmithNumber(int number) {
        return sumOfFactors(number) == sumOfDigits(number);
    }

    @Override
    public int sumOfFactors(int number) {
        int sum = 0;
        int counter = 0;
        for (int i = 2; i <= number; i++){
            while (number % i == 0){
                number /= i;
                sum += sumOfDigits(i);
                counter++;
            }
        }
        if (counter < 2){
            return -1;
        }
        return sum;
    }

    @Override
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }


}
