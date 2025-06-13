
import java.util.LinkedHashMap;

public class FreqCountofCharInString {

    static LinkedHashMap<Character, Integer> freqChar(String str) {

        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        return hm;
    }

    public static void main(String[] args) {
        System.out.println(FreqCountofCharInString.freqChar("banana"));
    }
}
