interface CarEngine{
	static String display(){
		return "vroom";
	}
}


void main(){
	String s = CarEngine.display();
	IO.println(s);
}
