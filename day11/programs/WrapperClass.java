public class WrapperClass {
	public static void main(String[] args){

		//primitive data type to wrapper object
		int a = 10;
		IO.println(a);
		Integer obj = Integer.valueOf(a);
		IO.println(obj);
		IO.println(a == obj);
		Integer obj2 = 10;
		IO.println(obj2);

		//hashcode
		IO.println(obj.hashCode());
		IO.println(obj2.hashCode());

		//object to primitive data type
		Character ch = 'a';
		char b = ch.charValue();
		IO.println(ch);
	}
}
