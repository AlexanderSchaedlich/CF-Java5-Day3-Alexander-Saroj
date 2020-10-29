
package Saroj;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*double number = 10.0;
        if (number == 0) {
            System.out.println("number is zero");
        } else if (number < 0) {
            System.out.println("number is negative");
        } else if (number > 0) {
            System.out.println("number is positive");
        }
        if (number<1){
            System.out.println("number is small");
        }
        else if  (number > 1000000){
            System.out.println("number is large");
        }*/
/*
        int x = 2;
        switch (x) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Thursday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
            default:
                System.out.print("sunday");

        }*/
// Even or odd excercise
       /* int n = 3;
        if (n%2 == 0){
            System.out.print( n+ " is Even ");
        }
        else{
            System.out.print( n+ "is odd ");
        }*/
        /*int a = 52;
        int b = 11;
        int c = 24;
        int maximum;
        if (a > b && a > c) {
            System.out.print("The biggest one is " + a);
            if(b>c){
                System.out.print("The 2nd one is " + b +" and smallest one is" +c);
            }
            else {
                System.out.print("The 2nd one is " + c +" and smallest one is" +b);
            }

        } else if (b > c && b > a) {
            System.out.print("The biggest one is " + a);
            if(a>c){
                System.out.print("The 2nd one is " + a +" and smallest one is" +c);
            }
            else {
                System.out.print("The 2nd one is " + c +" and smallest one is" +a);
            }
        } else {
            System.out.print("The biggest one is " + c);
            if(b>a){
                System.out.print("The 2nd one is " + b +" and smallest one is" +a);
            }
            else {
                System.out.print("The 2nd one is " + a +" and smallest one is" +b);
            }
        }*/

        /*for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }*/
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.print("Enter second number- ");
        int b = sc.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }

        }
        else {

            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }

            }

            }*/
        int[] array = {3, 5, 6, 10, 0, 23, 19, 11, 30, 9, 0};
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and find in the array");
        int usernumber = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (usernumber == array[i]) {
                counter++;

            }

        }
        if (counter == 0) {
            System.out.print("Item not found");
        } else {

            System.out.print(counter);
        }
    }
}

