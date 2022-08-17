import java.util.*;
class Pair {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();

            for(int i=0;i<testcase;i++){
                int dolls = sc.nextInt();
                int[] arr = new int[dolls+1];

                for(int j=0;j<dolls;j++){
                    arr[j] = sc.nextInt();
                }

                for(int j=0;j<dolls;j++){
                    for(int k=j+1;k<dolls;k++){
                        if(arr[j]==arr[k]){
                            arr[j]=arr[k]=-1;
                        }
                    }
                }

                for(int j=0;j<dolls;j++){
                    if(arr[j]!=-1){
                       System.out.println(arr[j]);
                    }
                }
                
            }
        }
    }
}
