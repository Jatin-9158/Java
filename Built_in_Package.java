/*                            Read-Data From File                    */
/* Built in Package  */
//import java.lang; is by Default Package
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Built_in_Package {
    public static void main(String[] args)
    {
        try
        {
          File r=new File("E:\\j.cpp");
          Scanner sc=new Scanner(r);
          while(sc.hasNextLine())// hasNextLine() checks that if Data is there in the next Line return true else return false
          {
            System.out.println(sc.nextLine());

          }
        }
        catch(IOException E)
        {
            System.err.println("File Not Found");
        }
    }
}
