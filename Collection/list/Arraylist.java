Collections are like containers that group multiple items in a single unit. For example, a jar of chocolates, a list of names, etc.
  It consists of List, Queue, Set.
  
  List:
1. ArrayList
2. Vector
3. Set


ArrayList:
It is similar to array is storing data. However, we can store but in unlimited times. It uses dynamic array for storing elements and maintains insertion order.
  
import java.util.ArrayList;
public class Arraylist {

	
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Aravind");
		name.add("Adhi");
		name.add("Ram");
		System.out.println(name);
		name.add(0,"Harini");
		name.add(4,"Abi");
		System.out.println(name.size());
		System.out.println(name);
		System.out.println(name.get(3));
		name.remove(3);
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.isEmpty());
		name.clear();
		System.out.println(name.size());
		System.out.println(name.isEmpty());
	}

}
