
public class ArrayClass {

    public static void main(String[] args) {
        String [][] jumbledWords = {{"elapp","apple"},{"argneo","orange"},{"agrspe","grapes"}};
        
        //System.out.println("Fruits are: ");
for (String[] i : jumbledWords){
    for ( String j : i) {
        System.out.println(j);
    }
}
    }

    
}
