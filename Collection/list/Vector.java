import java.util.Vector;
class HelloWorld {
    public static void main(String[] args) {
       Vector names = new Vector(3);
		names.add("ram");
		names.add("sam");
		names.add("tom");
		System.out.println(names.capacity());
		names.add("ram");
		names.add("sam");
		names.add("tom");
		System.out.println(names.capacity());
			names.add("ram");
		names.add("sam");
		names.add("tom");
		System.out.println(names.capacity());
    }
}
