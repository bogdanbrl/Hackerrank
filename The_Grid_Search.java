package hackerrank_public;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class The_Grid_Search {

    // Complete the gridSearch function below.
	static String gridSearch(String[] G, String[] P) 
    {
        for(int i=0;i<=(G.length-P.length);i++)
        {
            for(int j=0;j<=(G[0].length()-P[0].length());j++)
            {
                int a=i;
                int c=0;
                if(G[i].substring(j,j+P[0].length()).equals(P[0]))
                {
                    c++;
                    for(int k=1;k<P.length;k++)
                    {
                        i++;   
                        if(G[i].substring(j,j+P[0].length()).equals(P[k]))c++;
                        else break;
                         
                    }
                    //if c is equal with length of P[], this means that P was found in G[]
                    if(c==P.length)return "YES";
                }
                i=a;
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
