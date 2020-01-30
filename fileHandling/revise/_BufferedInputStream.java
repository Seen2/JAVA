import java.io.*;

public class _BufferedInputStream{
	public static void main(String args[]) throws IOException{
		FileOutputStream o=new FileOutputStream("bufferedInputStream.txt");
		BufferedOutputStream out=new BufferedOutputStream(o);
		String contentToWrite="Hello World\n";
		out.write(contentToWrite.getBytes());
		FileInputStream i=new FileInputStream("bufferedInputStream.txt");
		out.close();
		BufferedInputStream in=new BufferedInputStream(i);

		int c=in.read();
		while(c!=-1){
			System.out.print((char)c);
			c=in.read();
		}

		in.close();

	}
}
