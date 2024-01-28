import java.io.*;
import java.util.*;

public class copy2d {
    static void copyelement(int arr1[][], int arr2[][], int row, int col) {
        if (row < arr1.length) {
            if (col < arr1[row].length) {
                arr2[row][col] = arr1[row][col];
                copyelement(arr1, arr2, row, col + 1);
            } else {

                copyelement(arr1, arr2, row + 1, 0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        arr1 = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int arr2[][] = new int[3][3];
        copyelement(arr1, arr2, 0, 0);
        System.out.println("First Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}