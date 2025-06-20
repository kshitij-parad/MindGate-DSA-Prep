import java.util.HashSet;

class LongestCommonStringLen{

    static int function(String str){
        HashSet<Character> hm = new HashSet<>();
        int maxLen = 0;
        int start = 0;
      

        //abcabcd                set =  a, b,c , 
        for(int end = 0; end < str.length(); end++){
          // char Cchar = str.charAt(end);

         

              while(hm.contains((Character) str.charAt(end))){
                 hm.remove(str.charAt(start));
                 start++;
              }

              hm.add((Character) str.charAt(end));
              maxLen = Math.max(maxLen, end-start+1);

        }


        return maxLen;
    }

    public static void main(String[] args){
        System.out.println(LongestCommonStringLen.function("abcbdefg"));
    }
}