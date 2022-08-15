import java.util.*;
class EqualPair {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            
            for(int k=0;k<testcase;k++){
                int maxcount=1;
                int N = sc.nextInt();
                int[] equal = new int[N];
                for(int i=0;i<N;i++){
                    equal[i]=sc.nextInt();
                }

                for(int i=0;i<N;i++){
                    int count=1;
                    for(int j=i+1;j<N;j++){
                        if(equal[i]==equal[j]){
                            count++;
                        }
                    }
                    if(count>=maxcount){
                        maxcount=count;
                    }
                }
                System.out.println(N-maxcount);
                
            }
        }
    }
}
