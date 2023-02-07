import java.util.Scanner;
class Reverse{
    public static int[] arrInput(int[] arr,Scanner sc){
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
        
    }

    public static void Print(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static int[] Reverse(int[] arr){
        int j=arr.length-1;
        int i=0;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
        // for(int i = 0;i<arr.length;++i){
        //     swap(arr,i,j);
        //     j--;
        // }
        return arr;
    }

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        arr=arrInput(arr,sc);
        Print(Reverse(arr));
    }
}