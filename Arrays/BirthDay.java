import java.util.*;
class BirthDay{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();

            while(tc-->0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                int count=0;
                for(int i=0;i<n-1;i++){
                    if(arr[i]==arr[i+1]){
                        count++;
                    } 
                }
                System.out.println(Math.abs(n-count));
            }
        }
    }
}
