import java.util.*;
class MatchBox{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            for(int i=0;i<testcase;i++){
               while(sc.hasNext()){
                    int[] count = new int[10];
                    count[0]=6;
                    count[1]=2;
                    count[2]=5;
                    count[3]=5;
                    count[4]=4;
                    count[5]=5;
                    count[6]=6;
                    count[7]=3;
                    count[8]=7;
                    count[9]=6;
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    int ans=0;
                    int sum = n1+n2;
                    while(sum>0){
                        int d = sum%10;
                        ans = ans+count[d];
                        sum = sum/10;
                        
                    }
                    System.out.println(ans);
                }
                
                        
            }
        }
    }
}