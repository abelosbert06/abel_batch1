void main(){
	
	//prints true because java caches Integer objects with values -128 to 127
	//so both x and y point to the same object in the memory
	Integer x = 10;
	Integer y = 10;
	IO.println(x == y);
	
	//prints false because value higher than 127
	Integer a = 200;
	Integer b = 200;
	IO.println(a == b);
	
	//since there is no pre caching for Float objects, c and d point to different objects in the memory
	//prints false
	Float c = 127.5f;
	Float d = 127.5f;
	IO.println(c == d);
}
