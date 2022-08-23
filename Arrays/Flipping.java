import java.util.*;
class Flipping{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while(tc-->0){
                String s = sc.next();
                int n = s.length();
                int count=0;
                for(int i=0;i<n;i++){
                    if(s.charAt(i)=='0'){
                        count++;
                    }
                }
                if(count==0){
                    System.out.println(count);
                    continue;
                }

                int ncount = 0;
                int max = 0;
                for(int i=0;i<count;i++){
                    if(s.charAt(i)=='0'){
                        ncount++;
                    }
                }
                max = ncount;
                
                for(int i=count;i<n;i++){
                    if(s.charAt(i-count)=='0'){
                        ncount--;
                    }
                    if(s.charAt(i)=='0'){
                        ncount++;
                    }

                    max = Math.max(max, ncount);
                }

                int ans = Math.abs(max-count);
                System.out.println(ans);

                
            }
        }
    }

}