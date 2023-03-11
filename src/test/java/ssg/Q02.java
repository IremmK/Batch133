package ssg;

import java.util.Arrays;

public class Q02 {
    /*
    Write a program to find the sum of given series 1+2+3.(N terms)
    Input= N=1
    Output= 1
    Explanation : For n=1 sum will be 1
     */
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
        int a[]={1,2,4,5,8,10};
        int n=a.length;
        int x = 9;
        System.out.println(output(a, n, x));

    }
    public static long seriesSum(int n){
       int sum =0;
        for(int i=n;i>0;i--){
            sum= sum + n;
            n--;
        }
        return sum;
    }
    /*
    palindrome
    input
    5
    111 222 333 444 555
    output
    1
     */
    /*
    Given an sorted array A of size N. Find number of elements which are less than or equal to given elements X.
    INPUT:
    N=6
    A[]={1,2,4,5,8,10}
    X=9
    OUTPUT:
    5
     */
    public static int output(int a[], int n, int x){
        int count=0;
        for(int i = 0 ; i<n;i++){
           if(a[i]<=x){
               count++;
           }
        }
        return count;

    }

}
