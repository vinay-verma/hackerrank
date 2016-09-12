import java.io.*;
import java.util.*;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n-- > 0){
            String str = scan.nextLine();
            //String rev = new StringBuffer(str).reverse().toString();
            int len = str.length();
            int count = 0;
            for(int i=0; i<len/2;i++){
                if(str.charAt(i) != str.charAt(len-i-1)){
                    count += Math.abs((str.charAt(i)-'a')-(str.charAt(len-i-1)-'a'));
                }
            }
            System.out.println(count);
        }
    }
}
