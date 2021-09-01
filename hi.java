2.Write a Java program to print "Hello World"

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
Output

Hello, World!


3.Write a Java programfor declaring variables of all data types.

class Assignment {
    public static void main(String args[])
    {
        boolean b = true;
        if (b == true)
            System.out.println("Hi");
    }
}

output

Hi

4.Write a Java Program to find size of different data type

class size
{
        public static void main (String[] args)
        {
                System.out.println("size of integer:"+ (Integer.SIZE/8)+" bytes");
                System.out.println("size of byte   :"+ (Byte.SIZE/8)+" byte");
                System.out.println("size of float  :"+ (Float.SIZE/8)+" bytes");
                System.out.println("size of double :"+ (Double.SIZE/8)+" bytes");
                System.out.println("size of Short  :"+ (Short.SIZE/8)+" bytes");
                System.out.println("size of long   :"+ (Long.SIZE/8)+" bytes");
                System.out.println("size of char   :"+ (Character.SIZE/8)+" bytes");
        }
}


output

size of integer:4 bytes
size of byte   :1 byte
size of float  :4 bytes
size of double :8 bytes
size of Short  :2 bytes
size of long   :8 bytes
size of char   :2 bytes


5.Write a Java program to check whether Java is installed on your computer

public class Exercise31 {
public static void main(String[] args) {
    System.out.println("\nJava Version: "+System.getProperty("java.version"));
    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
    System.out.println("Java Home: "+System.getProperty("java.home"));
    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
 }
}

Sample Output:
Java Version: 1.8.0_71                                                                                        
Java Runtime Version: 1.8.0_71-b15                                                                            
Java Home: /opt/jdk/jdk1.8.0_71/jre                                                                           
Java Vendor: Oracle Corporation                                                                               
Java Vendor URL: http://java.oracle.com/                                                                      
Java Class Path: .