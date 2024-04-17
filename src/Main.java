
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int a = 0; int b = 1;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      System.out.print(a + " " + b + " ");

      for(int i = 2; i<n; i++){
         int c = a+b;
         a = b;
         b = c;
         System.out.print(b + " ");
      }
    }
}