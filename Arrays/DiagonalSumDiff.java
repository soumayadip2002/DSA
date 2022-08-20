import java.util.*;
class DiagonalSumDiff{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                 arr[i][j]=sc.nextInt();
               }
            }

            int sum1 = 0;
            int sum2 = 0;
            int diff = 0;

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        sum1 = sum1+arr[i][j];
                    }
                    if((i+j)==(n-1)){
                        sum2 = sum2+arr[i][j];
                    }
                }
            }

            diff = Math.abs(sum1-sum2);
            System.out.println(diff);
        }

    }
}