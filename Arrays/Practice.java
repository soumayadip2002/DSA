import java.util.*;
class Practice{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[4];
            int count=0;
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<4;i++){
                if(arr[i]>=10){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}