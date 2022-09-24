import java.util.Scanner;
public class Parent {
    
    void Names(){
        System.out.println("The four children's names are: ");
      
      System.out.println("1. Godwin ");
     
      System.out.println("2. Jerry ");
     
      System.out.println("3. AyoBigHead ");
     
      System.out.println("4. Ochi ");
    }
    
}

class kidsAge extends Parent{
    void Names(){
       Scanner input = new Scanner(System.in);
       System.out.println("---The Kids names & ages:---");
       
       System.out.print(" 1.Godwin's age is : ");
       int Godwin = input.nextInt();
       
       System.out.print(" 2.jerry's age is : ");
       int jerry = input.nextInt();
       
       System.out.print(" 3.AyoBigHead's age is : ");
       int AyoBigHead = input.nextInt();
       
       System.out.print(" 4.Ochi's age is : ");
       int Ochi = input.nextInt();
       
       
       
    }
}
class main {
    public static void main(String [] args){
      Parent parents = new Parent();
      parents.Names();
      kidsAge kids = new kidsAge();
      kids.Names();
      
      
}
}


