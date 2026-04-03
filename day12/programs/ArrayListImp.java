import java.util.*;

public class ArrayListImp{
	public static void main(String[] args){
		List<Integer> arr = new ArrayList<>();
		arr.add(null);
		arr.add(10);
		arr.add(20);
		IO.println(arr);
		arr.set(0, 5);
		IO.println(arr);
		arr.add(0, 35);
		IO.println(arr);
		IO.println(arr.get(1));
		arr.remove(3);
		IO.println(arr);
		IO.println(arr.contains(20));
		IO.println(arr.size());
		arr.add(0);
		arr.indexOf(0);
		arr.clear();
		IO.println(arr.isEmpty());
	}
}
