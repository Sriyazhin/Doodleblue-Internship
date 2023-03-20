import java.util.HashSet;
  public class Vector {
      public static void main(String[] args) {
         HashSet<String> names = new HashSet<String>();
  		names.add("ram");
  		names.add("sam");
  		names.add("tom");
  		names.add("pin");
  		System.out.println(names.size());
  		System.out.println(names);
  		System.out.println(names.contains("tom"));
