package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers = {10,15,20,25,30};
        int sum=0;
        double average =0;
        int largest = numbers[0];


        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i=0; i<numbers.length;i++){
            sum += numbers[i];
            if(largest < numbers[i]){
                largest = numbers[i];
            }

        }
        average = (double)sum/numbers.length;
        System.out.println("average = " + average);
        System.out.println("largest = " + largest);
        System.out.println("sum = " + sum);
    }
}
