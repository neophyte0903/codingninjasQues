public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int temp=0;
        int n=arr.length;
        if(arr.length%2==0){
        for(int i=0;i<arr.length;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }}else{
            for(int i=0;i<n-1;i+=2){
                temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }
        }

    }
}
