import java.util.*;

void main(){
	var words = new ArrayList<String>(Arrays.asList("cake", "banana", "muskmelon", "watermelon"));
	Collections.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
	words.forEach(IO::println);	
}
