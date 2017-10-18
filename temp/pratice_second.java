public class pratice_second{
	public static void main(String[] args){
		String a="HELLO  WORLD!";
		String b=new String("HELLO  WORLD!");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.length());
		byte byteA=100;
		System.out.println(byteA);
		char charTemp_1='a';
		char charTemp_2='b';
		int i=12;
		System.out.println(i+charTemp_1+charTemp_2);	
		// byte[] bytearrays =null;
		// bytearrays=a.getBytes();
		// for(int i=0;i<bytearrays.length;i++){
		// 	System.out.printf("%c\n",bytearrays[i]);
		// }
		// for(int i=0;i<100000; i++){
		// 	a+=i;
		// }
		// System.out.println(a);
	}
}	