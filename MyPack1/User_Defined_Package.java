/*                                   User-defined Package                                                */
//Trying to Access the Private method of superclass in subclass 
// package MyPack1;
// class User_Defined_Package {
//     private void show()
//     {
//         System.out.println("Read one book a month will you help you to grow ");
//     }

// }
// class Derived extends User_Defined_Package
// {
//     public static void main(String[] args)
//     {
//         Derived D=new Derived();
//         D.show();
//     }
// }



// Default Access Modifer:
// package MyPack1;
// class User_Defined_Package {
//     void show()
//     {
//         System.out.println("Read one book a month will you help you to grow ");
//     }

// }
// class Derived 
// {
//     public static void main(String[] args)
//     {
//         User_Defined_Package D=new User_Defined_Package();
//         D.show();
//     }
// }


// Protected Access Specifier
// package MyPack1;
// class User_Defined_Package {
//     protected void show()
//     {
//         System.out.println("Read one book a month will you help you to grow ");
//     }

// }
// class Derived 
// {
//     public static void main(String[] args)
//     {
//         User_Defined_Package D=new User_Defined_Package();
//         D.show();
//     }
// } 



// Protected Access Specifier through extends Keyword
// package MyPack1;
// class User_Defined_Package {
//     protected void show()
//     {
//         System.out.println("Read one book a month will you help you to grow ");
//     }

// }
// class Derived extends User_Defined_Package
// {
//     public static void main(String[] args)
//     {
//         Derived D=new Derived();
//         D.show();
//     }
// } 



//Public Access Specifier
package MyPack1;
class User_Defined_Package {
    public void show()
    {
        System.out.println("Read one book a month will you help you to grow ");
    }

}
class Derived 
{
    public static void main(String[] args)
    {
        User_Defined_Package D=new User_Defined_Package();
        D.show();
    }
} 
