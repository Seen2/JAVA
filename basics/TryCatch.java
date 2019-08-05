import java.io.*;

public class TryCatch{

	public static void main(String[] args) {
		
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			String s;
			s=br.readLine();
			while(!s.equals("")) {
				System.out.println(s.length());
				s=br.readLine();
				if(s.equals("-0")) {
					
					System.exit(0);
				}
				
			}
		}catch(Exception e) {
			System.out.println("Exception is "+e);
		}
			
		
	}
}
