import java.util.Scanner;

class ReverseWords{
    static String reverseString(String str){
        String revStr;

        str = str.trim();

        String[] words = str.split("\\s+");

        int l= 0; 
        int r  = words.length-1;

        while(l<r){

            String temp = words[l];
            words[l] = words[r];
            words[r] = temp; 

            l++;
            r--;
        }

        revStr = String.join(" ", words);

        return revStr;
    }
    public static void main(String[] args){
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(ReverseWords.reverseString(str));
    }
}