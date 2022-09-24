
 class Inner_Static {
    static int rollno = 12;
    static String name = "Ochi";
    
    static class Inner {
        
        void meg(){
            System.out.println("rollno :" + rollno + "and  name :" + name);
        }
        
    }
    
    public static void main(String [] args){
        Inner_Static.Inner abc = new Inner_Static.Inner();
        abc.meg();
        
    }
}
