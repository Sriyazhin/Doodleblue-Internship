import java.util.TreeSet;
  public class Vector {
      public static void main(String[] args) {
    	  TreeSet<String> names = new TreeSet<String>();
  		names.add("ram");
  		names.add("sam");
  		names.add("tom");
  		names.add("pin");
  		names.add("sam");
  		System.out.println(names.size());
  		System.out.println(names);
  		System.out.println(names.contains("tom"));
      }
  }

Output
4
[pin, ram, sam, tom]
true
