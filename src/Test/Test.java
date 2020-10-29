package Test;

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
    }
}
