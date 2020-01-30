import java.io.*;
public class _FileReader{
public static void main(String []args)throws IOException{ 
	FileWriter out=new FileWriter("fileReader.txt",true);
	String contentToWrite="Hello World!!\n";
	out.write(contentToWrite);
	out.close();

	FileReader in=new FileReader("fileReader.txt");
	int c;
	while((c=in.read())!=-1){
		System.out.print((char)c);
	}


	}
}
