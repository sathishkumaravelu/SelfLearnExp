package leetCode_Practice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LC22_GenerateParentheses {

    @Test
    public void testData(){
        List<String> strings = generateParenthesis(2);
        System.out.println(strings);

    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("(", 1, 0, result, n);
        return result;
    }

    private void generate(String current, int open, int close, List<String> result, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            generate(current + "(", open + 1, close, result, n);
        }
        if (close < open) {
            generate(current + ")", open, close + 1, result, n);
        }
    }
}
