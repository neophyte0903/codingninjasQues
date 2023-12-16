import java.lang.Math;
import java.util.*;
public class Solution {

    public static void sort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.
        sort(arr1);
        sort(arr2);

        int i=0;
        int j=0;
        int minDiff=Math.abs(arr1[0]-arr2[0]);

        while(i<n && j<m){
            minDiff=Math.min(minDiff,Math.abs(arr1[i]-arr2[j]));

            if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }

        }
        return minDiff;
        
    }
}
