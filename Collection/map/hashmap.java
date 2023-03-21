Without duplicate keys:

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> stud = new HashMap<Integer,String>();
		stud.put(3601,"Sam");
		stud.put(3602,"Ram");
		stud.put(3603,"Tom");
		stud.put(3604,"Sam");
		System.out.println(stud);
	}

}

OUTPUT
{3601=Sam, 3602=Ram, 3603=Tom, 3604=Sam}


With duplicate keys:

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> stud = new HashMap<Integer,String>();
		stud.put(3601,"Sam");
		stud.put(3602,"Ram");
		stud.put(3603,"Tom");
		stud.put(3603,"Sam");
		System.out.println(stud);
	}

}

OUTPUT
{3601=Sam, 3602=Ram, 3603=Sam} // assigns the last value to the key as there should not any duplicates in the key
