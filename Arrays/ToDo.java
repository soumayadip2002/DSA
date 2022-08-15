import java.util.*;
class ToDo{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            for(int k=0;k<testcase;k++){
                int n = sc.nextInt();
                int[] todo = new int[n];
                for(int i=0;i<n;i++){
                    todo[i]=sc.nextInt();
                }
                int count=0;
                for(int i=0;i<n;i++){
                    if(todo[i]>=1000){
                        count = count+1;
                    }
                }
                System.out.println(count);
                
            }
        }

    }
}