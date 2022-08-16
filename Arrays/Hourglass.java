import java.util.*;
class Hourglass {
    static int row = 6;
    static int col = 6;

    static int hourglass(int arr[][]){
        if(row<6 || col<6){
            System.out.println("Not Possible");
            System.exit(0);
        }

        int max_sum = Integer.MIN_VALUE;

        for(int i=0;i<row-2;i++){
            for(int j=0;j<col-2;j++){
                int sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);

                max_sum = Math.max(max_sum, sum);
            }
        }

        return max_sum;
    }

    public static void main(String x[]){
        try(Scanner sc = new Scanner(System.in)){
        int[][] arr = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int res = hourglass(arr);
        System.out.println(res);

    }
    }
}
