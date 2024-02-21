package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("kun oy sana kiriting (dd.MM.yyyy): ");
        String malumot = scanner.next();

        Pattern pattern = Pattern.compile("(\\d{2}).(\\d{2}).(\\d{4})");
        Matcher matcher = pattern.matcher(malumot);

        if (matcher.matches()) {
            System.out.println("Day: " + matcher.group(1));
            System.out.println("Month: " + matcher.group(2));
            System.out.println("Year: " + matcher.group(3));
            System.out.println("Full: " + matcher.group(0));
        } else {
            System.out.println("Noto'g'ri format!");
        }
    }
}
