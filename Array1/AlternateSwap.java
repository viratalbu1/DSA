import java.util.*;
class AlternateSwap{
    public static void main(String args[]) {
        int []arr=arrInput();
        alternateSwap(arr);
        print(arr);
    }
    public  static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public  static int[] arrInput() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }  
        return arr;      
    }
    public static void alternateSwap(int[] arr) {
        int i=0;
        while(i+1<arr.length){
            swap(arr,i,i+1);
            i=i+2;
        }
    }
    public  static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}