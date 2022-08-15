import java.util.*;
class Dominant {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            for(int k=0;k<testcase;k++){
                int length = sc.nextInt();
                int[] arr = new int[length];
                int[] count = new int[length+1];
                for(int i=0;i<length;i++){
                    arr[i]=sc.nextInt();
                    count[arr[i]]++;
                    
                }

                Arrays.sort(count);
                String ans =" ";
                if(count[length]==count[length-1]){
                    ans="NO";
                }
                else{
                    ans="YES";
                }
                System.out.println(ans);
                
                
            }
        }
    }
}
