import java.util.*;
class Factorial {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();   
            for(int k=0;k<testcase;k++)
            { 
                int num=sc.nextInt();
                int fact=1; 
                for(int i=1;i<=num;i++){    
                    fact=fact*i;    
                }    
                System.out.println(fact);    
            }
        }
    }
}  
