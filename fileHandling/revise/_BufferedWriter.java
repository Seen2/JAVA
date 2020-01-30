import java.io.*;
public class _BufferedWriter{
public static void main(String []args)throws IOException{
	FileWriter o=new FileWriter("buffferWriter.txt");
	BufferedWriter out=new BufferedWriter(o);
	String contentToWrite="Hello World!!\n";
	out.write(contentToWrite);
	out.close();
	}
}
