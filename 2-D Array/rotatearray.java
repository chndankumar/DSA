package 2-D Array;

import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for(int k=0; k<arr.length; k++){
            for(int i=k+1; k<arr.length; i++){
                int temp = arr[k][i];
                arr[k][i]= arr[i][k];
                arr[i][k]=temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            int li=0;
            int hi=arr.length;
            while (li<hi) {
                int temp = arr[i][li];
                arr[i][li]= arr[i][hi];
                arr[i][li]=temp;
                li++;
                hi--;
            }
        }
    }
}
