import java.util.*;
import java.io.*;
class RedGreen{
    public static void main(String x[]) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            for(int k=0;k<testcase;k++){
               BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
               String[] input = new String[2];
               int playNum;
               int height;
               input = in.readLine().split(" ");
               playNum=Integer.parseInt(input[0]);
               height=Integer.parseInt(input[1]);

               int[] arr = new int[playNum];
               for(int i=0;i<playNum;i++){
                   arr[i]=sc.nextInt();
               }

               int count=0;
               for(int i=0;i<playNum;i++){
                   if(arr[i]>height){
                    count++;
                   }
               }
               System.out.println(count);


            }
        }
    }
}