public class StaticVar{
	static final int x4 = prt("final static variable initialized");
	final int x3 = prt("final variable initialized"); //final没有特别的初始化特征
	static int x1 = prt("static variable initialized");//对象初始化前就初始化了
	int x2 = prt("variable initialized");//对象初始化中
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