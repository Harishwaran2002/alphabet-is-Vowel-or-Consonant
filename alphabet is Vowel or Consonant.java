import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char v=sc.next().charAt(0);
        if(v>='a'&&v<='z'||v>='A'&&v<='Z'){
                if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'||v=='A'||v=='E'||v=='I'||v=='O'||v=='U'){
                System.out.println("The Character "+v+" is Vowel");
            }else{
                System.out.println("The Character "+v+" is Consonant");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
