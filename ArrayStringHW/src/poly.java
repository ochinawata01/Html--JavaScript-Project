

public class poly {
    void schoolName(){
        System.out.println("Niit");
    }
    
}
 class Student extends poly{
     void schoolName(){
         System.out.println("Ikeja");
     }
 }

  class main{
      public static void main(String [] args){
          Student ochi = new Student();
          ochi.schoolName();
      }
  }

