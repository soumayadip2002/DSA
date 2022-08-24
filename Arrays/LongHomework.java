import java.util.*;
import java.io.*;
class LongHomework{
    public static void main(String x[]) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String[] input = new String[3];
            int N;
            int Q;
            int M;
            input = in.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            Q = Integer.parseInt(input[1]);
            M = Integer.parseInt(input[2]);
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            while(Q-->0){
                int I = sc.nextInt();
                int R = sc.nextInt();
                List<Integer> copy = new ArrayList<Integer>();
                
                for(int i=0;i<N;i++){
                    if(arr[i]%M==R){
                        copy.add(arr[i]);
                    }
                }
                Collections.sort(copy);
                if(I<=copy.size()){
                    System.out.println(position(arr, copy.get(I-1)));
                }
                else{
                    System.out.println(-1);
                }
            }
        } catch (IOException e) {
            return;
        }


    }

    public static int position(int[] arr, int t){
        if(arr==null){
            return -1;
        }
        int len = arr.length;
        int i=0;
        while(i<len){
            if(arr[i]==t){
                return i+1;
            }
            else{
                i++;
            }
        }

        return -1;

    }
}