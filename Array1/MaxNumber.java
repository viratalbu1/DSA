import java.util.*;
class MaxNumber{
    public static void main(String args[]) {
        int []arr=arrInput();
        System.out.println(maxNumber(arr));       
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] arrInput() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int maxNumber(int[] arr) {
        int MAX=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>MAX){
                MAX=arr[i];
            }
        }
        return MAX;
    }
}