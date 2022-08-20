import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Tag {
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            char[] str = s.toCharArray();
            Pattern regex = Pattern.compile("[aeiouAEIOU]");
            Matcher m = regex.matcher(s);
            boolean b = m.matches();

            Pattern regex1 = Pattern.compile("[X-]");
            Matcher m1 = regex1.matcher(s);
            boolean b1 = m1.matches();
            
            int Valid=0;
            int Invalid=0;
            for(int i=0;i<str.length;i++){
                for(int j=i+1;j<str.length;j++){
                    if((str[i]+str[j])%2==0 && b==false && b1==true){
                        Valid++;
                    }
                    else{
                        Invalid++;
                    }

                }

            }
            if(Valid>Invalid){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }

        }
    }
}