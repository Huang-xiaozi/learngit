class Clerk {
    int c_ClerkNo;//职员号
    String c_ClerkName;//职员姓名
    double c_ClerkSalary;//工资
    static int c_NextClerkNo=1000;//下一个职员号
    
    static double c_LowSalary=280;//例4-11
    
    public Clerk(String name,double salary) {
     c_ClerkNo=++c_NextClerkNo;
     c_ClerkNo=c_NextClerkNo++;
     
     c_ClerkName=new String(name);
     c_ClerkName=name;
     
     c_ClerkSalary=salary;
    }    
}
public class InstanceClerk
{
 public static void main(String[] args)
 {
  Clerk objclerk1=new Clerk("张三",892.5);
  Clerk objclerk2=new Clerk("李四",1025.8);
  
  String aName=new String("王五");
  Clerk objclerk3=new Clerk(aName,2000);
  
  System.out.println("姓名:"+objclerk1.c_ClerkName+"编号:"+objclerk1.c_ClerkNo+"工资:"+objclerk1.c_ClerkSalary);
  System.out.println("姓名:"+objclerk2.c_ClerkName+"编号:"+objclerk2.c_ClerkNo+"工资:"+objclerk2.c_ClerkSalary);
  System.out.println("姓名:"+objclerk3.c_ClerkName+"编号:"+objclerk3.c_ClerkNo+"工资:"+objclerk3.c_ClerkSalary);
  
  System.out.println("最低工资:职员1="+objclerk1.c_LowSalary);
  System.out.println("最低工资:职员2="+objclerk2.c_LowSalary);
 
  Clerk.c_LowSalary=330;
 
  System.out.println("提高以后");
  System.out.println("最低工资:职员1="+objclerk1.c_LowSalary);
  System.out.println("最低工资:职员2="+objclerk2.c_LowSalary);
 }
}