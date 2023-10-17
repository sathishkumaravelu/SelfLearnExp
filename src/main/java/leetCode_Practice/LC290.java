package leetCode_Practice;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LC290 {

    @Test
    public void testData(){
        boolean b = wordPattern("abba", "dog cat cat dog");
        System.out.println(b);
    }

    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String string = Character.toString(c);
            s1[i]=string;
        }
        StringBuilder result = new StringBuilder();
        for (String ch:s1) {
            result.append(ch);
        }
        return pattern.contentEquals(result);
    }

}
