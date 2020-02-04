import java.util.*;
import java.util.stream.*;
//sream doesn't effect the original data
public class StreamDemo{
	public static void main(String []args){
		List<Integer> numbers=Arrays.asList(1,1,3,4,2,3,2,3,4,5,6,7,8,9,0);
		//creating a Stream
		Stream strm=numbers.stream();
		//fetch the distinct elements and return a new stream
		Stream stream=strm.distinct();
		//The collect method is used to get List Map or Set from a Stream
		List<Integer> distinctList=(List<Integer>)stream.collect(Collectors.toList());

		for(int element:distinctList) System.out.print(element);
		System.out.println("");
		//stream can be operated only once
		Stream s=numbers.stream();
		//limiting elements and return a new stream
		stream=s.limit(3);
		//The collect method is used to get List Map or Set from a Stream
		List<Integer> limitList=(List<Integer>)stream.collect(Collectors.toList());

		for(int element:limitList) System.out.print(element);
		System.out.println("");

		//filtering
		List<String> strList=Arrays.asList("Alice","Bob","Charllie","Dayan","Alice","","");

		long count=strList.stream().filter(string->string.isEmpty()).count();
		System.out.println(count);
		List<String> elements=strList.stream().filter(string->string.equals("Alice")).collect(Collectors.toList());
		for(String element:elements)System.out.println(element);

		

	}
}
