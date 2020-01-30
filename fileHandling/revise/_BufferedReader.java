import java.io.*;
public class _BufferedReader{
public static void main(String []args)throws IOException{
	FileWriter o=new FileWriter("buffferReader.txt");
	BufferedWriter out=new BufferedWriter(o);
	String contentToWrite="Hello World!!\n";
	out.write(contentToWrite);
	out.close();

	FileReader i= new FileReader("buffferReader.txt");
	BufferedReader in=new BufferedReader(i);
	String line=in.readLine();
	while(line!=null){
		System.out.println(line);
		line=in.readLine();

	}
	in.close();
	}
}
