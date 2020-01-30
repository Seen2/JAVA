import java.io.*;

public class _FileInputStream{
	public static void main(String []args) throws IOException{
		FileOutputStream out=new FileOutputStream("fileInputStream.txt");
		String contentToWrite="Hello World \n";
		out.write(contentToWrite.getBytes());
		FileInputStream in=new FileInputStream("fileInputStream.txt");

		int c=in.read();
		while(c!=-1){
			System.out.print((char)c);
			c=in.read();
		}

	}
}
