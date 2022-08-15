import java.util.*;
class PreetyNumbers {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            while(sc.hasNext()){
                while(testcase>0){
                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    int z, count=0;

                    for(int i=a;i<=b;i++){
                        z = i%10;

                        if(z==2||z==3||z==9){
                            count++;
                        }
                    }
                    System.out.println(count);
                    testcase--;
                }
            }
        }
    }
}
