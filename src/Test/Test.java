package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        int number = 1;
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
        */

        /*
        double number1 = -1;
        if (number1 == 0) {
            System.out.println("number is zero");
        } else if (number1 < 0) {
            System.out.println("number is negative");
        } else if (number1 > 0) {
            System.out.println("number is positive");
        }
        if (number1<1){
            System.out.println("number is small");
        }
        else if  (number1 > 1000000){
            System.out.println("number is large");
        }
        */

        /*
        int day = 2;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
        */
        /*
        double number2 = 12;
        double number3 = 12;
        if (number2>number3) {
            System.out.println("First number is the maximum. It's " + number2);
        } else if (number3>number2) {
            System.out.println("Second number is the maximum. It's " + number3);
        } else {
            System.out.println("The numbers are equal. Their value is " + number2);
        }
        */

        /*
        double number4 = 34;
        if (number4 % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (number4 % 5 == 0) {
            System.out.println("Buzz");
        } else if (number4 % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(number4);
        }
         */ // arrange the array in acceding

        /*
        /*int[] intArray = {52, 11, 24};

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int currentElement = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = currentElement;
                }
            }
        }

        for (int element : intArray) {
            System.out.println(element);
        }*/

       

        /*
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        int sum = number * (number + 1) / 2;
        System.out.println(sum);
         */

        /*
        int[] intArray = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a number:");
            intArray[i] = input.nextInt();
        }

        for (int number : intArray) {
            System.out.println(number);
        }
         */
        String[] foodPortion = {
                "1 l  milk",
                "1 slice of bread",
                "100 gr chicken breast",
                "200 gr salad"
        };
        int[] kcalPerPortion = {62, 74, 165, 33};
        int[] breakfast = {2, 4, 1, 0};
        int[] lunch = {2, 4, 2, 5};
        int[] dinner = {2, 4, 1, 0};
        int counter = 0;

        System.out.println("BREAKFAST");
        System.out.println("============");
        for (int i = 0; i < foodPortion.length; i++) {
            if (breakfast[i] == 0) {
                continue;
            }
            System.out.println(breakfast[i] + " x " + foodPortion[i]);
            counter += kcalPerPortion[i];
        }

        System.out.println("");
        System.out.println("LUNCH");
        System.out.println("============");
        for (int i = 0; i < foodPortion.length; i++) {
            if (lunch[i] == 0) {
                continue;
            }
            System.out.println(lunch[i] + " x " + foodPortion[i]);
            counter += kcalPerPortion[i];
        }

        System.out.println("");
        System.out.println("DINNER");
        System.out.println("============");
        for (int i = 0; i < foodPortion.length; i++) {
            if (dinner[i] == 0) {
                continue;
            }
            System.out.println(dinner[i] + " x " + foodPortion[i]);
            counter += kcalPerPortion[i];
        }

        System.out.println("");
        System.out.println("The total amount of kcal is " + counter);
    }
}
