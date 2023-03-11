package ssg;

public class Q01 {
    // gIVEN INTEGER ARRAY aRR[] of size N The task is to find sum of it
    /*

    input: N=4
    Arr[] {1,2,34}
    Output: 10
    Explanation : 1+2+3+4=10
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n= arr.length;
        System.out.println(sum(arr, n));
    }
    public static int sum (int arr[], int n){
        int sum=0;
        for (int i=0;i< n;i++){
            sum =sum + arr[i];
        }
        return sum;
    }
}
