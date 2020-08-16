package hackerrank_public;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Index{ int i; int j; Index(int i , int j){ this.i=i; this.j=j; } }

public class The_Bomberman_Game {

    // Complete the bomberMan function below.
	
    static String[] bomberMan(int n, String[] grid) {
   	   	
    	if(n%2==0){
            n=2;
        }

        if(n%4==3 && n>1){
            n=3;
        }
        if(n%4==1 && n>5){
            n=5;
        }


        char arr[][] = new char[grid.length][grid[0].length()];
            Queue<Index> queue = new LinkedList<Index>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length(); j++) {
                    arr[i][j] = grid[i].charAt(j);
                    if (arr[i][j] == 'O') {
                        queue.add(new Index(i, j));
                    }
                }
            }
            int row_size = grid.length;
            int col_size = grid[0].length();

            int start = 1, index = -1,end=1;
            while (end <= n) {
                if (index == 3 || start == 3) {
                    while (!queue.isEmpty()) {
                        Index index1 = queue.poll();
                        int i = index1.i;
                        int j = index1.j;
                        arr[i][j] = '.';
                        if (i + 1 < row_size) {
                            arr[i + 1][j] = '.';
                        }
                        if (i - 1 >= 0) {
                            arr[i - 1][j] = '.';
                        }
                        if (j + 1 < col_size) {
                            arr[i][j + 1] = '.';
                        }
                        if (j - 1 >= 0) {
                            arr[i][j - 1] = '.';
                        }
                    }

                    for (int i = 0; i < row_size; i++) {
                        for (int j = 0; j < col_size; j++) {
                            if(arr[i][j]=='O'){
                                queue.add(new Index(i,j));
                            }
                        }
                    }

                    if (index == 3) {
                        index = -1;
                    }
                    if (start == 3) {
                        start = -1;
                    }
                }

                if (index == 2 || start == 2) {
                    for (int i = 0; i < row_size; i++) {
                        for (int j = 0; j < col_size; j++) {
                                if(arr[i][j]=='.')
                                    arr[i][j] = 'O';
                            }
                        }
                    }               
                end++;
                start++;
                index++;
            }

            String [] returnString = new String[row_size];
            for (int i = 0; i < row_size; i++) {
                    String str = "";
                    for (int j = 0; j < col_size; j++) {
                        str = str + arr[i][j];
                    }
                    returnString[i]=str;
                }
                return returnString;
    }
       

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\windows\\de.viitor\\java\\installed.softwares\\eclipse.workplace\\hackerrank\\OUTPUT.txt"));

        String[] rcn = scanner.nextLine().split(" ");

        int r = Integer.parseInt(rcn[0]);

        int c = Integer.parseInt(rcn[1]);

        int n = Integer.parseInt(rcn[2]);

        String[] grid = new String[r];

        for (int i = 0; i < r; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = bomberMan(n, grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
