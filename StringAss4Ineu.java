// 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
/*
package com.company;

public class Main {

    public static void removeDuplicates(char s[], int n)
    {
        String ans="";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(s[i]==s[j]){
                    break;     // We are breaking here because this caharacter is already
                }              // added to our answer because it was found earlier

            }
            if(j==i){          // The loop ends without breaking, it means this
                ans+=s[i];     // is the first occurence of this character in the string
            }                  // so we add this character to our answer
        }
        System.out.print(ans);
    }
    public static void main(String[] args)
    {
        char s[] = "aaabaababbccbccd".toCharArray();
        int n = s.length;
        removeDuplicates(s, n);
    }
}



//2. WAP to print Duplicates characters from the String

public class Duplicate {
    public static void main(String argu[]) {
        String str = "beautiful beach";
        char[] carray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}



// 3. WAP to check if “2552” is palindrome or not.
package com.company;
import java.util.Scanner;
class Palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String inttostring=n+"";
        StringBuffer sn=new StringBuffer(inttostring);
        if(sn.reverse().equals(inttostring))
            System.out.print("Yes Its a palindrome");
        else
            System.out.print("No Its not a palindrome");
    }
}



// 4. WAP to count the number of consonants, vowels, special characters in a String.

package com.company;
import java.util.*;
 class CVCS {

    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string : ");
        line = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
|| ch == 'o' || ch == 'u') {
            ++vowels;
        }
else if((ch >= 'a'&& ch <= 'z')) {
            ++consonants;
        }
else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
else if (ch ==' ')
            {
                ++spaces;
            }
else
            ++symbols;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
        System.out.println("Symbols : " + symbols);
    }
}



// 5. WAP to implement Anagram Checking least inbuilt methods being used.

package com.company;
import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}



// 6. WAP to implement Pangram Checking with least inbuilt methods being used.

package com.company;
import java.util.Scanner;

class Panagram {
    public static void main(String args[]){

        //Scanner is a class which read input from keyboard
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your String:");

        //to read string end of line
        String str=sc.nextLine();

        // replaceALL()-->replaces all spaces between strings
        //toLowerCase()->method which converts all characters to lower case
        str=str.replaceAll("","").toLowerCase();

        // empty string
        String s="";

        // checking characters (a-z or A-Z)
        for(char i='a';i<='z';i++){

            //indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'i' in 'str'
            if(str.indexOf(i)!=-1){

                s=s+i;// empty string+character
            }
        }
        // s.length()-->this method returns number or character of a string
        if(s.length()==26){
            System.out.println("Pangram");
        }
        else{
            System.out.println(" Not Pangram");
        }
    }
}



// 7. WAP to find if String contains all unique characters.

package com.company;
import java.util.*;
class UniqueString {

    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String str = "xyz";
        String str = "xyyz";
        System.out.println("Original String : "+str);
        System.out.println("String has all unique characters: "+is_Unique_str(str));
    }
}



// 8. WAP to find the maximum occurring character in a String

package com.company;
import java.util.*;
class MaximumOcuuring {
    static final int N = 256;
    static char MaxOccuringChar(String str1) {
        int ctr[] = new int[N];
        int l = str1.length();
        for (int i = 0; i < l; i++)
            ctr[str1.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String str1 = "test string";
        System.out.println("The given string is: " + str1);
        System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
    }
}

 */
