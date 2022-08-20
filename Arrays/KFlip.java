import java.util.*;
class KFlip{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
                while(testcase-->0){
                    int N = sc.nextInt();
                    int K = sc.nextInt();
                    String s = sc.next();  
                    boolean[] set = new boolean[N];
                    for(int i=0;i<N;i++){
                        if(s.charAt(i)=='0'){
                           set[i] = false;
                        }
                        else{
                            set[i]=true;
                        }
                    }

                    int count=0;
                    for(int i=0;i<N;i++){
                        if(N-K+1==count) break;
                        if(set[i]){
                            if(i+K>N) break;

                            for(int j=i;j<i+K;j++){
                                set[j]=!set[j];
                            }
                            count++;


                        }
                    }

                    for(int i=0;i<N;i++){
                        if(set[i]){
                            System.out.print(1);
                        }
                        else{
                            System.out.print(0);
                        }
                    }
                    System.out.println();
                }
        }
    }
}