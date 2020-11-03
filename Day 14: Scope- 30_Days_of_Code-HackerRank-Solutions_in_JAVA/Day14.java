//Day 14: Scope

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	public Difference( int arr[]) {
        this.elements = arr;
    }
    public void computeDifference() {
        int max = 0;
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                max = Math.abs(elements[i] - elements[j]);
                if(maximumDifference <= max){
                    maximumDifference = max;
                } 
            }
        }
        
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
