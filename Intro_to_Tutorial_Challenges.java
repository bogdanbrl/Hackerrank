package hackerrank_public;

//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\windows\\de.viitor\\java\\installed.softwares\\eclipse.workplace\\hackerrank\\OUTPUT.txt"));

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

public class Intro_to_Tutorial_Challenges {

    // Complete the alternate function below.
    static int alternate(String s) {
    	
    	String newString="";
    	for (char c : s.toCharArray()) {
			if(!(newString.contains(c+""))) {
				newString=newString+c;
			}
		}
    	int longestString=0;
    	for(int i=0; i<newString.length(); i++) {
    		String cloneS = new String(s);
    		for(int j=i+1; j<newString.length(); j++) {
    			
    		}
    	}
    	
    	System.out.println(newString);
    	return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\windows\\de.viitor\\java\\installed.softwares\\eclipse.workplace\\hackerrank\\OUTPUT.txt"));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




       






