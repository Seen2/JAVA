import java.io.*;

public class _FileOutputStream{
	public static void main(String []args) throws IOException{
		FileOutputStream out=new FileOutputStream("fileOutputStream.txt");
		String contentToWrite="Hello World \n";
		out.write(contentToWrite.getBytes());

	}
}
