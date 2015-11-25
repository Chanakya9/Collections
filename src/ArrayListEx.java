import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Lists for adding elements,remove elements, clear function
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Comparable> list = new ArrayList<Comparable>();
	list.add("Remo");
	list.add("Ramu");
	list.add("Aparichith");
	//list.add(index,element) places the element in that index and pushes 
	//the element to the next index
	list.add(2, 4);
	//list.set(index,element) to replace the value in list
	list.add(3, 5);
	list.add(new Integer(5));
	list.remove(0);
	list.remove("Ramu");
	//System.out.println("Length of list is "+list.length());
	System.out.println(list.size());
	//typeof(list);
	//System.out.println(list.get(1));
	
	//Iteration Using for loop
	list.clear();
	for(Object o : list){
		System.out.println(o);
	}
	list.clear();
	System.out.println(list.size());
	//You can iterate by adding iterator to list 
	Iterator iterator = list.iterator();
	while(iterator.hasNext()){
		System.out.println("value is "+iterator.next());
		
	}
	}}