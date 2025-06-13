
import java.util.LinkedHashSet;
public class RemoveDuplicateChar {

    static String removeDuplicate(String str) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }

        for(Character ch : hs){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicateChar.removeDuplicate("banana"));
    }
}
