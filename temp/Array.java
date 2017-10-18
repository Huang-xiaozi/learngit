import java.util.*;



public class Array{

	public static void main(String[] args){
		int[] list_1={1,2,5,3,9,0,6,10,100,1000,900};
		float list_2[]=null;
		Random rand=new Random();
		list_2	= new float	[5];
		for(int i=0;i<list_2.length;i++){
			list_2[i] = rand.nextFloat()*100+1;
		}

		Arrays.sort(list_1);
		Arrays.sort(list_2);
		// PrintArrayInt(list_1);
		// System.out.println("");
		// PrintArrayFloat(list_2);
		PrintArrayInt sortint= new PrintArrayInt(list_1);
		System.out.println("");
		PrintArrayFloat sortfloat= new PrintArrayFloat(list_2);
	}

}



class  PrintArrayInt{

	PrintArrayInt(int array[]){
		for(int i=0;i<array.length;i++){

			System.out.printf(array[i] + "        ");
		}
	}
}
class  PrintArrayFloat{

	PrintArrayFloat(float array[]){
		for(int i=0;i<array.length;i++){

			System.out.printf("        "+array[i] );
		}
	}
}