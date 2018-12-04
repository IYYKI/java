package Day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarnessV5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your regex: ");
            Pattern pattern = Pattern.compile(scanner.nextLine());
            System.out.println("Enter input string to search: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.printf(
                        "Found \"%s\" starting index %d ending index %d.%n",
                        matcher.group(), matcher.start(), matcher.end());
                found = true;
            }
            if (!found) {
                System.out.println("Mp match found.%n");
            }
        }
    }
}
