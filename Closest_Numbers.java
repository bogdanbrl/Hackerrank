package hackerrank_public;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Closest_Numbers {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
		
    	List<Integer> res = new ArrayList<Integer>();
    	Arrays.sort(arr);
    	int min=arr[1]-arr[0];
    	res.add(arr[0]);
    	res.add(arr[1]);
    	for(int i=2;i<arr.length;i++) {
    		int nMin = arr[i]-arr[i-1];
    		if(nMin<min) {
    			res.clear();
    			res.add(arr[i-1]);
    			res.add(arr[i]);
    			min=nMin;
    		}else if(nMin==min) {
    			res.add(arr[i-1]);
    			res.add(arr[i]);
    		}
    	}
    	int res_f [] = new int[res.size()];
    	for(int j=0; j<res_f.length; j++) {
    		res_f[j]=res.get(j);
    	}  
    	return res_f;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
