package Day1_3Assignments;

//Create a program that simulates a simple calculator
// using command-line arguments to perform
// and print the result of addition, subtraction, multiplication, and division

public class Task2 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }


            System.out.println("Addition: " + (Integer.valueOf(args[0])+Integer.valueOf(args[1])));
            System.out.println("Multiplication: " +(Integer.parseInt(args[0])*Integer.parseInt(args[1])));
            System.out.println("substraction: " + (Integer.parseInt(args[0])-Integer.parseInt(args[1])));
            System.out.println("Division : " + Integer.parseInt(args[0])/Integer.parseInt(args[1]));
    }
}


