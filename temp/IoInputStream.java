import java.io.*;

public class IoInputStream{
	public static void main(String[] args ){
		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		try{
//		InputStream fin = new FileInputStream(file1);
//		OutputStream fou= new FileOutputStream(file2);


		FilterInputStream fin = new BufferedInputStream(new FileInputStream(file1));
		OutputStream fou= new FileOutputStream(file2);
		int c;
		int i=0;

			while((c=fin.read())!=-1){
				i++;
				fou.write(c);
				System.in.read();
				System.out.println("第" + i + "次写入");
			}

		fin.close();
		fou.close();
		}catch( FileNotFoundException e){
			System.out.println("异常产生：" + e);
		}catch(Exception e){
			System.out.println("异常产生：" + e);
		}

	}
}