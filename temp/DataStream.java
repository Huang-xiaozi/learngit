import java.io.*;

public class DataStream{  
	public static void main(String args[])throws  IOException{ 
		FileOutputStream fos=new FileOutputStream("file2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream (bos);
		try{
			dos.writeBoolean(true);
			dos.writeByte((byte)123);
			dos.writeChar('J');
			dos.writeDouble(3.141592654);
			dos.writeFloat(2.7182f);
			dos.writeInt(1234567890);
			dos.writeLong(998877665544332211L);
			dos.writeShort((short)11223);
		}catch(Exception e) {
			System.err.println("FileStreamsTest: "+e);
		}
		finally{  
			dos.close(); 
		}	
		System.in.read();
		//BufferedInputStream dis = new BufferedInputStream(new DataInputStream(new FileInputStream("file2.txt")));
		DataInputStream dis=new DataInputStream(new FileInputStream("file2.txt"));
		try{
			System.out.println("\t "+dis.readBoolean());
			System.out.println("\t "+dis.readByte());
			System.out.println("\t "+dis.readChar());
			System.out.println("\t "+dis.readDouble());
			System.out.println("\t "+dis.readFloat());
			System.out.println("\t "+dis.readInt());
			System.out.println("\t "+dis.readLong());
			System.out.println("\t "+dis.readShort());
		}finally{
			dis.close();
		}	
	}
}
