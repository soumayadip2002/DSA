import java.util.*;
class Reverse{

    static void reverseArray(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    static void PrintArray(int[] arr, int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for(int i=0;i<length;i++){
                arr[i]=sc.nextInt();
            }

            reverseArray(arr, 0, length-1);
            PrintArray(arr, length);
        }
        
    }
}