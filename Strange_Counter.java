package hackerrank_public;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Strange_Counter {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long T = sc.nextLong();
        long n = 2;
        while (3*(n-1) < T){
            n *= 2;
        }
        System.out.println(  3*(n-1)-T+1  );
    }
}

