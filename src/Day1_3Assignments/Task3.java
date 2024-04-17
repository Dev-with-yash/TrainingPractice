package Day1_3Assignments;

import java.util.Scanner;

/*
* Write a Java program that reads an integer and print
*  whether it is a prime number using a for loop and if statements.
* */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n==0 || n==1){
            System.out.println("not possible");
        }
        else{
        for (int i = 2; i < n/2; i++) {
            if (n%i == 0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Yes it is a prime number");
        }
        else{
            System.out.println("NO it is a not a prime number");
        }
        }
    }
}
