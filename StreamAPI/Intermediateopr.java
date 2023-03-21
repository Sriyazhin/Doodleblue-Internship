import java.util.Arrays;
import java.util.List;

public class Intermediate {

	public static void main(String[] args) {
		List<String> a= Arrays.asList("ram","sam","tom");
1.		a.stream().filter(e->e=="sam").forEach(System.out::println);
    
	}
}
OUTPUT
sam

2. a.stream().filter(e->e=="sam").map(b->"after filtering: "+b).forEach(System.out::println);

OUTPUT
after filtering: sam

3. a.stream().flatMap(b->Stream.of(b.charAt(1))).forEach(System.out::println);

OUTPUT
a
a
o

4. List<String> a= Arrays.asList("sam","sam","tom");
		a.stream().distinct().forEach(System.out::println);

OUTPUT
sam
tom

5. List<String> a= Arrays.asList("venu","tom","ram");
		a.stream().sorted().forEach(System.out::println);

OUTPUT
ram
tom
venu

6. List<String> a= Arrays.asList("venu","tom","ram");
		a.stream().peek(System.out::println).findFirst();

OUTPUT
venu

7. List<String> a= Arrays.asList("venu","tom","ram");
		a.stream().limit(2).forEach(System.out::println);

OUTPUT
venu
tom

8. List<String> a= Arrays.asList("venu","tom","ram");
		a.stream().skip(2).forEach(System.out::println);

OUTPUT
ram
