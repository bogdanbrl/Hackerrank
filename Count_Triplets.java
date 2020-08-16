package hackerrank_public;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Count_Triplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
		long result=0;
		for(int i=0; i<arr.size(); i++) {			
			long nr = arr.get(i);
			int count=0;
			for(int j=1; j<arr.size(); j++) {
				if(nr*r==arr.get(j)) {
					int p=1;
					count++;
					nr=nr*r;
					if(nr==arr.get(j+p)) {
						p++;
					}else {
						///if()
					}
				}
			}
		}
    	return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\windows\\de.viitor\\java\\installed.softwares\\eclipse.workplace\\hackerrank\\src\\hackerrank_public\\OUTPUT.txt"));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
