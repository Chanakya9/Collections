import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
//Website for why we use string[] args
//http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/09/command-args.html

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Set SetA = new LinkedHashSet();
		String element = "Vinay";
		SetA.add(element);
		SetA.add("Chanakya");
		SetA.add("Polareddy");
		SetA.add("Chanakya");
		for(Object s : SetA)
			System.out.println(s);*/ 
		
//Observe that when we use HashSet it doesn't print elements in order		
//All the elements in the set are unique, no duplication present
//add, remove, contains
//If we use LinkedHashSet all the elements exist in the same order as inserted
		
		SortedSet SetA = new TreeSet();
		SetA.add("chan");
		SetA.add("ban");
		SetA.add("tan");
//((TreeSet) SetA).descendingIterator();
		Iterator iterator = SetA.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//	Comparator comparator = new Comparator();
		//SortedSet SetB = new TreeSet();
//sorted set is nothing but sorting the elements in ascending order
NavigableSet SetC = new TreeSet();
SetC.add("Cha");
SetC.add("zz");
SetC.add("aaa");
SetC.add("cc");
Iterator reverse = SetC.descendingIterator();
for(Object o : SetC)
	System.out.println(o);	
//headSet, tailSet and subSet functions
//know about the inclusive element too
System.out.println("********************");
SortedSet Seth = SetC.headSet("aaa");
SortedSet Sett = SetC.tailSet("cc");
SortedSet Sets = SetC.subSet("aaa", "zz");
System.out.println(Seth +" "+Sett);
//pollFirst(),pollLast,ceiling(), floor(),higher(),lower()

System.out.println("ceiling output is "+ SetC.ceiling("cc"));
System.out.println("Floor output is "+ SetC.floor("cc"));
System.out.println("Higher output is "+ SetC.higher("cc"));

Object first = SetC.pollFirst();
Object last = SetC.pollLast();
System.out.println("**********************");
System.out.println(first +" " + last);
System.out.println(SetC);


	}
}
