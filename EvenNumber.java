import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	
	public static void main(String[] args) {
		
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(11);
	list.add(12);
	list.add(13);
	list.add(14);
	
	List<Integer> evenNumber=list.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println(evenNumber);
	
	}

}
