package OOP_Java_Programming_Lab_6;

public class TextFormatter {

    public static String formatText(String text) {
        return text.toUpperCase();
    }

    public static String formatText(String text, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(text);
            if (i != times - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String formatText(String text, String prefix) {
        return "[" + prefix + "] " + text;
    }

    public static void main(String[] args) {
        System.out.println(formatText("hello"));
        System.out.println(formatText("Echo", 3));
        System.out.println(formatText("System updated", "INFO"));
    }
}