public class StaticVar{
	static final int x4 = prt("final static variable initialized");
	final int x3 = prt("final variable initialized"); //finalû���ر�ĳ�ʼ������
	static int x1 = prt("static variable initialized");//�����ʼ��ǰ�ͳ�ʼ����
	int x2 = prt("variable initialized");//�����ʼ����
	static int prt(String s) {		
		System.out.println(s);
		return 47;
    }
	static void t()
	{
		int i = prt("static method variable initialized");
	}
	
	public static void main(String[] args)
	{
		System.out.println("befor StaticVar initial");
		StaticVar st = new StaticVar();		
	}
}