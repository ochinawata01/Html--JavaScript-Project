package arraystringhw;

import java.util.Scanner;

public class ArrayStringHW {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word guess: ");
        String guess = sc.next();
        int  word, flag = 0;
        
        String myWordList [] = {"Godwin", "Ayomide", "Akin", "Big", "Head"};
        
        for (word = 0; word < myWordList.length; word++) {
            
            if (guess.equalsIgnoreCase(myWordList[word])) {
                flag = 1;
                break;
            }
            
        }
        if (flag == 1) {
                System.out.println("You've guessed rightly");
            }
        else
                System.out.println("Wrong guess!");
    }
    
}
