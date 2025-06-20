public class ReverseOnlyLetter {

    static String revLetterOnly(String str){

        //a-bC-dEf-ghIj

        int l = str.length()-1;
        int s = 0;  

        char[] ch = str.toCharArray();
        while(s < l){
            if(!Character.isLetter(str.charAt(s))){
                s++;
                continue;
            }
            else if(!Character.isLetter(str.charAt(l)))
            {
                l--;
                continue;
            }

            char temp = str.charAt(s);
            ch[s] =ch[l];
            ch[l] = temp;
            s++;
            l--;
        }

        return new String(ch);
    }

    public static void main(String[] args) {
         System.out.println(revLetterOnly("a-bC-dEf-ghIj"));      // Output: "j-Ih-gfE-dCba"
        System.out.println(revLetterOnly("Test1ng-Leet=code-Q!"));// Output: "Qedo1ct-eeLg=ntse-T!"
        System.out.println(revLetterOnly("abc"));                 // Output: "cba"
        System.out.println(revLetterOnly("1@2#3"));               // Output: "1@2#3"
    }
}
