import java.util.*;
class TotalScore {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while(tc-->0){
                int N = sc.nextInt();
                int[] score = new int [12]; 
                for(int i=0;i<N;i++){
                    int index = sc.nextInt();
                    int value = sc.nextInt();

                    if(score[index]<value){
                        score[index] = value;
                    }
                } 
                
                int total = 0;
                for(int i=1;i<=8;i++){
                    total = score[i]+total;
                }

                System.out.println(total);
            }
        }
    }
}

