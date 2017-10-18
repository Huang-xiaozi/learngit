class Outer{
	private String info = "Hello World !!";
	class inner{
		 int num;
		inner(int num){
			this.num =num;
		}
		public void print(){
			System.out.println(info);

		}
	}
	Outer(String s){
		info = s + info;
	}
}
public class innerClassDemo{
	public static void main(String[] args){
		Outer out1=new Outer("out1--->");
		Outer out2=new Outer("out2--->");
		Outer.inner in1=out1.new inner(1);
		Outer.inner in2=out2.new inner(2);


		in1.print();
		in2.print();
		System.out.println(in1.num);
		System.out.println(in2.num);
		// System.out.println(out1.num);
		// System.out.println(out2.inner.num);
	}
}