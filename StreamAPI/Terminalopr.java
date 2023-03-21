import java.util.Arrays;
import java.util.List;

public class Terminalopr {

	public static void main(String[] args) {
		List<Integer> a= Arrays.asList(1,4,2,8,5,9);
1. 		Object arr[]=a.stream().toArray();
		System.out.println(arr[4]);
	}

}
OUTPUT
5

2.  List<Integer> a= Arrays.asList(9,4,2,8,4,1);
		a.stream().collect(Collectors.toSet()).forEach(System.out::println);

OUTPUT
1
2
4
8
9

3. List<Integer> a= Arrays.asList(9,4,2,8,4,1);
		System.out.println(a.stream().count());

OUTPUT
6

4. List<Integer> a= Arrays.asList(9,4,2,8,4,1);
		System.out.println(a.stream().reduce(1,(x,y)->(x*y)));

OUTPUT
2304

5. List<Integer> a= Arrays.asList(9,4,2,8,4,1);
		a.stream().forEach(System.out::println);

OUTPUT
9
4
2
8
4
1

6. List<Integer> a= Arrays.asList(3,2,8,4,9);
		System.out.println(a.stream().min((c,b)->(c-b)));

OUTPUT
Optional[2]

7. List<Integer> a= Arrays.asList(3,2,8,4,9);
		System.out.println(a.stream().max((c,b)->(c-b)));

OUTPUT
Optional[9]

8. List<Integer> a= Arrays.asList(3,2,8,4,9);
		System.out.println(a.stream().anyMatch(b->b==3));

OUPUT
true

9. List<Integer> a= Arrays.asList(3,2,8,4,9);
		System.out.println(a.stream().allMatch(b->b==3));

OUTPUT
false

List<Integer> a= Arrays.asList(3,3,3,3,3);
		System.out.println(a.stream().allMatch(b->b==3));
OUTPUT
true

10. List<Integer> a= Arrays.asList(3,5,2,9,6,1);
		System.out.println(a.stream().noneMatch(b->b==7));

OUTPUT
true

11. List<Integer> a= Arrays.asList(3,5,2,9,6,1);
		System.out.println(a.stream().findAny().get());

OUTPUT
3

12. List<Integer> a= Arrays.asList(3,5,2,9,6,1);
		System.out.println(a.stream().findFirst().get());

OUTPUT
3 
