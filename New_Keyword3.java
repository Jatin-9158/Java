// In Array

import java.util.Scanner;

public class New_Keyword3 {
    public static void main(String[] args) {
        int Size;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        Size=r.nextInt();
        int [] a=new int[Size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<Size;i++)
        {
          a[i]=r.nextInt();
        }
        System.out.println("Array Elements:");
        // For-each Loop
        for(int m:a)
        {
            System.out.println(m+" ");
        }
        
    }
}
