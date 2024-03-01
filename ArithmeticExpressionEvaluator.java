import java.util.Arrays;

public class ArithmeticExpressionEvaluator {

    public static int evaluateExpression(String expression) {
        String[] terms = expression.split("[\\+\\-]");
        char operator = '+';
        int result = 0;


        for (String term : terms) {
            int value = Integer.parseInt(term.trim());
            if (operator == '+') {
                result += value;
            } else {
                result -= value;
            }
            if (term.length() > 0) {
                operator = term.charAt(term.length() - 1);
            }
            if (expression.indexOf(term) + term.length() < expression.length()) {
                operator = expression.charAt(expression.indexOf(term) + term.length());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        testEvaluateExpression("5+20-8+5", 22);
        testEvaluateExpression("10-5+2", 7);
        testEvaluateExpression("100+200-50+25-10", 265);
        testEvaluateExpression("0+0+0", 0);
    }

    public static void testEvaluateExpression(String expression, int expected) {
        int result = ArithmeticExpressionEvaluator.evaluateExpression(expression);
        if (result == expected) {
            System.out.println("Test Passed: Expression: " + expression + ", Result: " + result);
        } else {
            System.out.println("Test Failed: Expression: " + expression + ", Expected: " + expected + ", Actual: " + result);
        }
    }
}
