import java.io.*;
import java.util.*;

public class SuperReducedString {
    public static String reduce(String str){
        int i =0;
        String sol="";
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))
                i++;
            else
                sol += str.charAt(i);
        }
        if(i<str.length())
            sol += str.charAt(i);
        return sol;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String sol = "";
        while(!str.equals(sol)){
            sol = str;
            str = reduce(str);
        }
        if(!str.equals(""))
            System.out.println(str);
        else
            System.out.println("Empty String");
        
    }
}
