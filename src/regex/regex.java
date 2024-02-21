package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sana oy yilni kriting: (DD:MM:YYYY) ");
        String text=  scanner.nextLine();
        String regex ="^(0[1-9]|1[0-2]):(0[1-9]|[12][0-9]|3[01]):\\\\d{4}$\"";
        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

    }
}
