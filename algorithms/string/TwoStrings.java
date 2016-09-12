import java.io.*;
import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        scan.nextLine();
        while(c-- > 0){
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            boolean[] check = new boolean[26];
            for(int i=0;i<str1.length();i++)
                check[str1.charAt(i)-'a'] = true;
            int i;
            for(i=0;i<str2.length();i++){
                if(check[(str2.charAt(i)-'a')] == true){
                    System.out.println("YES");
                    break;
                }
            }
            if(i==str2.length())
                System.out.println("NO");
        }
    }
}
