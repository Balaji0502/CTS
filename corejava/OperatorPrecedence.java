public class OperatorPrecedence {
    public static void main(String[] args) {
        int res1 = 10 + 5 * 2;
        System.out.println("Expression: 10 + 5 * 2");
        System.out.println("Result: " + res1);
        int res2 = (10 + 5) * 2;
        System.out.println("\nExpression: (10 + 5) * 2");
        System.out.println("Result: " + res2);
        int res3 = 100 / 5 + 6 - 3 * 2;
        System.out.println("\nExpression: 100 / 5 + 6 - 3 * 2");
        System.out.println("Result: " + res3);
        int res4 = 100 / (5 + 5);
        System.out.println("\nExpression: 100 / (5 + 5)");
        System.out.println("Result: " + res4);
    }
}
