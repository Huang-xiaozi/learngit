class Clerk {
    int c_ClerkNo;//ְԱ��
    String c_ClerkName;//ְԱ����
    double c_ClerkSalary;//����
    static int c_NextClerkNo=1000;//��һ��ְԱ��
    
    static double c_LowSalary=280;//��4-11
    
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
  Clerk objclerk1=new Clerk("����",892.5);
  Clerk objclerk2=new Clerk("����",1025.8);
  
  String aName=new String("����");
  Clerk objclerk3=new Clerk(aName,2000);
  
  System.out.println("����:"+objclerk1.c_ClerkName+"���:"+objclerk1.c_ClerkNo+"����:"+objclerk1.c_ClerkSalary);
  System.out.println("����:"+objclerk2.c_ClerkName+"���:"+objclerk2.c_ClerkNo+"����:"+objclerk2.c_ClerkSalary);
  System.out.println("����:"+objclerk3.c_ClerkName+"���:"+objclerk3.c_ClerkNo+"����:"+objclerk3.c_ClerkSalary);
  
  System.out.println("��͹���:ְԱ1="+objclerk1.c_LowSalary);
  System.out.println("��͹���:ְԱ2="+objclerk2.c_LowSalary);
 
  Clerk.c_LowSalary=330;
 
  System.out.println("����Ժ�");
  System.out.println("��͹���:ְԱ1="+objclerk1.c_LowSalary);
  System.out.println("��͹���:ְԱ2="+objclerk2.c_LowSalary);
 }
}