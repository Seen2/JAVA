import java.util.*;

class EmployeeSort implements Comparable<EmployeeSort>{
	public int id;
	public String name;
	public int age;


	public int compareTo(EmployeeSort obj){
		if(this.id==obj.id) return 0;
		else if(this.id>obj.id) return 1;
		else return -1;
	}

	public String toString(){
		return "Id="+this.id+" Name="+this.name+" Age="+this.age;
	}


}

public class Employee{
	public static void main(String []args){
		EmployeeSort e=new EmployeeSort();
		e.id=123;
		e.name="Srivas";
		e.age=21;
		EmployeeSort e1=new EmployeeSort();
		e1.id=121;
		e1.name="Srivas";
		e1.age=21;
		System.out.println(e1.equals(e));
		System.out.println(e);
		System.out.println(e1);



	}
}
