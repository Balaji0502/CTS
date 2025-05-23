public class PatternMatchingSwitchExample {
    public static void printObjectType(Object obj) {
        String message = switch (obj) {
            case Integer i -> "This is an Integer: " + i;
            case String s -> "This is a String: " + s;
            case Double d -> "This is a Double: " + d;
            case null -> "This is null.";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(message);
    }
    public static void main(String[] args) {
        printObjectType(42);
        printObjectType("Hello");
        printObjectType(3.14);
        printObjectType(true);
        printObjectType(null);
    }
}
