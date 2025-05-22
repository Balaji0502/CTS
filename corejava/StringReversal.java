import java.util.Scanner;
public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        String reversedWithBuilder = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed (StringBuilder): " + reversedWithBuilder);
        String reversedWithLoop = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedWithLoop += input.charAt(i);
        }
        System.out.println("Reversed (loop): " + reversedWithLoop);

        sc.close();
    }
}

