package Day4_5;

import java.util.Scanner;

public class Matrix {
    Scanner sc = new Scanner(System.in);
    int h;
    int v;
    public Matrix(int h,int v) {
        this.h = h;
        this.v = v;
    }
    public void m1(){

        System.out.println("Enter the values");
        int[][] arr = new int[h][v];

        for (int i = 0; i < h;  i++) {
            for (int j = 0; j < v; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value h: ");
        int h = sc.nextInt();

        System.out.print("Enter the value v:");
        int v = sc.nextInt();

        Matrix m = new Matrix(h,v);

        m.m1();
    }
}
