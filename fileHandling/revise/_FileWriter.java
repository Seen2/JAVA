import java.io.*;
public class _FileWriter{
public static void main(String []args)throws IOException{ 
	FileWriter out=new FileWriter("fileWriter.txt");
	String contentToWrite="Hello World!!\n";
	out.write(contentToWrite);
	out.close();
	}
}
