public class CountVowelsConsonants {
    public static void main(String[] args) {
        
        String str = "aeiouksh";
        int vowel = 0;
        int consonant = 0;

        for(int i= 0; i< str.length();i++){

            char ch = str.charAt(i);
            
            if(ch >= 'a' && ch <='z'){
                if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }

       
        System.out.printf("Vowels: %d \nConsonants: %d ", vowel, consonant);
    }
}
