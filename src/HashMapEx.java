import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//observe how to iterate over values using for and iterator
//Also see the elements are not in order (even insertion)

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map map = new HashMap ();
map.put("chan", 4000);
map.put("reddy", 5000);
map.put("satya", 6000);

int x = (int) map.get("chan");
System.out.println(x);

Iterator iterator = map.keySet().iterator();
while(iterator.hasNext())
{
Object key = iterator.next();
Object value = map.get(key);
System.out.println(key +" "+value);
}
Iterator iterator1 = map.values().iterator();
while(iterator1.hasNext())
{
	Object value = iterator1.next();
	System.out.println("Valus are" +value);
	}
for (Object o : map.keySet()){
	Object value = map.get(o);
System.out.println("I'm coming from for loop "+value);
}

NavigableMap mpa = new TreeMap();
mpa.putAll(map);
NavigableSet reverse = mpa.descendingKeySet();
NavigableMap descending = mpa.descendingMap();
for (Object o : reverse){
	Object value = mpa.get(o);
System.out.println("Yo-Yo sorted map huh "+value);
	}
	}
}
