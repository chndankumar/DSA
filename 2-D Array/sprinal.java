package 2-D Array;

import java.util.Scanner;

public class sprinal {
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
        int sr=0;
        int sc=0;
        int dc=arr[0].length;
        int dr = arr.length;
        int num = arr.length*arr[0].length;

        while(num!=0){

            for(int i=sr, j =sc; num!=0 && i<dr; i++){
                System.out.println(arr[i][j]);
                n--;
            }
            sc++;

            for(int i=dr, j =sc; num!=0 && j<dc; j++){
                System.out.println(arr[i][j]);
                n--;
            }
            dr--;

            for(int i=dr, j =dc; num!=0 && i<dr; i--){
                System.out.println(arr[i][j]);
                n--;
            }
            dc--;

            for(int i=sr, j =dc; num!=0 && j<dc; j--){
                System.out.println(arr[i][j]);
                n--;
            }
            sr++;
        }
    }
}
