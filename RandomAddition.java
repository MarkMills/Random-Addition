//Mark Mills feb 12,2022
import java.util.*;
class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create scanner
        int number1 = (int)(Math.random() * 100);
        //create random number under 100
        int number2 = (int)(Math.random() * 100);
        //create random number under 100
        System.out.print("What is " +number1+ " + " + number2+" ?");
        //print the addition question
        int answer = input.nextInt();
        //get user input for answer
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
            //if statement to see if the user is correct
        else {
            System.out.println("You are incorrect.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
            //else statement if the user is incorrect
        }
    }
}