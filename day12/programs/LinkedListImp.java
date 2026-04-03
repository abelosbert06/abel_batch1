import java.util.*;

public class LinkedListImp{
	public static void main(String[] args){
		List<String> runningRace = new LinkedList<>();
		runningRace.add("a");
		runningRace.add("b");
		runningRace.add("c");
		runningRace.addFirst("race start");
		IO.println(runningRace);
		runningRace.remove("b");
		IO.println("B is disqualified");
		IO.println(runningRace);
		runningRace.addLast("race completed");
		IO.println("A won");
	}
}
