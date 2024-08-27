package 2-D Array;

import java.util.Scanner;

public class exitPoint {
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
        int i=0;
        int j=0;
        char dir = 'e';
        while(true){

            if(dir=='s'){
                if(arr[i][j]==0){
                    j++;
                }else if(arr[i][j]==1){
                    dir='w';
                    i++;
                }
            }

            if(dir=='w'){
                if(arr[i][j]==0){
                    i++;
                }else if(arr[i][j]==1){
                    dir='n';
                    j--;
                }
            }

            if(dir=='n'){
                if(arr[i][j]==0){
                    j--;
                }else if(arr[i][j]==1){
                    dir='e';
                    i--;
                }
            }

            if(dir=='e'){
                if(arr[i][j]==0){
                    i--;
                }else if(arr[i][j]==1){
                    dir='s';
                    j++;
                }
            }

            if(i<0 || j<0 || j==arr[0].length || i==arr.length){
                break;
            }
        }
    }
}
