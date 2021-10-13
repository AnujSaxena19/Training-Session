package Day7;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise10 {
     public static void main(String [ ] args) throws FileNotFoundException {
              new Exercise10().findLong_word();
         }

     public String findLong_word() throws FileNotFoundException {

       String l = "";
       String str;
       Scanner sc = new Scanner(new File("C:/Users/Anuj Saxena/eclipse-workspace/Training-Session/src/Day7/Training.txt"));

       while (sc.hasNext()) {
          str = sc.next();
           if (str.length() > l.length()) {
             l = str;
           }
       }
       
         System.out.println("\n"+l+"\n");
            return l;
            }
}

