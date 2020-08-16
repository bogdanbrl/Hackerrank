package hackerrank_public;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Happy_Ladybugs {

    // Complete the happyLadybugs function below.
	static String happyLadybugs(String b) {
		
        for( char A : b.toCharArray()){
            int charCounter = b.length() - b.replaceAll(A+"", "").length();
            if( A != '_' && charCounter == 1){
                System.out.println("NO");
                return "NO";
            }
        }

        if( b.length()-b.replaceAll("_", "").length() == 0 ){
            for(int i = 1; i < (b.length() - 1); i++){
                if( b.charAt(i-1)!= b.charAt(i) && b.charAt(i+1)!=b.charAt(i)){
                    return "NO";
                }
            }
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH"));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

