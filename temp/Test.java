public class Test
{
    
    {
         System.out.println("blockA");
    }
    static
    {
        System.out.println("blockB");
    }
    public static Test t1 = new Test();
    public static void main(String[] args)
    {
        Test t2 = new Test();
        // staticMethod a= new staticMethod();
     //   a.method2();
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