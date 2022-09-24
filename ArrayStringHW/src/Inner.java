
public class Inner {
         int rollno = 12;
     String name = "Ochi";
    
     class outer {
        
        void meg(){
            System.out.println("rollno :" + rollno + "and  name :" + name);
        }
        
    }
    
    public static void main(String [] args){
        Inner_Static.Inner abc = new Inner_Static.Inner();
        abc.meg();
    }
    
}
