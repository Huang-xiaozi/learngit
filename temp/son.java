//package temp;

class Father{
	static int x1 = ptr("static Father.x1  print");
	int i =ptr("Father.i print");
	int j =ptr("Father.j print");
	Father(){
		System.out.println("i="+i + ", j=" + j);
		j=39;
	};
	 static  int ptr(String s){
		System.out.println(s);
		return 43;
	}
}

public class son extends Father{
	static int x2=ptr("static son.x2 print");
	int k=ptr("son.k print");
	son(){

		System.out.println("k=" + k);
		System.out.println("j=" + j);

	}
	static  int ptr (String s){

		System.out.println(s);
		return  69;
	}
	public static void main(String[] args){

	ptr("main  start print");
	son a = new son();
	//a.ptr("hello world!");
}
}

