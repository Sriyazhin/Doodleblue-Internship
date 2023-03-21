import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	

	public static void main(String[] args) {
		HashMap<Integer,String> stud1 = new HashMap<Integer,String>();
		stud1.put(3601,"Sam");
		stud1.put(3242,"Ram");
		stud1.put(5632,"Tom");
		stud1.put(2133,"Sam");
		System.out.println("HashMap"+stud1);
		
		TreeMap<Integer,String> stud2 = new TreeMap<Integer,String>();
		stud2.put(3601,"Sam");
		stud2.put(3242,"Ram");
		stud2.put(5632,"Tom");
		stud2.put(2133,"Sam");
		System.out.println("TreeMap"+stud2);
		
		LinkedHashMap<Integer,String> stud = new LinkedHashMap<Integer,String>();
		stud.put(3601,"Sam");
		stud.put(3242,"Ram");
		stud.put(5632,"Tom");
		stud.put(2133,"Sam");
		System.out.println("LinkedHashMap"+stud);
	}

}

OUTPUT
HashMap{5632=Tom, 3601=Sam, 2133=Sam, 3242=Ram}  // it does not follow any order
TreeMap{2133=Sam, 3242=Ram, 3601=Sam, 5632=Tom}  // it provides output in a sorted way based on the keys
LinkedHashMap{3601=Sam, 3242=Ram, 5632=Tom, 2133=Sam}  // it follows insertion order
