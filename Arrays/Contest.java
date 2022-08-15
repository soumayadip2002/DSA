import java.util.*;
class Contest{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            for(int i=0;i<testcase;i++){
                int len = sc.nextInt();
                String[] arr = new String[len];
                for(int j=0;j<len;j++){
                    arr[j]=sc.next();
                }

                int start=0;
                int ltime=0;
                for(int j=0;j<len;j++){
                    if(arr[j].endsWith("38")){
                        start++;
                    }
                    if(arr[j].endsWith("108")){
                        ltime++;
                    }
                }
                
                System.out.println(start + " " + ltime);
            }
        }
    }
}