

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Niit {
    public static void main( String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter regex pattern:");
        Pattern pattern= Pattern.compile(sc.nextLine());

        System.out.println("Enter text");
        Matcher matcher= pattern.matcher(sc.nextLine());

//        Start and End
        int count = 0;

        while (matcher.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start():" + matcher.start());
            System.out.println("end():" +matcher.end());
        }
//        lookingAt() method
//        System.out.println("lookingAt():" +matcher.lookingAt());
//        System.out.println("matches():" +matcher.matches());
    }
}
