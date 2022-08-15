import java.util.*;
class Score {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            int[] play1 = new int[testcase];
            int sum1=0;
            int[] play2 = new int[testcase];
            int sum2=0;
            int[] lead = new int[testcase];
            for(int i=0;i<testcase;i++){
                sum1+=sc.nextInt();
                sum2+=sc.nextInt();
                
                play1[i]=sum1;
                play2[i]=sum2;
            }
            for(int j=0;j<testcase;j++){
                lead[j] = (play1[j]-play2[j]);
            }
            Arrays.sort(lead);
            if(lead[0]<0 && Math.abs(lead[0])>Math.abs(lead[testcase-1])){
                System.out.println("2 ");
                System.out.println(Math.abs(lead[0]));
            }
            else{
                System.out.println("1 ");
                System.out.println(Math.abs(lead[testcase-1]));
            }
        }

  }
}