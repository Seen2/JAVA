import java.io.*;

public class Main{
	public static void main(String []args) throws IOException{
		Pubg p=new Pubg();
		p.zone="warnigle";
		p.noOfPlayers=60;
		p.gameInstant=9;
		Pubg fub=new Pubg();
		fub.zone="WarZone";
		fub.noOfPlayers=100;
		fub.gameInstant=3;

		//Serialization

		FileOutputStream o=new FileOutputStream("SerializeData.txt");
		ObjectOutputStream out=new ObjectOutputStream(o);
		out.writeObject(p);
		out.writeObject(fub);
		out.flush();
		out.close();

		//Deserialization

		FileInputStream i=new FileInputStream("SerializeData.txt");
		ObjectInputStream in=new ObjectInputStream(i);

		try{
			p=(Pubg)in.readObject();
			while(p!=null){
				System.out.println("zone is "+p.zone+" Numbe of players is "+p.noOfPlayers+" Game Instant is"+p.gameInstant);
				p=(Pubg)in.readObject();
			}

			in.close();
		}catch(Exception e){
		}

	}
}
