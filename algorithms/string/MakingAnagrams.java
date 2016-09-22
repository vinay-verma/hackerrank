import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0;i<str1.length();i++){
            arr1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            arr2[str2.charAt(i)-'a']++;
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i])
                count += Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println(count);
    }
}
