// public class Test
// {
    
//     {
//          System.out.println("blockA");
//     }
//     static
//     {
//         System.out.println("blockB");
//     }
//     public static Test t1 = new Test();
//     public static void main(String[] args)
//     {
//         Test t2 = new Test();
//         // staticMethod a= new staticMethod();
//      //   a.method2();
//     }
//  }

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;


public class Test {


public static void main(String[] args) throws Exception {
File file = new File("D:\\Git\\learngit\\temp\\file1.txt");
    Reader r=new FileReader(file);
    BufferedReader br=new BufferedReader(r);
    String str="";
        while((str=br.readLine())!=null){
    System.out.println(str);
    System.out.println(1);
    }
    br.close();
    r.close();
    
    Scanner in = new Scanner(System.in);
    str = in.nextLine();
    System.out.println(str);
    str = in.nextLine();
    System.out.println(str);
    str = in.nextLine();
    System.out.println(str);  
       }
}

 // class staticMethod{
 //    {System.out.println("Test to print  1");}

 //    static void method1(){
 //        method2();
 //        System.out.println("method1");
 //    }
 //    static void method2(){
 //        System.out.println("Test to print");
 //    }
 //    staticMethod(){
 //        method2();
 //        System.out.println("staticMethod");
 //    }
 // }