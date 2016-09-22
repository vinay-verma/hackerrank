import java.io.*;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n-- > 0){
            String str = scan.nextLine();
            if(str.length()%2 != 0)
                System.out.println("-1");
            else{
                int[] a = new int[26];
                int[] b = new int[26];
                int len = str.length()/2;
                String str1 = str.substring(0,len);
                String str2 = str.substring(len);
                //System.out.println(str1+" "+str2);
                for(int i=0;i<len;i++){
                   a[str1.charAt(i)-'a']++;
                    b[str2.charAt(i)-'a']++;
                }
                int diff = 0;
                int i = 0;
                while(i<26){
                    if(b[i] != 0 && a[i]<b[i])
                        diff += Math.abs(a[i] - b[i]);
                    i++;
                }
                System.out.println(diff);
            }
        }
    }
}
