import java.util.*;
class Ballons{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while(tc-->0){
                int gballon = sc.nextInt();
                int pballon = sc.nextInt();
                int participant = sc.nextInt();
                int[][] arr = new int[participant][2];

                for(int i=0;i<participant;i++){
                    for(int j=0;j<2;j++){
                        arr[i][j]=sc.nextInt();
                    }
                }
                int total = 0;
                int sum = 0;
                for(int i=0;i<participant;i++){
                   if(arr[i][0]==1){
                      total = total+gballon;
                   }
                   if(arr[i][1]==1){
                    total = total+pballon;
                   }
                }

                for(int i=0;i<participant;i++){
                    if(arr[i][0]==1){
                        sum = sum+pballon;
                    }
                    if(arr[i][1]==1){
                        sum = sum+gballon;
                    }
                }
                if(total<sum){
                    System.out.println(total);
                }
                else{
                    System.out.println(sum);
                }
            }
        }
    }
} 