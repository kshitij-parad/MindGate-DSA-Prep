
public class AnagramCheck {

    static boolean isAnagram(String str1, String str2) {
        boolean flag = true;
        int[] freq = new int[26];

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']--;
            freq[str2.charAt(i) - 'a']++;
        }  

        for(int count : freq){
            if(count != 0) return  false;
        }
        return flag;
    }
    
    public static void main(String[] args) {
        System.out.println(AnagramCheck.isAnagram("aabbcc", "aabcbc"));
    }
}
