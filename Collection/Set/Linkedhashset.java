  package collection;
  import java.util.LinkedHashSet;
  public class Vector {
      public static void main(String[] args) {
    	  LinkedHashSet<String> names = new LinkedHashSet<String>();
  		names.add("ram");
  		names.add("sam");
  		names.add("tom");
  		names.add("pin");
  		System.out.println(names.size());
  		System.out.println(names);
  		System.out.println(names.contains("tom"));
      }
  }
  
  output:
  4
[ram, sam, tom, pin]
true
